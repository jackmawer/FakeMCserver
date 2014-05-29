package me.vemacs.fakemcserver;

public class Message {
    public String text;

    public boolean bold;
    public boolean italic;
    public boolean underlined;
    public boolean strikethrough;
    public boolean obfuscated;

    public Color color;

    public ClickEvent clickEvent;

    public Message() {

    }

    public Message(Message old) {
        this.bold = old.bold;
        this.italic = old.italic;
        this.underlined = old.underlined;
        this.strikethrough = old.strikethrough;
        this.color = old.color;
    }
}
