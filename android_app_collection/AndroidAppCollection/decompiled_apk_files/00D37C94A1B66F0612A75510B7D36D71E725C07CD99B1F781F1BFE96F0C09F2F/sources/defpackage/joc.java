package defpackage;
/* compiled from: PG */
/* renamed from: joc  reason: default package */
/* loaded from: classes3.dex */
public final class joc implements ynl {
    public final fcl a;
    public final azqb b;
    public final aagi c;
    public final aahf d;
    public final ylj e = new ylj();

    public joc(fcl fclVar, azqb azqbVar, aagi aagiVar, aahf aahfVar) {
        this.a = fclVar;
        this.b = azqbVar;
        this.c = aagiVar;
        this.d = aahfVar;
        b();
    }

    public final ampq a() {
        return !c() ? amon.a : ampq.i((awka) this.c.c().f(emn.i()).g(awka.class).W());
    }

    public final void b() {
        aynr C = this.c.c().h(emn.p(), true).I(jgs.i).ao().e().q(ick.p).C();
        final ylj yljVar = this.e;
        C.R(new aypv() { // from class: jnz
            @Override // defpackage.aypv
            public final void a() {
                ylj.this.release();
            }
        });
    }

    public final boolean c() {
        try {
            this.e.acquire();
            this.e.release();
            return true;
        } catch (InterruptedException unused) {
            return false;
        }
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                afwb afwbVar = (afwb) obj;
                b();
                return null;
            } else if (i == 1) {
                afwd afwdVar = (afwd) obj;
                this.e.a();
                return null;
            } else {
                StringBuilder sb = new StringBuilder(32);
                sb.append("unsupported op code: ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            }
        }
        return new Class[]{afwb.class, afwd.class};
    }
}
