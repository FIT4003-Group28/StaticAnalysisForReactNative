package defpackage;
/* compiled from: PG */
/* renamed from: qts  reason: default package */
/* loaded from: classes7.dex */
public final class qts {
    public final gga a;
    public final dxio<akfa> b;
    public final btvo c;
    public final bvjj d;
    public final dxio<qbt> e;
    public final byex f;
    public final dxio<aedv> g;
    public final acyp h;
    private final qjk i;
    private final qtt j;
    private final qjy k;
    private final qeg l;
    private final ckcw m;

    public qts(gga ggaVar, dxio<akfa> dxioVar, btvo btvoVar, bvjj bvjjVar, qjk qjkVar, qtt qttVar, qjy qjyVar, dxio<qbt> dxioVar2, byex byexVar, dxio<aedv> dxioVar3, qeg qegVar, ckcw ckcwVar, acyp acypVar) {
        this.a = ggaVar;
        this.b = dxioVar;
        this.c = btvoVar;
        this.d = bvjjVar;
        this.i = qjkVar;
        this.j = qttVar;
        this.k = qjyVar;
        this.e = dxioVar2;
        this.f = byexVar;
        this.g = dxioVar3;
        this.l = qegVar;
        this.m = ckcwVar;
        this.h = acypVar;
    }

    private final Runnable c(final qup qupVar, final quy quyVar) {
        dbsk.s(qupVar.d());
        return d(new dbty(qupVar, quyVar) { // from class: qtq
            private final qup a;
            private final quy b;

            {
                this.a = qupVar;
                this.b = quyVar;
            }

            @Override // defpackage.dbty
            public final Object a() {
                return quc.a(this.a, this.b, true, false);
            }
        });
    }

    private final Runnable d(final dbty<ges> dbtyVar) {
        this.j.a(null);
        return new Runnable(this, dbtyVar) { // from class: qtr
            private final qts a;
            private final dbty b;

            {
                this.a = this;
                this.b = dbtyVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                dktk dktkVar;
                qts qtsVar = this.a;
                ges gesVar = (ges) this.b.a();
                aedv a = qtsVar.g.a();
                if (qtsVar.h.d()) {
                    dktkVar = dktk.TRANSPORTATION;
                } else {
                    dktkVar = dktk.COMMUTE;
                }
                a.r(gesVar, dktkVar);
            }
        };
    }

    private final boolean e(domy domyVar) {
        if (!sif.a(this.c) || domyVar != domy.MULTIMODAL) {
            return (this.l.b() && this.c.getTwoWheelerParameters().e && domyVar == domy.TWO_WHEELER) || domyVar == domy.DRIVE || domyVar == domy.TRANSIT;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0088 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0137  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Runnable a(final defpackage.qup r11, final defpackage.quy r12, final defpackage.dbsg<defpackage.dnqh> r13, @defpackage.dzsi final android.support.v4.app.Fragment$SavedState r14) {
        /*
            Method dump skipped, instructions count: 463
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qts.a(qup, quy, dbsg, android.support.v4.app.Fragment$SavedState):java.lang.Runnable");
    }

    public final boolean b(domy domyVar) {
        btlu j = this.b.a().j();
        int t = this.d.t(bvjk.id, j, -1);
        this.d.X(bvjk.id, j, domyVar.h);
        return !e(domyVar) && domyVar.h != t;
    }
}
