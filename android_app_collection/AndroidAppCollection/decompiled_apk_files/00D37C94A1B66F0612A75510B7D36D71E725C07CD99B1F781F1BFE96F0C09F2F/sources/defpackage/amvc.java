package defpackage;

import java.util.Iterator;
/* compiled from: PG */
/* renamed from: amvc  reason: default package */
/* loaded from: classes.dex */
final class amvc extends amzs {
    int a;
    Object b;
    final /* synthetic */ Iterator c;

    public amvc(Iterator it) {
        this.c = it;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        return this.a > 0 || this.c.hasNext();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    /* renamed from: next */
    public final Object mo416next() {
        int i = this.a;
        if (i <= 0) {
            amxk amxkVar = (amxk) this.c.next();
            this.b = amxkVar.a;
            i = amxkVar.a();
        }
        this.a = i - 1;
        Object obj = this.b;
        obj.getClass();
        return obj;
    }
}
