package defpackage;

import android.os.health.HealthStats;
/* compiled from: PG */
/* renamed from: uvc  reason: default package */
/* loaded from: classes4.dex */
final class uvc extends uvb {
    public static final uvc a = new uvc();

    private uvc() {
    }

    @Override // defpackage.uvb
    public final /* bridge */ /* synthetic */ aoqu a(String str, Object obj) {
        HealthStats healthStats = (HealthStats) obj;
        aopa createBuilder = azzh.a.createBuilder();
        int e = (int) uut.e(healthStats, 50001);
        if (e != 0) {
            createBuilder.copyOnWrite();
            azzh azzhVar = (azzh) createBuilder.instance;
            azzhVar.b |= 1;
            azzhVar.c = e;
        }
        int e2 = (int) uut.e(healthStats, 50002);
        if (e2 != 0) {
            createBuilder.copyOnWrite();
            azzh azzhVar2 = (azzh) createBuilder.instance;
            azzhVar2.b |= 2;
            azzhVar2.d = e2;
        }
        if (str != null) {
            azzd h = uut.h(str);
            createBuilder.copyOnWrite();
            azzh azzhVar3 = (azzh) createBuilder.instance;
            h.getClass();
            azzhVar3.e = h;
            azzhVar3.b |= 4;
        }
        azzh azzhVar4 = (azzh) createBuilder.mo39build();
        if (uut.o(azzhVar4)) {
            return null;
        }
        return azzhVar4;
    }

    @Override // defpackage.uvb
    public final /* bridge */ /* synthetic */ aoqu b(aoqu aoquVar, aoqu aoquVar2) {
        int i;
        int i2;
        azzh azzhVar = (azzh) aoquVar;
        azzh azzhVar2 = (azzh) aoquVar2;
        if (azzhVar == null || azzhVar2 == null) {
            return azzhVar;
        }
        aopa createBuilder = azzh.a.createBuilder();
        if ((azzhVar.b & 1) != 0 && (i2 = azzhVar.c - azzhVar2.c) != 0) {
            createBuilder.copyOnWrite();
            azzh azzhVar3 = (azzh) createBuilder.instance;
            azzhVar3.b |= 1;
            azzhVar3.c = i2;
        }
        if ((azzhVar.b & 2) != 0 && (i = azzhVar.d - azzhVar2.d) != 0) {
            createBuilder.copyOnWrite();
            azzh azzhVar4 = (azzh) createBuilder.instance;
            azzhVar4.b |= 2;
            azzhVar4.d = i;
        }
        azzd azzdVar = azzhVar.e;
        if (azzdVar == null) {
            azzdVar = azzd.a;
        }
        createBuilder.copyOnWrite();
        azzh azzhVar5 = (azzh) createBuilder.instance;
        azzdVar.getClass();
        azzhVar5.e = azzdVar;
        azzhVar5.b |= 4;
        azzh azzhVar6 = (azzh) createBuilder.mo39build();
        if (!uut.o(azzhVar6)) {
            return azzhVar6;
        }
        return null;
    }

    @Override // defpackage.uvb
    public final /* bridge */ /* synthetic */ String c(aoqu aoquVar) {
        azzd azzdVar = ((azzh) aoquVar).e;
        if (azzdVar == null) {
            azzdVar = azzd.a;
        }
        return azzdVar.d;
    }
}
