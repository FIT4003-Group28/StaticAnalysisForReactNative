package defpackage;

import com.google.android.apps.gmm.majorevents.api.MajorEvent;
import java.util.List;
/* compiled from: PG */
/* renamed from: akmi  reason: default package */
/* loaded from: classes.dex */
public final class akmi implements dbsz<aknr> {
    final /* synthetic */ akmk a;

    public akmi(akmk akmkVar) {
        this.a = akmkVar;
    }

    @Override // defpackage.dbsz
    public final /* bridge */ /* synthetic */ void NU(@dzsi aknr aknrVar) {
        List<MajorEvent> list;
        List<MajorEvent> list2;
        aknr aknrVar2 = aknrVar;
        if (aknrVar2 == null) {
            aknrVar2 = aknr.b;
        }
        akmk akmkVar = this.a;
        dsrj<aknq> dsrjVar = aknrVar2.a;
        dccx F = dcdc.F();
        long b = akmkVar.d.b();
        for (aknq aknqVar : dsrjVar) {
            diwb diwbVar = aknqVar.c;
            if (diwbVar == null) {
                diwbVar = diwb.U;
            }
            ditt dittVar = diwbVar.e;
            if (dittVar == null) {
                dittVar = ditt.n;
            }
            dits ditsVar = dittVar.e;
            if (ditsVar == null) {
                ditsVar = dits.f;
            }
            dpop dpopVar = ditsVar.b;
            if (dpopVar == null) {
                dpopVar = dpop.d;
            }
            if (dpopVar.c > b) {
                aknt b2 = aknt.b(aknqVar.b);
                if (b2 == null) {
                    b2 = aknt.UNKNOWN_DETAIL_LEVEL;
                }
                diwb diwbVar2 = aknqVar.c;
                if (diwbVar2 == null) {
                    diwbVar2 = diwb.U;
                }
                F.g(new MajorEvent(b2, diwbVar2));
            }
        }
        dcdc f = F.f();
        synchronized (this.a.e) {
            list = this.a.f;
            this.a.f = akmk.k(list, f, dcdc.e(), dcdc.e());
            list2 = this.a.f;
        }
        if (!list.equals(list2)) {
            this.a.i(list2);
            this.a.j();
        }
    }
}
