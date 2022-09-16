package defpackage;

import j$.util.Iterator;
import j$.util.function.Consumer;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aonv  reason: default package */
/* loaded from: classes.dex */
public abstract class aonv implements Iterator, aonx {
    @Override // j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // j$.util.Iterator
    /* renamed from: next */
    public final /* bridge */ /* synthetic */ Object mo416next() {
        return Byte.valueOf(a());
    }

    @Override // j$.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
