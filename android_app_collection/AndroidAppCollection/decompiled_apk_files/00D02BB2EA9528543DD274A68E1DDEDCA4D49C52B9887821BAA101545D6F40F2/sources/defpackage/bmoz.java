package defpackage;

import java.util.concurrent.TimeoutException;
/* compiled from: PG */
/* renamed from: bmoz  reason: default package */
/* loaded from: classes3.dex */
final class bmoz implements degu<bmnu> {
    final /* synthetic */ dmjz a;
    final /* synthetic */ bmph b;

    public bmoz(bmph bmphVar, dmjz dmjzVar) {
        this.b = bmphVar;
        this.a = dmjzVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        this.b.c(true != (th instanceof TimeoutException) ? 11 : 15, this.a);
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(@dzsi bmnu bmnuVar) {
        bmnu bmnuVar2 = bmnuVar;
        bmph bmphVar = this.b;
        dbsk.s(bmnuVar2);
        dmjz dmjzVar = this.a;
        dbsg<bmnt> b = bmnuVar2.b();
        if (!b.a()) {
            deha.q(bmnuVar2.a().b(), new bmpa(bmphVar, dmjzVar), dege.a);
            return;
        }
        bmnx bmnxVar = bmnx.LOCATION_MODE_INCOMPATIBLE_FOR_WIFI_SCANS;
        bmnt bmntVar = bmnt.TASK_FAILED;
        dmjz dmjzVar2 = dmjz.UNKNOWN;
        bmob bmobVar = bmob.UNSUPPORTED_SDK;
        bmphVar.c(b.b().ordinal() != 0 ? 12 : 11, dmjzVar);
    }
}
