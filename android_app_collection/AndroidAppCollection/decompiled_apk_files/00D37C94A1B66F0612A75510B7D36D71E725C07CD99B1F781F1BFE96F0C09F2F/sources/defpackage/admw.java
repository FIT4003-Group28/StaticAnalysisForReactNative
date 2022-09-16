package defpackage;
/* compiled from: PG */
/* renamed from: admw  reason: default package */
/* loaded from: classes.dex */
public final class admw implements ynl {
    public final airr b;
    public final adgc c;
    final admr d;
    public final snc e;
    public advw f;
    public adik g;
    final azpm h;
    boolean i;
    private final adeo k;
    private final azqb l;
    private final bgo m;
    public final admv j = new admv(this, 1);
    public final admv a = new admv(this);

    public admw(airr airrVar, adeo adeoVar, azqb azqbVar, bgo bgoVar, adgc adgcVar, advw advwVar, snc sncVar) {
        azpm e = azpm.e();
        this.h = e;
        this.b = airrVar;
        this.k = adeoVar;
        this.l = azqbVar;
        this.m = bgoVar;
        this.c = adgcVar;
        this.f = advwVar;
        this.d = new admr(this);
        this.e = sncVar;
        adii a = adik.a();
        ylx.i(this.f.a(a), new admp(this, a, 1));
        e.as(new admq(this, 1));
        advwVar.f.as(new admq(this));
    }

    public final void a() {
        ((bhd) this.l.get()).q(this.m, this.d, 4);
        if (!this.k.a().isEmpty()) {
            this.f.c();
        }
    }

    public final void b() {
        ((bhd) this.l.get()).r(this.d);
    }

    public final void c() {
        adii b = this.g.b();
        b.p(0);
        b.f(this.e.c());
        this.h.c(b.a());
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                adgp adgpVar = (adgp) obj;
                if (!adgpVar.a() || !adgpVar.b()) {
                    return null;
                }
                advw advwVar = this.f;
                ylx.i(advwVar.b, new advu(advwVar));
                return null;
            } else if (i == 1) {
                adii b = this.g.b();
                b.q(((ahhv) obj).a);
                b.f(this.e.c());
                this.h.c(b.a());
                return null;
            } else {
                StringBuilder sb = new StringBuilder(32);
                sb.append("unsupported op code: ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            }
        }
        return new Class[]{adgp.class, ahhv.class};
    }
}
