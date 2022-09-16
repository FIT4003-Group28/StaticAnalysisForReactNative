package defpackage;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Iterator;
import java.util.NoSuchElementException;
/* JADX INFO: Access modifiers changed from: package-private */
/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: PG */
/* renamed from: amwe  reason: default package */
/* loaded from: classes.dex */
public final class amwe extends Enum implements Iterator, j$.util.Iterator {
    public static final amwe a;
    private static final /* synthetic */ amwe[] b;

    static {
        amwe amweVar = new amwe();
        a = amweVar;
        b = new amwe[]{amweVar};
    }

    private amwe() {
    }

    public static amwe[] values() {
        return (amwe[]) b.clone();
    }

    @Override // j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        return false;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    /* renamed from: next */
    public final Object mo416next() {
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        araa.u(false);
    }
}
