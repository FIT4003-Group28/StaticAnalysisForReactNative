package defpackage;

import java.util.Iterator;
/* compiled from: PG */
/* renamed from: dcee  reason: default package */
/* loaded from: classes5.dex */
final class dcee extends dcpd {
    int a;
    Object b;
    final /* synthetic */ Iterator c;

    public dcee(Iterator it) {
        this.c = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a > 0 || this.c.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.a;
        if (i <= 0) {
            dcla dclaVar = (dcla) this.c.next();
            this.b = dclaVar.a();
            i = dclaVar.b();
        }
        this.a = i - 1;
        return this.b;
    }
}
