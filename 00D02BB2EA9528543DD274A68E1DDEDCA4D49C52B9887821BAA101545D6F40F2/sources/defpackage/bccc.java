package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: bccc  reason: default package */
/* loaded from: classes3.dex */
public final class bccc extends bcby implements bcbx {
    public final bhhf p;
    private final bcmv q;
    private final bcof r;
    private final btvo s;
    private final bckv t;
    private final afxw u;
    private bcbu v;

    public bccc(@dzsi ilo iloVar, dcdn<dspd, bbuq> dcdnVar, cjtd cjtdVar, boolean z, int i, bcli bcliVar, bcku bckuVar, bckr bckrVar, Activity activity, buti butiVar, bcmm bcmmVar, bcmv bcmvVar, bcof bcofVar, btvo btvoVar, bckv bckvVar, bhhf bhhfVar, afxw afxwVar) {
        super(iloVar, dcdnVar, cjtdVar, z, i, bcliVar, bckuVar, bckrVar, activity, butiVar, bcmmVar, bhhfVar, afxwVar);
        this.q = bcmvVar;
        this.r = bcofVar;
        this.s = btvoVar;
        this.t = bckvVar;
        this.p = bhhfVar;
        this.u = afxwVar;
    }

    @Override // defpackage.bcbx
    @dzsi
    public final bcbu b() {
        bcbu bcbuVar = this.v;
        if (bcbuVar == null) {
            return null;
        }
        return bcbuVar;
    }

    @Override // defpackage.bcby, defpackage.bbup
    public final void j() {
        cknl cknlVar = (cknl) this.c.get(bcbv.b);
        dbuh.d(cknlVar);
        this.n = dcdc.r(cknlVar.z());
        dcdc<dweu> dcdcVar = this.n;
        final ilo iloVar = this.a;
        this.n = dcbg.b(dcdcVar).o(new dbsl(this, iloVar) { // from class: bcbz
            private final bccc a;
            private final ilo b;

            {
                this.a = this;
                this.b = iloVar;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                bccc bcccVar = this.a;
                ilo iloVar2 = this.b;
                dweu dweuVar = (dweu) obj;
                if (dweuVar == null) {
                    return false;
                }
                return bcccVar.p.a(iloVar2) || !dweuVar.j || (dweuVar.a & 1024) == 0 || dweuVar.k > 0;
            }
        }).z();
        this.n = e(this.n);
        cknlVar.s(this);
        f();
        dcdc<dweu> dcdcVar2 = this.n;
        dcdn<dspd, bbuq> dcdnVar = this.c;
        ilo iloVar2 = this.a;
        this.v = new bccb(dcdcVar2, dcdnVar, iloVar2, this.d, this.e, this.f, this.q, this.r, this.s, this.t, this.p.a(iloVar2), this.u);
        this.m.j(this.n);
    }
}
