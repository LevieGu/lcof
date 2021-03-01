public class offer_05 {

    /**
     * 替换空格
     * 链接：https://leetcode-cn.com/problems/ti-huan-kong-ge-lcof/
     * 在 Java 中，字符串是不可变类型，故不能在字符串上进行修改
     * @param s 需要替换的字符
     * @return 被替换后的字符
     */
    public String replaceSpace(String s) {
        StringBuilder stringBuffer = new StringBuilder();
        for(int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            if(ch == ' ') {
                stringBuffer.append("%20");
            } else {
                stringBuffer.append(ch);
            }
        }
        return stringBuffer.toString();
    }

}
