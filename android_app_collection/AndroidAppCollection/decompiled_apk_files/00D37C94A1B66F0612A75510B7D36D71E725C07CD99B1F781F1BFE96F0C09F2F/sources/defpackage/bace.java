package defpackage;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Iterator;
import java.util.NoSuchElementException;
/* compiled from: PG */
/* renamed from: bace  reason: default package */
/* loaded from: classes2.dex */
final class bace implements Iterator, j$.util.Iterator {
    final /* synthetic */ bacf a;
    private final int b;
    private int c;
    private boolean d;

    public bace(bacf bacfVar) {
        this.a = bacfVar;
        bacfVar.b++;
        this.b = bacfVar.a.size();
    }

    private final void a() {
        if (!this.d) {
            this.d = true;
            bacf bacfVar = this.a;
            int i = bacfVar.b - 1;
            bacfVar.b = i;
            if (i > 0 || !bacfVar.c) {
                return;
            }
            bacfVar.c = false;
            int size = bacfVar.a.size();
            while (true) {
                size--;
                if (size < 0) {
                    return;
                }
                if (bacfVar.a.get(size) == null) {
                    bacfVar.a.remove(size);
                }
            }
        }
    }

    @Override // j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        int i = this.c;
        while (i < this.b && this.a.a(i) == null) {
            i++;
        }
        if (i < this.b) {
            return true;
        }
        a();
        return false;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    /* renamed from: next */
    public final Object mo416next() {
        while (true) {
            int i = this.c;
            if (i >= this.b || this.a.a(i) != null) {
                break;
            }
            this.c++;
        }
        int i2 = this.c;
        if (i2 >= this.b) {
            a();
            throw new NoSuchElementException();
        }
        bacf bacfVar = this.a;
        this.c = i2 + 1;
        return bacfVar.a(i2);
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
