def input = System.console().readLine 'What is the input string? '
def length = input.length()
if (length == 0)
    println "Input cannot be blank!"
else
    println "$input has $length characters."