package defpackage;

import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: aebc  reason: default package */
/* loaded from: classes.dex */
public final class aebc implements adac, aczx {
    private final adbw a;
    private final ckcw b;
    private final adma c;
    private final btpc d;
    private awwb e;
    private boolean f = true;
    private boolean g = false;
    private final Map<aczy<?>, Boolean> h = dcjz.d();
    private int i = 0;

    public aebc(adbw adbwVar, ckcw ckcwVar, adma admaVar, btpc btpcVar) {
        this.a = adbwVar;
        this.b = ckcwVar;
        this.c = admaVar;
        this.d = btpcVar;
    }

    private final boolean d(aczy<?> aczyVar, @dzsi awwb awwbVar) {
        if (!this.h.containsKey(aczyVar) || this.h.get(aczyVar).booleanValue()) {
            if (awwbVar != null) {
                return awwh.a(awwbVar, f(aczyVar));
            }
            return true;
        }
        return false;
    }

    private final void e(List<cqix<?>> list) {
        cqix<?> fT = cqgr.fT(new adbr(), this.a.a);
        ((aczr) ((cqgu) fT).a).i(this.i);
        this.i++;
        list.add(fT);
    }

    private static Set<awvv<?>> f(aczy<?> aczyVar) {
        if (!(aczyVar instanceof adab)) {
            return dcmr.a;
        }
        return ((adab) aczyVar).g();
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0079, code lost:
        if (r10.e() != false) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01e1 A[LOOP:0: B:3:0x0013->B:100:0x01e1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01e0 A[SYNTHETIC] */
    @Override // defpackage.aczx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<defpackage.cqix<?>> a(java.util.List<defpackage.aczy<? extends defpackage.aczr>> r22, @defpackage.dzsi defpackage.awwb r23, @defpackage.dzsi defpackage.ckgz r24) {
        /*
            Method dump skipped, instructions count: 778
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aebc.a(java.util.List, awwb, ckgz):java.util.List");
    }

    @Override // defpackage.adac
    public final void b(awwb awwbVar, Iterable<adab<?>> iterable, boolean z) {
        for (adab<?> adabVar : iterable) {
            dcen N = dcep.N();
            N.i(adabVar.g());
            N.i(adabVar.h());
            dcep f = N.f();
            awwi awwiVar = new awwi(awwbVar, f);
            if (z) {
                adabVar.i(awwiVar);
            } else {
                awwb awwbVar2 = this.e;
                if (awwbVar2 == null) {
                    adabVar.j(awwiVar);
                } else if (!awwiVar.equals(new awwi(awwbVar2, f))) {
                    adabVar.j(awwiVar);
                }
            }
        }
        this.e = awwbVar;
    }

    public final void c() {
        this.f = true;
    }
}
