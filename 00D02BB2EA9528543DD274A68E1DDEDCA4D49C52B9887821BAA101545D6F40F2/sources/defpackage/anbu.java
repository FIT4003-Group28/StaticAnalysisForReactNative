package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: anbu  reason: default package */
/* loaded from: classes2.dex */
final class anbu implements pfh<anbn> {
    final /* synthetic */ anbx a;
    @dzsi
    private pfg b;

    public anbu(anbx anbxVar) {
        this.a = anbxVar;
    }

    @Override // defpackage.pfh
    public final void c(pfg pfgVar) {
        this.a.c();
        this.b = pfgVar;
    }

    @Override // defpackage.pfh
    public final /* bridge */ /* synthetic */ void d(anbn anbnVar) {
        this.a.b(anbnVar);
    }

    @Override // defpackage.pfh
    public final void e() {
        pfg pfgVar = this.b;
        if (pfgVar != null) {
            pfgVar.a();
        }
        final anbx anbxVar = this.a;
        if (!anbxVar.h.get()) {
            return;
        }
        if (anbxVar.g.get() != null && !anbxVar.g.get().b()) {
            return;
        }
        anbxVar.g.set(anbxVar.c.a().e(pfb.a).f(new mw(anbxVar) { // from class: anbt
            private final anbx a;

            {
                this.a = anbxVar;
            }

            @Override // defpackage.mw
            public final void a(Object obj) {
                anbx anbxVar2 = this.a;
                pfo pfoVar = (pfo) obj;
                pfn pfnVar = pfn.CONTEXT_STARTED;
                int ordinal = pfoVar.b.ordinal();
                if (ordinal != 1) {
                    if (ordinal != 3) {
                        return;
                    }
                    anbxVar2.a();
                    return;
                }
                dfoi dfoiVar = anbx.d(pfoVar).b;
                if (dfoiVar == null) {
                    dfoiVar = dfoi.h;
                }
                if (dfoiVar.g) {
                    return;
                }
                dfoe d = anbx.d(pfoVar);
                if (anbxVar2.i <= 0) {
                    return;
                }
                dfoi dfoiVar2 = d.b;
                if (dfoiVar2 == null) {
                    dfoiVar2 = dfoi.h;
                }
                dghy dghyVar = dfoiVar2.b;
                if (dghyVar == null) {
                    dghyVar = dghy.e;
                }
                akqi b = akqi.b(dghyVar.b);
                synchronized (anbxVar2.j) {
                    anbn remove = anbxVar2.j.remove(b);
                    if (remove != null) {
                        anbxVar2.j.put(b, remove);
                        return;
                    }
                    if (anbxVar2.j.size() >= anbxVar2.i) {
                        Map<akqi, anbn> map = anbxVar2.j;
                        anbn remove2 = map.remove(map.keySet().iterator().next());
                        dbsk.s(remove2);
                        remove2.b();
                    }
                    anbxVar2.b(anbxVar2.f.a(d));
                }
            }
        }));
    }
}
