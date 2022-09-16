package defpackage;

import defpackage.dssi;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
/* compiled from: PG */
/* renamed from: csiz  reason: default package */
/* loaded from: classes5.dex */
public final class csiz<E extends dssi> {
    private final Map<Integer, dzsj<csiw<E, dssj>>> a;
    private final dsqa b = dsqa.c();

    public csiz(Map<Integer, dzsj<csiw<E, dssj>>> map) {
        this.a = map;
    }

    public final <TargetT extends dsqs<TargetT, ?>> void a(TargetT targett, List<Integer> list, @dzsi final E e, List<dehn<csiv<E>>> list2) {
        Object b;
        for (Integer num : list) {
            dzsj<csiw<E, dssj>> dzsjVar = this.a.get(Integer.valueOf(num.intValue()));
            csiw<E, dssj> a = dzsjVar == null ? null : dzsjVar.a();
            if (a != null) {
                dsqv d = this.b.d((dsqs) ((dsqw) targett.cu(6)), num.intValue());
                targett.f(d);
                Object l = targett.V.l(d.d);
                if (l == null) {
                    b = d.b;
                } else {
                    b = d.b(l);
                }
                dehn<csiv<E>> a2 = a.a((dssj) b);
                dbsk.s(a2);
                if (csiw.a.equals(a2)) {
                    continue;
                } else if (e != null) {
                    if (a2.isDone()) {
                        try {
                            ((csiv) deha.r(a2)).a(e);
                        } catch (ExecutionException e2) {
                            throw new RuntimeException(e2);
                        }
                    } else {
                        list2.add(deew.h(a2, new dbrn(e) { // from class: csix
                            private final dssi a;

                            {
                                this.a = e;
                            }

                            @Override // defpackage.dbrn
                            public final Object a(Object obj) {
                                final dssi dssiVar = this.a;
                                final csiv csivVar = (csiv) obj;
                                return new csiv(csivVar, dssiVar) { // from class: csiy
                                    private final csiv a;
                                    private final dssi b;

                                    {
                                        this.a = csivVar;
                                        this.b = dssiVar;
                                    }

                                    @Override // defpackage.csiv
                                    public final void a(dssi dssiVar2) {
                                        this.a.a(this.b);
                                    }
                                };
                            }
                        }, dege.a));
                    }
                } else {
                    list2.add(a2);
                }
            }
        }
    }
}
