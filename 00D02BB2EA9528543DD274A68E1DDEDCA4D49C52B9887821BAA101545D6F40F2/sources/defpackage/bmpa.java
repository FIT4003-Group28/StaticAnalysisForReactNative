package defpackage;
/* compiled from: PG */
/* renamed from: bmpa  reason: default package */
/* loaded from: classes3.dex */
final class bmpa implements degu<bmny> {
    final /* synthetic */ dmjz a;
    final /* synthetic */ bmph b;

    public bmpa(bmph bmphVar, dmjz dmjzVar) {
        this.b = bmphVar;
        this.a = dmjzVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        this.b.c(28, this.a);
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(@dzsi bmny bmnyVar) {
        bmny bmnyVar2 = bmnyVar;
        bmph bmphVar = this.b;
        dbsk.s(bmnyVar2);
        dmjz dmjzVar = this.a;
        if (!bmnyVar2.b().a()) {
            deha.q(bmnyVar2.a().b(), new bmpb(bmphVar, dmjzVar), dege.a);
            return;
        }
        bmnx bmnxVar = bmnx.LOCATION_MODE_INCOMPATIBLE_FOR_WIFI_SCANS;
        bmnt bmntVar = bmnt.TASK_FAILED;
        dmjz dmjzVar2 = dmjz.UNKNOWN;
        bmob bmobVar = bmob.UNSUPPORTED_SDK;
        int ordinal = bmnyVar2.b().b().ordinal();
        if (ordinal == 0) {
            bmphVar.c(26, dmjzVar);
        } else if (ordinal == 1) {
            bmphVar.c(27, dmjzVar);
        } else if (ordinal != 2) {
        } else {
            bmphVar.c(28, dmjzVar);
        }
    }
}
