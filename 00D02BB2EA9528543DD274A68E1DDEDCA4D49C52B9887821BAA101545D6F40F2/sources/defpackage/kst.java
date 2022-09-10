package defpackage;

import com.google.android.apps.gmm.map.model.location.GmmLocation;
import java.util.Map;
/* compiled from: PG */
/* renamed from: kst  reason: default package */
/* loaded from: classes7.dex */
public final class kst<T> extends btrh<T> {
    private final int d;

    public kst(int i, Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
        this.d = i;
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        ksq ksfVar;
        ksq ksqVar;
        ksl kslVar;
        if (this.d != 0) {
            ksn ksnVar = (ksn) this.a;
            GmmLocation a = ((amqo) obj).a();
            if (a == null) {
                return;
            }
            boolean g = ksnVar.a.g();
            ksr ksrVar = ksnVar.a;
            ksrVar.f = a;
            if (!ksrVar.e.isEmpty()) {
                for (Map.Entry<ksq, ksl> entry : ksnVar.a.e.entrySet()) {
                    ksnVar.a.e(entry.getKey(), ksnVar.a.f, entry.getValue());
                }
                ksnVar.a.e.clear();
            }
            if (!g) {
                return;
            }
            for (kso ksoVar : ksnVar.a.g) {
                ksoVar.a();
            }
            return;
        }
        ksn ksnVar2 = (ksn) this.a;
        srf srfVar = (srf) obj;
        qbn qbnVar = srfVar.a;
        qbm qbmVar = srfVar.b;
        int i = ksr.h;
        vun g2 = qbmVar.g();
        dbsk.s(g2);
        dcdc<amvh> dcdcVar = g2.l;
        if (dcdcVar.size() < 2) {
            dcdcVar.size();
            ksqVar = null;
        } else {
            dcdc<amvf> dcdcVar2 = g2.m;
            dqnz dqnzVar = g2.b.K;
            if (dqnzVar == null) {
                dqnzVar = dqnz.c;
            }
            if (dqnzVar.b) {
                if (dcdcVar.size() > 2) {
                    bvoo.f(new IllegalStateException("DaisyChain request has more than two waypoints."));
                }
                if (!dcdcVar2.isEmpty()) {
                    bvoo.f(new IllegalStateException("DaisyChain request has viapoints."));
                }
                dbsk.l(false);
                ksfVar = new ksd((amvh) dcft.s(dcdcVar));
            } else {
                ksfVar = new ksf(dcdcVar.subList(1, dcdcVar.size()), dcdc.e());
            }
            ksqVar = ksfVar;
        }
        if (ksqVar == null || (kslVar = ksnVar2.a.d.get(ksqVar)) == null) {
            return;
        }
        if (!qbmVar.d()) {
            qbmVar.o();
        }
        if (!qbmVar.b() || !qbmVar.c()) {
            ksnVar2.a.j(qbnVar, qbmVar, ksqVar);
        } else {
            ksnVar2.a.c.a(new ksm(ksnVar2, qbnVar, qbmVar, ksqVar), bvrj.UI_THREAD, Math.max(ksr.a - (ksnVar2.a.b.e() - kslVar.e()), 0L));
        }
    }
}
