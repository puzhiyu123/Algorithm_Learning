/*
   The Alrithmetic Calculations in Java can also be implemented in the following way

   Imagine we have an exampe calculation: (1 + ( ( 2 + 3 ) * ( 4 * 5 ) ) )

   the Dijkstra's Two-Stack Algorithm is described in the following way

   1. Push operands onto the operand stack

   2. Push operators onto the operator stack

   3. Ignore the left parentheses

   4. When encounter the right parentheses, pop an operator, pop the requisite number
        of operands, and push onto the operand stack the result of applying that
        operation to those operands

 */


class twoStack {
    public static void main(String args)
    {
        Stack<String> ops = new Stack<String>();
        Stack<Double> vals = new Stack<Double>();
        while (!StdIn.isEmpty())
        {
            // read the token, push if operator
            String s = StdIn.readString();
            if (s.equals("("));
            else if (s.equals("+"))
                ops.push(s);
            else if (s.equals("-"))
                ops.push(s);
            else if (s.equals("*"))
                ops.push(s);
            else if (s.equals("/"))
                ops.push(s);
            else if (s.equals("sqrt"))
                ops.push(s);
            else if (s.equals(")")) // refer to the above step, when reach the right parentheses we use pop
            {
                String op = ops.pop();
                double v = vals.pop();
                if (op.equals("+"))
                    v = vals.pop() + v;
                if (op.equals("-"))
                    v = vals.pop() - v;
                if (op.equals("*"))
                    v = vals.pop() * v;
                if (op.equals("/"))
                    v = vals.pop() / v;
                if (op.equals("sqrt"))
                    v = Math.sqrt(v);
                vals.push(v);
            }
            // Token not operator or paren: push the double value
            else vals.push(Double.parseDouble(s));
        }
        StdOut.println(vals.pop());
    }
}