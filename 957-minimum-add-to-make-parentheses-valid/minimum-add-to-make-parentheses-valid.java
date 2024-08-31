class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> stack = new Stack<>();
        int unmatchedClosing = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                if (!stack.isEmpty()) {
                    stack.pop();
                } else {
                    // There's a closing parenthesis with no matching opening parenthesis
                    unmatchedClosing++;
                }
            }
        }

        // The number of unmatched opening parentheses is stack.size()
        return stack.size() + unmatchedClosing; 
    }
}