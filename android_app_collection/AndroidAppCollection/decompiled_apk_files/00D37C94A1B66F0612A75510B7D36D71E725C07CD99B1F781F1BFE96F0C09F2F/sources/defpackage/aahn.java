package defpackage;
/* compiled from: PG */
/* renamed from: aahn  reason: default package */
/* loaded from: classes.dex */
public final class aahn {
    public final String a;
    public final Class b;
    public final amuk c;
    public final amuk d;

    public aahn(String str, Class cls, amuk amukVar, amuk amukVar2) {
        aqxo.p(!str.startsWith("QT_") ? false : str.matches("\\w+"));
        if (((amxx) amukVar2).c > 0) {
            aahp aahpVar = (aahp) amukVar2.get(0);
            throw null;
        }
        this.a = str;
        this.b = cls;
        this.c = amukVar;
        this.d = amukVar2;
    }

    public static aahm a(Class cls, String str) {
        return new aahm(cls, str);
    }

    public final void b(vou vouVar) {
        vouVar.b(this.a);
    }

    public final void c(aaho aahoVar) {
        aqxo.p(this.c.contains(aahoVar));
    }
}
