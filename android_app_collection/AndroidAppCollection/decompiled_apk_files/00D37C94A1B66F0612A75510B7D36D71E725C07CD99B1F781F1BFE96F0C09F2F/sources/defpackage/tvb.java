package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
/* compiled from: PG */
/* renamed from: tvb  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class tvb implements anir {
    public final /* synthetic */ tve a;
    private final /* synthetic */ int b;

    public /* synthetic */ tvb(tve tveVar) {
        this.a = tveVar;
    }

    public /* synthetic */ tvb(tve tveVar, int i) {
        this.b = i;
        this.a = tveVar;
    }

    @Override // defpackage.anir
    public final ankt a(Object obj) {
        if (this.b == 0) {
            final tve tveVar = this.a;
            final Boolean bool = (Boolean) obj;
            return anii.i(tveVar.b.c(), new anir() { // from class: tuy
                @Override // defpackage.anir
                public final ankt a(Object obj2) {
                    final tve tveVar2 = tve.this;
                    final Boolean bool2 = bool;
                    final List<tqy> list = (List) obj2;
                    final ArrayList arrayList = new ArrayList();
                    for (tqy tqyVar : list) {
                        arrayList.add(tveVar2.b.e(tqyVar));
                    }
                    return anlz.j(arrayList).b(new aniq() { // from class: tva
                        @Override // defpackage.aniq
                        public final ankt a() {
                            tve tveVar3 = tve.this;
                            List list2 = list;
                            List list3 = arrayList;
                            Boolean bool3 = bool2;
                            ankt q = anlz.q(true);
                            for (int i = 0; i < list2.size(); i++) {
                                q = anii.i(q, new tvd(tveVar3, (tqy) list2.get(i), (tqz) anlz.y((Future) list3.get(i)), 1), tveVar3.d);
                            }
                            return anii.h(q, new liw(bool3, 7), tveVar3.d);
                        }
                    }, tveVar2.d);
                }
            }, tveVar.d);
        }
        tve tveVar2 = this.a;
        return anii.i(tveVar2.b(tveVar2.c.a()), new tuw(tveVar2, (tzb) obj, 1), tveVar2.d);
    }
}
