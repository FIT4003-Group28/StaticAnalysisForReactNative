package defpackage;

import java.util.List;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: agim  reason: default package */
/* loaded from: classes.dex */
public final class agim implements agmd {
    final /* synthetic */ agio a;

    public agim(agio agioVar) {
        this.a = agioVar;
    }

    @Override // defpackage.agmd
    public final void a(String str, boolean z) {
        if (!z) {
            agio agioVar = this.a;
            if (agxg.ah(agioVar.c, agioVar.I)) {
                this.a.c().g(str);
                this.a.c().e(str);
                agkg c = this.a.c();
                c.f(c.a(str));
            }
        }
        agkb agkbVar = this.a.o;
        zgh.m(str);
        List<pde> list = ((aghc) agkbVar.a).get();
        if (list == null) {
            return;
        }
        for (pde pdeVar : list) {
            if (pdeVar != null) {
                Set<String> g = pdeVar.g();
                String concat = String.valueOf(str).concat(".");
                for (String str2 : g) {
                    if (str2 != null && str2.startsWith(concat)) {
                        for (pdj pdjVar : pdeVar.f(str2)) {
                            try {
                                pdeVar.l(pdjVar);
                            } catch (pdc unused) {
                            }
                        }
                    }
                }
            }
        }
    }
}
