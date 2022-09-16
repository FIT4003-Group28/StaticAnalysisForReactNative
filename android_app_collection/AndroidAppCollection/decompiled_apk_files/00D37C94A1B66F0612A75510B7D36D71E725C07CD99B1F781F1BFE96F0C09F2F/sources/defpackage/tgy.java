package defpackage;

import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: tgy  reason: default package */
/* loaded from: classes4.dex */
final class tgy implements tcm {
    final /* synthetic */ tgz b;

    public tgy(tgz tgzVar) {
        this.b = tgzVar;
    }

    @Override // defpackage.tcm
    public final tcp a(cyv cyvVar, int i) {
        ajiy ajiyVar = this.b.g;
        thq thqVar = (thq) tgt.b.get(i);
        if (thqVar != null && ajiyVar.a(thqVar)) {
            if (tgz.b.compareAndSet(true, false)) {
                final thd thdVar = (thd) this.b.c;
                thdVar.b.execute(new Runnable() { // from class: thc
                    @Override // java.lang.Runnable
                    public final void run() {
                        thd thdVar2 = thd.this;
                        List a = aohk.a();
                        List b = aohk.b();
                        if (thdVar2.d.a(thq.NATIVE_LIBRARY_CHECK)) {
                            for (thn thnVar : thd.a(a)) {
                                thnVar.b(thq.NATIVE_LIBRARY_CHECK.m);
                                thdVar2.a.f(thdVar2.c, thnVar.a());
                            }
                        }
                        if (thdVar2.d.a(thq.NATIVE_LIBRARY_LOAD)) {
                            for (thn thnVar2 : thd.a(b)) {
                                thnVar2.b(thq.NATIVE_LIBRARY_LOAD.m);
                                thdVar2.a.f(thdVar2.c, thnVar2.a());
                            }
                        }
                    }
                });
            }
            aflw aflwVar = cyvVar.m;
            tdt tdtVar = (tdt) (aflwVar == null ? null : aflwVar.f(tdt.class));
            if (tdtVar != null && tdtVar.b.compareAndSet(true, false)) {
                tgz tgzVar = this.b;
                return new tgt(i, tgzVar.f, tgzVar.d, tgzVar.e);
            }
        }
        return tcp.a;
    }

    @Override // defpackage.tcm
    public final boolean b() {
        return true;
    }

    @Override // defpackage.tcm
    public final /* synthetic */ Map c(aflw aflwVar) {
        return tfo.q(this, aflwVar);
    }
}
