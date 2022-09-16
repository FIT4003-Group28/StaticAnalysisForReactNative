package defpackage;

import java.lang.ref.WeakReference;
/* compiled from: PG */
/* renamed from: cjol  reason: default package */
/* loaded from: classes4.dex */
final class cjol implements crzp<Integer> {
    private final WeakReference<cjoo> a;

    public cjol(cjoo cjooVar) {
        this.a = new WeakReference<>(cjooVar);
    }

    @Override // defpackage.crzp
    public final void On(crzm<Integer> crzmVar) {
        int i;
        cjoo cjooVar = this.a.get();
        if (cjooVar == null || !cjooVar.aD) {
            return;
        }
        boolean z = false;
        if (crzmVar.l() != null) {
            Integer l = crzmVar.l();
            dbsk.s(l);
            i = l.intValue();
        } else {
            i = 0;
        }
        if (cjooVar.aU == null) {
            return;
        }
        if (cjooVar.aA.f()) {
            cjpx cjpxVar = cjooVar.aU;
            if (i > 0) {
                z = true;
            }
            cjpxVar.m(cjpp.MESSAGES, z);
            cjooVar.aU.n(cjpp.MESSAGES, Integer.valueOf(i));
            return;
        }
        cjooVar.aU.n(cjpp.MESSAGES, null);
        if (cjooVar.aU.o() == cjpp.MESSAGES) {
            cjooVar.aU.m(cjpp.MESSAGES, false);
            cjooVar.w();
            return;
        }
        cjpx cjpxVar2 = cjooVar.aU;
        if (i > 0) {
            z = true;
        }
        cjpxVar2.m(cjpp.MESSAGES, z);
    }
}
