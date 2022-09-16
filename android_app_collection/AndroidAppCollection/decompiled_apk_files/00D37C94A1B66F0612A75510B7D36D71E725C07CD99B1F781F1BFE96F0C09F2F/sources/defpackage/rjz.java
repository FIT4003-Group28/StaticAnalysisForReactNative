package defpackage;

import com.google.android.gms.measurement.internal.EventParams;
import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Iterator;
/* compiled from: PG */
/* renamed from: rjz  reason: default package */
/* loaded from: classes4.dex */
public final class rjz implements Iterator, j$.util.Iterator {
    final Iterator a;
    final /* synthetic */ EventParams b;

    public rjz(EventParams eventParams) {
        this.b = eventParams;
        this.a = eventParams.a.keySet().iterator();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    /* renamed from: a */
    public final String mo416next() {
        return (String) this.a.next();
    }

    @Override // j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }
}
