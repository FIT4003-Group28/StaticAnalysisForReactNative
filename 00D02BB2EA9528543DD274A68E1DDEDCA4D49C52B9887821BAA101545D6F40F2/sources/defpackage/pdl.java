package defpackage;
/* compiled from: PG */
/* renamed from: pdl  reason: default package */
/* loaded from: classes7.dex */
public final class pdl implements pcx<dlil> {
    public static final int a = auiy.RIDDLER_QUESTION.a().intValue();
    private final pdh b;
    private final aulv c;

    public pdl(pdh pdhVar, aulv aulvVar) {
        this.b = pdhVar;
        this.c = aulvVar;
    }

    @Override // defpackage.pcx
    public final boolean a(int i) {
        return a == i;
    }

    @Override // defpackage.pcx
    public final dssr<dlil> b() {
        return (dssr) dlil.g.cu(7);
    }

    @Override // defpackage.pcx
    public final /* bridge */ /* synthetic */ int c(dlil dlilVar) {
        return aulv.c();
    }

    @Override // defpackage.pcx
    public final /* bridge */ /* synthetic */ void d(pau pauVar, pas pasVar, dlil dlilVar) {
        dlil dlilVar2 = dlilVar;
        this.b.a(this.c.a(pasVar, dlilVar2, pauVar, aulv.c()), dlilVar2, aulv.c());
    }
}
