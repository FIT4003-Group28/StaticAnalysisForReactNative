package defpackage;
/* compiled from: PG */
/* renamed from: aket  reason: default package */
/* loaded from: classes.dex */
public enum aket {
    LIGHT("Light", 300),
    REGULAR("Regular", 400),
    MEDIUM("Medium", 500),
    SEMIBOLD("SemiBold", 600),
    BOLD("Bold", 700),
    EXTRABOLD("ExtraBold", 800),
    BLACK("Black", 900);
    
    final String h;
    final int i;

    aket(String str, int i) {
        this.h = str;
        this.i = i;
    }

    public static ampq a(String str, String str2) {
        aket[] values;
        for (aket aketVar : values()) {
            String str3 = aketVar.h;
            StringBuilder sb = new StringBuilder(str2.length() + 1 + String.valueOf(str3).length());
            sb.append(str2);
            sb.append("-");
            sb.append(str3);
            if (str.equals(sb.toString())) {
                return ampq.j(aketVar);
            }
        }
        return amon.a;
    }
}
