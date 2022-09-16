package defpackage;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Iterator;
import java.util.NoSuchElementException;
/* compiled from: PG */
/* renamed from: aztl  reason: default package */
/* loaded from: classes2.dex */
public final class aztl implements Iterator, j$.util.Iterator {
    final /* synthetic */ aztm a;
    private int b = -1;
    private int c;
    private int d;
    private aztd e;

    public aztl(aztm aztmVar) {
        this.a = aztmVar;
        int h = azst.h(0, 0, aztmVar.a.length());
        this.c = h;
        this.d = h;
    }

    private final void a() {
        int i = this.d;
        int i2 = 0;
        if (i < 0) {
            this.b = 0;
            this.e = null;
            return;
        }
        if (i > this.a.a.length()) {
            this.e = new aztd(this.c, ayme.i(this.a.a));
            this.d = -1;
        } else {
            aztm aztmVar = this.a;
            Object invoke = aztmVar.b.invoke(aztmVar.a, Integer.valueOf(this.d));
            if (invoke != null) {
                azqf azqfVar = (azqf) invoke;
                int intValue = ((Number) azqfVar.a).intValue();
                int intValue2 = ((Number) azqfVar.b).intValue();
                this.e = intValue <= Integer.MIN_VALUE ? aztd.d : new aztd(this.c, intValue - 1);
                int i3 = intValue + intValue2;
                this.c = i3;
                if (intValue2 == 0) {
                    i2 = 1;
                }
                this.d = i3 + i2;
            } else {
                this.e = new aztd(this.c, ayme.i(this.a.a));
                this.d = -1;
            }
        }
        this.b = 1;
    }

    @Override // j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        if (this.b == -1) {
            a();
        }
        return this.b == 1;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    /* renamed from: next */
    public final /* bridge */ /* synthetic */ Object mo416next() {
        if (this.b == -1) {
            a();
        }
        if (this.b != 0) {
            aztd aztdVar = this.e;
            if (aztdVar != null) {
                this.e = null;
                this.b = -1;
                return aztdVar;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.ranges.IntRange");
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
