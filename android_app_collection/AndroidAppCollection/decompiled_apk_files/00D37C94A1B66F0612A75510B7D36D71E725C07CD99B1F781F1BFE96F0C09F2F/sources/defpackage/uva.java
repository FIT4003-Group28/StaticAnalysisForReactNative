package defpackage;

import android.os.health.HealthStats;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: uva  reason: default package */
/* loaded from: classes4.dex */
public final class uva extends uvb {
    public static final uva a = new uva();

    private uva() {
    }

    @Override // defpackage.uvb
    public final /* bridge */ /* synthetic */ aoqu a(String str, Object obj) {
        HealthStats healthStats = (HealthStats) obj;
        aopa createBuilder = azzg.a.createBuilder();
        long e = uut.e(healthStats, 30001);
        if (e != 0) {
            createBuilder.copyOnWrite();
            azzg azzgVar = (azzg) createBuilder.instance;
            azzgVar.b |= 1;
            azzgVar.c = e;
        }
        long e2 = uut.e(healthStats, 30002);
        if (e2 != 0) {
            createBuilder.copyOnWrite();
            azzg azzgVar2 = (azzg) createBuilder.instance;
            azzgVar2.b |= 2;
            azzgVar2.d = e2;
        }
        long e3 = uut.e(healthStats, 30003);
        if (e3 != 0) {
            createBuilder.copyOnWrite();
            azzg azzgVar3 = (azzg) createBuilder.instance;
            azzgVar3.b |= 4;
            azzgVar3.e = e3;
        }
        long e4 = uut.e(healthStats, 30004);
        if (e4 != 0) {
            createBuilder.copyOnWrite();
            azzg azzgVar4 = (azzg) createBuilder.instance;
            azzgVar4.b |= 8;
            azzgVar4.f = e4;
        }
        long e5 = uut.e(healthStats, 30005);
        if (e5 != 0) {
            createBuilder.copyOnWrite();
            azzg azzgVar5 = (azzg) createBuilder.instance;
            azzgVar5.b |= 16;
            azzgVar5.g = e5;
        }
        long e6 = uut.e(healthStats, 30006);
        if (e6 != 0) {
            createBuilder.copyOnWrite();
            azzg azzgVar6 = (azzg) createBuilder.instance;
            azzgVar6.b |= 32;
            azzgVar6.h = e6;
        }
        if (str != null) {
            azzd h = uut.h(str);
            createBuilder.copyOnWrite();
            azzg azzgVar7 = (azzg) createBuilder.instance;
            h.getClass();
            azzgVar7.i = h;
            azzgVar7.b |= 64;
        }
        azzg azzgVar8 = (azzg) createBuilder.mo39build();
        if (uut.n(azzgVar8)) {
            return null;
        }
        return azzgVar8;
    }

    @Override // defpackage.uvb
    public final /* bridge */ /* synthetic */ aoqu b(aoqu aoquVar, aoqu aoquVar2) {
        azzg azzgVar = (azzg) aoquVar;
        azzg azzgVar2 = (azzg) aoquVar2;
        if (azzgVar == null || azzgVar2 == null) {
            return azzgVar;
        }
        aopa createBuilder = azzg.a.createBuilder();
        if ((azzgVar.b & 1) != 0) {
            long j = azzgVar.c - azzgVar2.c;
            if (j != 0) {
                createBuilder.copyOnWrite();
                azzg azzgVar3 = (azzg) createBuilder.instance;
                azzgVar3.b |= 1;
                azzgVar3.c = j;
            }
        }
        if ((azzgVar.b & 2) != 0) {
            long j2 = azzgVar.d - azzgVar2.d;
            if (j2 != 0) {
                createBuilder.copyOnWrite();
                azzg azzgVar4 = (azzg) createBuilder.instance;
                azzgVar4.b |= 2;
                azzgVar4.d = j2;
            }
        }
        if ((azzgVar.b & 4) != 0) {
            long j3 = azzgVar.e - azzgVar2.e;
            if (j3 != 0) {
                createBuilder.copyOnWrite();
                azzg azzgVar5 = (azzg) createBuilder.instance;
                azzgVar5.b |= 4;
                azzgVar5.e = j3;
            }
        }
        if ((azzgVar.b & 8) != 0) {
            long j4 = azzgVar.f - azzgVar2.f;
            if (j4 != 0) {
                createBuilder.copyOnWrite();
                azzg azzgVar6 = (azzg) createBuilder.instance;
                azzgVar6.b |= 8;
                azzgVar6.f = j4;
            }
        }
        if ((azzgVar.b & 16) != 0) {
            long j5 = azzgVar.g - azzgVar2.g;
            if (j5 != 0) {
                createBuilder.copyOnWrite();
                azzg azzgVar7 = (azzg) createBuilder.instance;
                azzgVar7.b |= 16;
                azzgVar7.g = j5;
            }
        }
        if ((azzgVar.b & 32) != 0) {
            long j6 = azzgVar.h - azzgVar2.h;
            if (j6 != 0) {
                createBuilder.copyOnWrite();
                azzg azzgVar8 = (azzg) createBuilder.instance;
                azzgVar8.b |= 32;
                azzgVar8.h = j6;
            }
        }
        azzd azzdVar = azzgVar.i;
        if (azzdVar == null) {
            azzdVar = azzd.a;
        }
        createBuilder.copyOnWrite();
        azzg azzgVar9 = (azzg) createBuilder.instance;
        azzdVar.getClass();
        azzgVar9.i = azzdVar;
        azzgVar9.b |= 64;
        azzg azzgVar10 = (azzg) createBuilder.mo39build();
        if (!uut.n(azzgVar10)) {
            return azzgVar10;
        }
        return null;
    }

    @Override // defpackage.uvb
    public final /* bridge */ /* synthetic */ String c(aoqu aoquVar) {
        azzd azzdVar = ((azzg) aoquVar).i;
        if (azzdVar == null) {
            azzdVar = azzd.a;
        }
        return azzdVar.d;
    }
}
