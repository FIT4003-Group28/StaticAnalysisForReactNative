package defpackage;

import defpackage.dssj;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
/* compiled from: PG */
/* renamed from: czkl  reason: default package */
/* loaded from: classes5.dex */
public final class czkl<T extends dssj> implements defg<czmk, Void> {
    public final List<czkg<T>> a;
    public final Executor b;

    public czkl(List<czkg<T>> list, Executor executor) {
        this.a = list;
        this.b = executor;
    }

    @Override // defpackage.defg
    public final /* bridge */ /* synthetic */ dehn<Void> a(czmk czmkVar) {
        czmk czmkVar2 = czmkVar;
        final int size = this.a.size();
        final ArrayList arrayList = new ArrayList(size);
        for (czkg<T> czkgVar : this.a) {
            arrayList.add(czkgVar.a());
        }
        return deew.g(czmkVar2.a(dazv.h(new defg(this, arrayList, size) { // from class: czkh
            private final czkl a;
            private final List b;
            private final int c;

            {
                this.a = this;
                this.b = arrayList;
                this.c = size;
            }

            @Override // defpackage.defg
            public final dehn a(Object obj) {
                final czkl czklVar = this.a;
                final List list = this.b;
                final int i = this.c;
                final dssj dssjVar = (dssj) obj;
                return deha.l(list).a(dazv.f(new deff(czklVar, dssjVar, i, list) { // from class: czkj
                    private final czkl a;
                    private final dssj b;
                    private final int c;
                    private final List d;

                    {
                        this.a = czklVar;
                        this.b = dssjVar;
                        this.c = i;
                        this.d = list;
                    }

                    @Override // defpackage.deff
                    public final dehn a() {
                        czkl czklVar2 = this.a;
                        dssj dssjVar2 = this.b;
                        int i2 = this.c;
                        List list2 = this.d;
                        dehn a = deha.a(dssjVar2);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if (((Boolean) deha.r((Future) list2.get(i3))).booleanValue()) {
                                final czkg czkgVar2 = (czkg) czklVar2.a.get(i3);
                                a = deew.g(a, dazv.h(new defg(czkgVar2) { // from class: czkk
                                    private final czkg a;

                                    {
                                        this.a = czkgVar2;
                                    }

                                    @Override // defpackage.defg
                                    public final dehn a(Object obj2) {
                                        dssj dssjVar3 = (dssj) obj2;
                                        return this.a.c();
                                    }
                                }), dege.a);
                            }
                        }
                        return a;
                    }
                }), czklVar.b);
            }
        }), dege.a), dazv.h(new defg(this, size, arrayList) { // from class: czki
            private final czkl a;
            private final int b;
            private final List c;

            {
                this.a = this;
                this.b = size;
                this.c = arrayList;
            }

            @Override // defpackage.defg
            public final dehn a(Object obj) {
                czkl czklVar = this.a;
                int i = this.b;
                List list = this.c;
                ArrayList arrayList2 = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    if (((Boolean) deha.r((Future) list.get(i2))).booleanValue()) {
                        arrayList2.add(((czkg) czklVar.a.get(i2)).b());
                    }
                }
                return deha.n(arrayList2).b(defi.a(), dege.a);
            }
        }), dege.a);
    }
}
