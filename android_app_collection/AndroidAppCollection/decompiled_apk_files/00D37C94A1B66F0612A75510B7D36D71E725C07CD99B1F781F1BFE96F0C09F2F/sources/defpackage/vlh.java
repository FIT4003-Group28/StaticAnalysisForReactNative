package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: vlh  reason: default package */
/* loaded from: classes4.dex */
public final class vlh implements anir {
    public final List a;
    public final Executor b;

    private vlh(List list, Executor executor) {
        this.a = list;
        this.b = executor;
    }

    public static vlh b(List list, Executor executor) {
        return new vlh(list, executor);
    }

    @Override // defpackage.anir
    public final /* bridge */ /* synthetic */ ankt a(Object obj) {
        final vnd vndVar = (vnd) obj;
        int i = ((amxx) this.a).c;
        ArrayList arrayList = new ArrayList(i);
        amzt listIterator = ((amuk) this.a).listIterator();
        while (listIterator.hasNext()) {
            arrayList.add(((vld) listIterator.next()).c());
        }
        final anir c = ammo.c(new vlg(this, arrayList, i));
        final anjk anjkVar = anjk.a;
        vndVar.a.e.a();
        return anii.i(anii.i(anlz.r(vndVar.a.c.c()), ammo.c(new anir() { // from class: vnc
            @Override // defpackage.anir
            public final ankt a(Object obj2) {
                vnd vndVar2 = vnd.this;
                Void r4 = (Void) obj2;
                return vndVar2.a.b.j(c, anjkVar);
            }
        }), anjk.a), ammo.c(new vlg(this, i, arrayList, 1)), anjk.a);
    }
}
