import operator
import re

def evaluate_infix(expression):
    postfix_expression = infix_to_postfix(expression)
    result = evaluate_postfix(postfix_expression)
    return result

def infix_to_postfix(expression):
    precedence = {'+': 1, '-': 1, '*': 2, '/': 2, '^': 3}
    operators = []
    postfix = []
    tokens = re.findall(r'\d+|\(|\)|[+\-*/^]', expression)
    
    for token in tokens:
        if token.isdigit():
            postfix.append(token)
        elif token == '(':
            operators.append(token)
        elif token == ')':
            while operators and operators[-1] != '(':
                postfix.append(operators.pop())
            operators.pop()
        else:
            while operators and precedence[token] <= precedence.get(operators[-1], 0):
                postfix.append(operators.pop())
            operators.append(token)
    
    while operators:
        postfix.append(operators.pop())
    
    return ' '.join(postfix)

def evaluate_postfix(expression):
    stack = []
    operators = {
        '+': operator.add,
        '-': operator.sub,
        '*': operator.mul,
        '/': operator.truediv,
        '^': operator.pow
    }
    tokens = expression.split()
    
    for token in tokens:
        if token.isdigit():
            stack.append(float(token))
        elif token in operators:
            operand2 = stack.pop()
            operand1 = stack.pop()
            result = operators[token](operand1, operand2)
            stack.append(result)
    
    return stack[0] if stack else None

while True:
    print('''
========= Menu =========
1. Notasi infiks
2. Notasi postfix
3. Berhenti
    ''')

    user = input('Pilih menu 1/2/3: ')

    if user == '1':
        # Contoh penggunaan dengan notasi infiks
        result_infix = evaluate_infix(input('Hitung Bilangan: '))
        print('Hasil: ', result_infix)  # Output: 14.0
    elif user == '2':
        # Contoh penggunaan dengan notasi postfix
        result_postfix = evaluate_postfix(input('Hitung Bilangan: '))
        print('Hasil: ', result_postfix)  # Output: 14.0
    else:
        break