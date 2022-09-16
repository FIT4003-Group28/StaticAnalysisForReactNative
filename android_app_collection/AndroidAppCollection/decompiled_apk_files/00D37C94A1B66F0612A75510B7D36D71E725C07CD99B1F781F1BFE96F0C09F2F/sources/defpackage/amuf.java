package defpackage;

import java.util.Iterator;
/* compiled from: PG */
/* renamed from: amuf  reason: default package */
/* loaded from: classes.dex */
public final class amuf extends amtz {
    public amuf() {
        super(4);
    }

    @Override // defpackage.amtz, defpackage.amua
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        super.b(obj);
    }

    public final amuk g() {
        this.c = true;
        return amuk.j(this.a, this.b);
    }

    public final void h(Object obj) {
        super.b(obj);
    }

    public final void i(Object... objArr) {
        super.d(objArr);
    }

    public final void j(Iterable iterable) {
        super.e(iterable);
    }

    public final void k(Iterator it) {
        while (it.hasNext()) {
            super.b(it.next());
        }
    }

    public amuf(int i) {
        super(i);
    }
}
