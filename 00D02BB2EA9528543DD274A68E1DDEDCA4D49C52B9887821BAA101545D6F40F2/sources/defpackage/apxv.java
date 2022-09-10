package defpackage;

import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: apxv  reason: default package */
/* loaded from: classes2.dex */
public final class apxv implements crzp<apsi<Set<String>>> {
    public final btlu a;
    final /* synthetic */ apxx b;

    public apxv(apxx apxxVar, btlu btluVar) {
        this.b = apxxVar;
        this.a = btluVar;
    }

    @Override // defpackage.crzp
    public final void On(crzm<apsi<Set<String>>> crzmVar) {
        apsi<Set<String>> l = crzmVar.l();
        if (l != null) {
            apwn a = this.b.o.a();
            Set<String> a2 = l.a();
            btlu btluVar = this.a;
            if (!a.g(btluVar)) {
                return;
            }
            aqwq aqwqVar = a.e;
            synchronized (aqwqVar.e) {
                dcpd it = dcnm.p(dcep.K(aqwqVar.d.E(aqwq.b, btluVar, dcmr.a)), dcep.K(a2)).iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    aqwqVar.d.Q(aqwq.e(str), btluVar);
                    aqwqVar.d.Q(aqwq.f(str), btluVar);
                }
                if (aqwqVar.d.o(bvjk.ju, btluVar, false)) {
                    aqwqVar.b(btluVar);
                }
            }
            a.f(a2, btluVar);
        }
    }
}
