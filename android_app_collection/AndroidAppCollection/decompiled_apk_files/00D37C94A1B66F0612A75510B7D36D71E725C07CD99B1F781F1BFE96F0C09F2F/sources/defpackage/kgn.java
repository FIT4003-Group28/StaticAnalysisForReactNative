package defpackage;
/* compiled from: PG */
/* renamed from: kgn  reason: default package */
/* loaded from: classes3.dex */
public final class kgn implements nqj {
    public final boolean a;
    public final azqb b;
    public final azpd c;
    public aynx d;

    public kgn(aacz aaczVar, azqb azqbVar) {
        asxj asxjVar = aaczVar.b().e;
        this.a = (asxjVar == null ? asxj.a : asxjVar).cr;
        this.b = azqbVar;
        this.c = azpd.ar();
        this.d = aynx.r();
    }

    public static final boolean b(boolean z, nsr nsrVar) {
        return !z || nsr.HIDDEN.equals(nsrVar);
    }

    private static final boolean c(nmc nmcVar) {
        return nmcVar != null && nmcVar.t();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean a() {
        if (!this.a) {
            return true;
        }
        return b(c(((nml) this.b.get()).c()), ((nml) this.b.get()).h().o);
    }

    @Override // defpackage.nqj
    public final void g(nmc nmcVar) {
        this.c.c(Boolean.valueOf(c(nmcVar)));
    }
}
