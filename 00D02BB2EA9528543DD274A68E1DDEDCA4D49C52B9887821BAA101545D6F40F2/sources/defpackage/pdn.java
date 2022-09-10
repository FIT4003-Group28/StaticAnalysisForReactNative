package defpackage;
/* compiled from: PG */
/* renamed from: pdn  reason: default package */
/* loaded from: classes7.dex */
public final class pdn implements pcx<daxk> {
    public static final int a = auiy.SAVE_OFFLINE_MAP.a().intValue();
    private static final avid b = new pdm();
    private final dzsj<avij> c;
    private final avzm d;

    public pdn(dzsj<avij> dzsjVar, avzm avzmVar) {
        this.c = dzsjVar;
        this.d = avzmVar;
    }

    @Override // defpackage.pcx
    public final boolean a(int i) {
        return a == i;
    }

    @Override // defpackage.pcx
    public final dssr<daxk> b() {
        return (dssr) daxk.c.cu(7);
    }

    @Override // defpackage.pcx
    public final /* bridge */ /* synthetic */ int c(daxk daxkVar) {
        return dpyv.UNKNOWN_NOTIFICATION_ID.dm;
    }

    @Override // defpackage.pcx
    public final /* bridge */ /* synthetic */ void d(pau pauVar, pas pasVar, daxk daxkVar) {
        daxk daxkVar2 = daxkVar;
        daxi daxiVar = daxkVar2.a;
        if (daxiVar == null) {
            daxiVar = daxi.c;
        }
        duhe duheVar = daxiVar.a;
        if (duheVar == null) {
            duheVar = duhe.c;
        }
        akqq akqqVar = new akqq(duheVar);
        daxi daxiVar2 = daxkVar2.a;
        if (daxiVar2 == null) {
            daxiVar2 = daxi.c;
        }
        duhe duheVar2 = daxiVar2.b;
        if (duheVar2 == null) {
            duheVar2 = duhe.c;
        }
        akqq akqqVar2 = new akqq(duheVar2);
        avzm avzmVar = this.d;
        akqr a2 = akqs.a();
        a2.d(akqqVar);
        a2.d(akqqVar2);
        avzl b2 = avzmVar.b(a2.b());
        this.c.a().b(b2.d(), b2.a, daxkVar2.b, false, b);
    }
}
