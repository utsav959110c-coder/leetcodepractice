class Solution {
    public int numUniqueEmails(String[] emails) {
        HashSet<String> uniqueEmail = new HashSet<String>();

        for (String str : emails) {
            String validEmail = " ";
            int i = 0;

            while (i < str.length()) {
                char ch = str.charAt(i);

                if (ch == '.') {
                    i++;
                    continue;
                }
                else if (ch == '@') {
                    break;
                }
                else if (ch == '+') {
                    while (ch != '@') {
                        i++;
                        ch = str.charAt(i);
                    }
                    break;
                }
                else {
                    validEmail = validEmail + ch;
                }

                i++;
            }

            while (i < str.length()) {
                validEmail = validEmail + str.charAt(i);
                i++;
            }

            uniqueEmail.add(validEmail);
        }

        return uniqueEmail.size();
    }
}
