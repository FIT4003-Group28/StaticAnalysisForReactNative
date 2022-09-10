package defpackage;
/* compiled from: PG */
/* renamed from: dlj  reason: default package */
/* loaded from: classes6.dex */
public final class dlj implements dyey {
    static final dyhs<String> a = dyhs.d("X-Goog-Api-Key", dyhw.b);
    public final bubp b;
    private final dxio<akfa> c;

    public dlj(dxio dxioVar, bubp bubpVar) {
        this.c = dxioVar;
        this.b = bubpVar;
    }

    @Override // defpackage.dyey
    public final <ReqT, RespT> dyex<ReqT, RespT> a(dyib<ReqT, RespT> dyibVar, dyet dyetVar, dyeu dyeuVar) {
        btue btueVar;
        akfa a2 = this.c.a();
        if (btlu.i(a2.j()) == btlt.GOOGLE) {
            try {
                btueVar = a2.y("oauth2:https://www.googleapis.com/auth/geo-augmented-reality");
            } catch (IllegalStateException unused) {
                btueVar = null;
            }
            if (btueVar == null) {
                return new dli(this, dyeuVar.a(dyibVar, dyetVar));
            }
            String e = btueVar.e();
            if (e == null || e.isEmpty()) {
                return new dli(this, dyeuVar.a(dyibVar, dyetVar));
            }
            return dyeuVar.a(dyibVar, dyetVar.a(dyjp.a(dbma.d(new dblw(e, null)))));
        }
        return new dli(this, dyeuVar.a(dyibVar, dyetVar));
    }
}
