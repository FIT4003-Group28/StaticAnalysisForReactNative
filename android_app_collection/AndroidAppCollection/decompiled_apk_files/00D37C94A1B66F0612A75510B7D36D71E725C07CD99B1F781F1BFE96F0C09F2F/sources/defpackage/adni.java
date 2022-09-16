package defpackage;
/* compiled from: PG */
/* renamed from: adni  reason: default package */
/* loaded from: classes.dex */
public final class adni implements afvu {
    public final afvt a;
    private final adoa b;
    private final boolean c;

    public adni(afvt afvtVar, adoa adoaVar, aczr aczrVar) {
        this.a = afvtVar;
        this.b = adoaVar;
        this.c = aczrVar.c.equals("cl");
    }

    public final void a() {
        this.a.i(this);
    }

    @Override // defpackage.afvu
    public final void j() {
        adnt e;
        if (this.c && (e = this.b.e()) != null) {
            e.D(atcv.MDX_SESSION_DISCONNECT_REASON_INCOGNITO);
        }
    }

    @Override // defpackage.afvu
    public final void k() {
    }

    @Override // defpackage.afvu
    public final void l() {
    }
}
