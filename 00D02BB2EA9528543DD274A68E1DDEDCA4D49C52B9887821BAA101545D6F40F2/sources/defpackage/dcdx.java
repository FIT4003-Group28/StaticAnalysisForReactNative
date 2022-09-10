package defpackage;

import java.util.Iterator;
import java.util.Map;
/* compiled from: PG */
/* renamed from: dcdx  reason: default package */
/* loaded from: classes.dex */
final class dcdx extends dcpd<Map.Entry> {
    final Iterator<? extends Map.Entry> a;
    Object b = null;
    Iterator c = dcgb.a;
    final /* synthetic */ dced d;

    public dcdx(dced dcedVar) {
        this.d = dcedVar;
        this.a = dcedVar.b.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c.hasNext() || this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        if (!this.c.hasNext()) {
            Map.Entry next = this.a.next();
            this.b = next.getKey();
            this.c = ((dccr) next.getValue()).iterator();
        }
        return dcjz.p(this.b, this.c.next());
    }
}
