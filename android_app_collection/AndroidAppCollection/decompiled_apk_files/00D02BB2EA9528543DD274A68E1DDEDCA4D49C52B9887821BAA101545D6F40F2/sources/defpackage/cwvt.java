package defpackage;

import android.os.health.TimerStat;
/* compiled from: PG */
/* renamed from: cwvt  reason: default package */
/* loaded from: classes5.dex */
final class cwvt extends cwvr<TimerStat, dzys> {
    public static final cwvt a = new cwvt();

    private cwvt() {
    }

    @Override // defpackage.cwvr
    public final /* bridge */ /* synthetic */ String a(dzys dzysVar) {
        dzys dzysVar2 = dzysVar;
        dzyi dzyiVar = dzysVar2.d;
        if (dzyiVar == null) {
            dzyiVar = dzyi.d;
        }
        int i = dzyiVar.a & 2;
        dzyi dzyiVar2 = dzysVar2.d;
        if (i != 0) {
            if (dzyiVar2 == null) {
                dzyiVar2 = dzyi.d;
            }
            return dzyiVar2.c;
        }
        if (dzyiVar2 == null) {
            dzyiVar2 = dzyi.d;
        }
        return Long.toHexString(dzyiVar2.b);
    }

    @Override // defpackage.cwvr
    public final /* bridge */ /* synthetic */ dzys b(dzys dzysVar, dzys dzysVar2) {
        return cwvu.c(dzysVar, dzysVar2);
    }

    @Override // defpackage.cwvr
    public final /* bridge */ /* synthetic */ dzys c(String str, TimerStat timerStat) {
        return cwvu.b(str, timerStat);
    }
}
