package defpackage;
/* compiled from: PG */
/* renamed from: eamz  reason: default package */
/* loaded from: classes6.dex */
public enum eamz {
    NOT_AVAILABLE(null),
    START_OBJECT("{"),
    END_OBJECT("}"),
    START_ARRAY("["),
    END_ARRAY("]"),
    FIELD_NAME(null),
    VALUE_EMBEDDED_OBJECT(null),
    VALUE_STRING(null),
    VALUE_NUMBER_INT(null),
    VALUE_NUMBER_FLOAT(null),
    VALUE_TRUE("true"),
    VALUE_FALSE("false"),
    VALUE_NULL("null");
    
    public final String n;
    final char[] o;
    final byte[] p;

    eamz(String str) {
        if (str == null) {
            this.n = null;
            this.o = null;
            this.p = null;
            return;
        }
        this.n = str;
        char[] charArray = str.toCharArray();
        this.o = charArray;
        int length = charArray.length;
        this.p = new byte[length];
        for (int i = 0; i < length; i++) {
            this.p[i] = (byte) this.o[i];
        }
    }
}
