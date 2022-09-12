package com.spotify.protocol.types;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class Message implements Item {
    @dgto(a = "message")
    public final String message;

    private Message() {
        this(null);
    }

    public Message(String str) {
        this.message = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        String str = this.message;
        String str2 = ((Message) obj).message;
        return str != null ? str.equals(str2) : str2 == null;
    }

    public int hashCode() {
        String str = this.message;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        String str = this.message;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 19);
        sb.append("Message{message='");
        sb.append(str);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }
}
