package defpackage;
/* compiled from: PG */
/* renamed from: max  reason: default package */
/* loaded from: classes7.dex */
final class max implements Runnable {
    final /* synthetic */ may a;
    private final String b;
    private final String c;
    private final int d;
    @dzsi
    private final ckhf e;

    public max(may mayVar, String str, String str2, int i, int i2) {
        this.a = mayVar;
        this.b = str;
        this.c = str2;
        this.d = i2;
        switch (i) {
            case 61953:
                this.e = ckee.W;
                return;
            case 61954:
                this.e = ckee.Y;
                return;
            case 61955:
            case 61957:
            case 61958:
            default:
                this.e = null;
                return;
            case 61956:
                this.e = ckee.V;
                return;
            case 61959:
                this.e = ckee.X;
                return;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        ckhf ckhfVar = this.e;
        if (ckhfVar != null) {
            kty.a(this.a.d, ckhfVar);
        }
        cjtd a = cjtd.a(this.a.b);
        may mayVar = this.a;
        cjqm j = mayVar.a.j(mayVar.u().d(a), a);
        may mayVar2 = this.a;
        astd s = aste.s();
        assw asswVar = (assw) s;
        asswVar.a = j.a().f();
        asswVar.b = this.c;
        asswVar.c = dpvf.b(this.d);
        s.d(this.b);
        s.f(this.a.b);
        s.j(mex.a());
        mayVar2.e.k(mayVar2.f.w(mayVar2.e, s.a(), mayVar2.h, mayVar2.c, mayVar2.i, mcl.DEFAULT, mayVar2.g, mayVar2.j));
    }
}
