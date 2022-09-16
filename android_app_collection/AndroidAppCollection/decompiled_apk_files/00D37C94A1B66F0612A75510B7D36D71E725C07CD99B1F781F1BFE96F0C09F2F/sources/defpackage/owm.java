package defpackage;
/* compiled from: PG */
/* renamed from: owm  reason: default package */
/* loaded from: classes4.dex */
public abstract class owm {
    public final long d;
    public final ovm e;
    public final long f;
    public final String g;
    public final String h;
    public final owj i;

    public abstract ovy h();

    public abstract owj i();

    public owm(String str, long j, ovm ovmVar, String str2, ows owsVar, String str3) {
        this.d = j;
        this.e = ovmVar;
        if (str3 == null) {
            String str4 = ovmVar.a;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 22 + str4.length());
            sb.append(str);
            sb.append(".");
            sb.append(str4);
            sb.append(".");
            sb.append(j);
            str3 = sb.toString();
        }
        this.h = str3;
        this.i = owsVar.e(this);
        this.f = pcx.i(owsVar.h, 1000000L, owsVar.g);
        this.g = str2;
    }
}
