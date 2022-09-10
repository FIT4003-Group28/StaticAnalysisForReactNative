package defpackage;
/* compiled from: PG */
/* renamed from: pdi  reason: default package */
/* loaded from: classes7.dex */
public final class pdi implements pcx<dlin> {
    public static final int a = auiy.RATE_AND_REVIEW.a().intValue();
    private final pdh b;
    private final aulv c;

    public pdi(pdh pdhVar, aulv aulvVar) {
        this.b = pdhVar;
        this.c = aulvVar;
    }

    @Override // defpackage.pcx
    public final boolean a(int i) {
        return i == a;
    }

    @Override // defpackage.pcx
    public final dssr<dlin> b() {
        return (dssr) dlin.b.cu(7);
    }

    @Override // defpackage.pcx
    public final /* bridge */ /* synthetic */ int c(dlin dlinVar) {
        return aulv.b();
    }

    @Override // defpackage.pcx
    public final /* bridge */ /* synthetic */ void d(pau pauVar, pas pasVar, dlin dlinVar) {
        dlin dlinVar2 = dlinVar;
        pdh pdhVar = this.b;
        aulv aulvVar = this.c;
        dlil dlilVar = dlinVar2.a;
        if (dlilVar == null) {
            dlilVar = dlil.g;
        }
        augj a2 = aulvVar.a(pasVar, dlilVar, pauVar, aulv.b());
        dlil dlilVar2 = dlinVar2.a;
        if (dlilVar2 == null) {
            dlilVar2 = dlil.g;
        }
        pdhVar.a(a2, dlilVar2, aulv.b());
    }
}
