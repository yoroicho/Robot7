/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package robot7;

/**
 *
 * @author kyokuto
 */
public class Member {

    /**
     * @return the lineNumber
     */
    public int getLineNumber() {
        return lineNumber;
    }

    /**
     * @param lineNumber the lineNumber to set
     */
    public void setLineNumber(int lineNumber) {
        this.setLineNumber((Integer) lineNumber);
    }

    private Integer lineNumber;
    private String passFlag;
    private String text;

    public Member(Integer lineNuber, String passFlag, String text) {
        this.lineNumber = lineNuber;
        this.passFlag = passFlag;
        this.text = text;
    }



    /**
     * @return the passFlag
     */
    public String getPassFlag() {
        return passFlag;
    }

    /**
     * @return the text
     */
    public String getText() {
        return text;
    }



    /**
     * @param passFlag the passFlag to set
     */
    public void setPassFlag(String passFlag) {
        this.passFlag = passFlag;
    }

    /**
     * @param text the text to set
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * @param lineNumber the lineNumber to set
     */
    public void setLineNumber(Integer lineNumber) {
        this.lineNumber = lineNumber;
    }



}
