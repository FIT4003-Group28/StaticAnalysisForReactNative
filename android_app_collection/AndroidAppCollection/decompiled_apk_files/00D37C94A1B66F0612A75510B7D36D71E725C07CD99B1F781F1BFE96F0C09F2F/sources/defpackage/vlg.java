package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
/* compiled from: PG */
/* renamed from: vlg  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class vlg implements anir {
    public final /* synthetic */ vlh a;
    public final /* synthetic */ List b;
    public final /* synthetic */ int c;
    private final /* synthetic */ int d;

    public /* synthetic */ vlg(vlh vlhVar, int i, List list, int i2) {
        this.d = i2;
        this.a = vlhVar;
        this.c = i;
        this.b = list;
    }

    public /* synthetic */ vlg(vlh vlhVar, List list, int i) {
        this.a = vlhVar;
        this.b = list;
        this.c = i;
    }

    @Override // defpackage.anir
    public final ankt a(Object obj) {
        if (this.d == 0) {
            final vlh vlhVar = this.a;
            final List list = this.b;
            final int i = this.c;
            final aoqu aoquVar = (aoqu) obj;
            return anlz.j(list).b(ammo.b(new aniq() { // from class: vle
                @Override // defpackage.aniq
                public final ankt a() {
                    vlh vlhVar2 = vlh.this;
                    aoqu aoquVar2 = aoquVar;
                    int i2 = i;
                    List list2 = list;
                    ankt q = anlz.q(aoquVar2);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if (((Boolean) anlz.y((Future) list2.get(i3))).booleanValue()) {
                            final vld vldVar = (vld) vlhVar2.a.get(i3);
                            q = anii.i(q, ammo.c(new anir() { // from class: vlf
                                @Override // defpackage.anir
                                public final ankt a(Object obj2) {
                                    return vld.this.b((aoqu) obj2);
                                }
                            }), anjk.a);
                        }
                    }
                    return q;
                }
            }), vlhVar.b);
        }
        vlh vlhVar2 = this.a;
        int i2 = this.c;
        List list2 = this.b;
        ArrayList arrayList = new ArrayList(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            if (((Boolean) anlz.y((Future) list2.get(i3))).booleanValue()) {
                arrayList.add(((vld) vlhVar2.a.get(i3)).a());
            }
        }
        return anlz.l(arrayList).a(almu.o(), anjk.a);
    }
}
