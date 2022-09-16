package defpackage;
/* compiled from: PG */
/* renamed from: ajpo  reason: default package */
/* loaded from: classes.dex */
public class ajpo extends ymg {
    private final String a = "th";
    private final String b;
    private final int d;

    public ajpo(String str, String str2, int i) {
        this.b = str2;
        this.d = i;
    }

    public int a() {
        return this.d;
    }

    public String b() {
        String str = this.a;
        int a = a();
        String str2 = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 11 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(a);
        sb.append(str2);
        return sb.toString();
    }
}
