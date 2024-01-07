class Solution:
    def countAndSay(self, n: int) -> str:
        if n == 1:
            return "1"

        prev_str = self.countAndSay(n - 1)
        result = ""
        count = 1

        for i in range(1, len(prev_str)):
            if prev_str[i] == prev_str[i - 1]:
                count += 1
            else:
                result += str(count) + prev_str[i - 1]
                count = 1

        result += str(count) + prev_str[-1]
        return result
        