package defpackage;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;
/* compiled from: PG */
/* renamed from: aorj  reason: default package */
/* loaded from: classes.dex */
final class aorj implements Iterator, j$.util.Iterator {
    private final ArrayDeque a;
    private aony b;

    public aorj(aoob aoobVar) {
        if (aoobVar instanceof aorl) {
            aorl aorlVar = (aorl) aoobVar;
            ArrayDeque arrayDeque = new ArrayDeque(aorlVar.g);
            this.a = arrayDeque;
            arrayDeque.push(aorlVar);
            this.b = b(aorlVar.e);
            return;
        }
        this.a = null;
        this.b = (aony) aoobVar;
    }

    private final aony b(aoob aoobVar) {
        while (aoobVar instanceof aorl) {
            aorl aorlVar = (aorl) aoobVar;
            this.a.push(aorlVar);
            int[] iArr = aorl.a;
            aoobVar = aorlVar.e;
        }
        return (aony) aoobVar;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    /* renamed from: a */
    public final aony mo416next() {
        aony aonyVar;
        aony aonyVar2 = this.b;
        if (aonyVar2 == null) {
            throw new NoSuchElementException();
        }
        do {
            ArrayDeque arrayDeque = this.a;
            aonyVar = null;
            if (arrayDeque == null || arrayDeque.isEmpty()) {
                break;
            }
            int[] iArr = aorl.a;
            aonyVar = b(((aorl) this.a.pop()).f);
        } while (aonyVar.H());
        this.b = aonyVar;
        return aonyVar2;
    }

    @Override // j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        return this.b != null;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
