package defpackage;

import android.os.health.HealthStats;
import java.util.Collections;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: uuz  reason: default package */
/* loaded from: classes4.dex */
public final class uuz extends uvb {
    public static final uuz a = new uuz();

    private uuz() {
    }

    @Override // defpackage.uvb
    public final /* bridge */ /* synthetic */ aoqu a(String str, Object obj) {
        HealthStats healthStats = (HealthStats) obj;
        aopa createBuilder = azze.a.createBuilder();
        createBuilder.bC(uvc.a.d(uut.g(healthStats, 40001)));
        createBuilder.bD(uuy.a.d((healthStats == null || !healthStats.hasMeasurements(40002)) ? Collections.emptyMap() : healthStats.getMeasurements(40002)));
        if (str != null) {
            azzd h = uut.h(str);
            createBuilder.copyOnWrite();
            azze azzeVar = (azze) createBuilder.instance;
            h.getClass();
            azzeVar.e = h;
            azzeVar.b |= 1;
        }
        azze azzeVar2 = (azze) createBuilder.mo39build();
        if (uut.m(azzeVar2)) {
            return null;
        }
        return azzeVar2;
    }

    @Override // defpackage.uvb
    public final /* bridge */ /* synthetic */ aoqu b(aoqu aoquVar, aoqu aoquVar2) {
        azze azzeVar = (azze) aoquVar;
        azze azzeVar2 = (azze) aoquVar2;
        if (azzeVar == null || azzeVar2 == null) {
            return azzeVar;
        }
        aopa createBuilder = azze.a.createBuilder();
        createBuilder.bC(uvc.a.e(azzeVar.c, azzeVar2.c));
        createBuilder.bD(uuy.a.e(azzeVar.d, azzeVar2.d));
        azzd azzdVar = azzeVar.e;
        if (azzdVar == null) {
            azzdVar = azzd.a;
        }
        createBuilder.copyOnWrite();
        azze azzeVar3 = (azze) createBuilder.instance;
        azzdVar.getClass();
        azzeVar3.e = azzdVar;
        azzeVar3.b |= 1;
        azze azzeVar4 = (azze) createBuilder.mo39build();
        if (!uut.m(azzeVar4)) {
            return azzeVar4;
        }
        return null;
    }

    @Override // defpackage.uvb
    public final /* bridge */ /* synthetic */ String c(aoqu aoquVar) {
        azzd azzdVar = ((azze) aoquVar).e;
        if (azzdVar == null) {
            azzdVar = azzd.a;
        }
        return azzdVar.d;
    }
}
