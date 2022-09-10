package defpackage;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: alxf  reason: default package */
/* loaded from: classes2.dex */
public final class alxf implements Iterator<Integer> {
    final /* synthetic */ alxh a;
    private final Deque<Integer> b;
    private final akrp c;
    private final int d;
    private int e;

    public alxf(alxh alxhVar, akrp akrpVar, int i) {
        this.a = alxhVar;
        ArrayDeque arrayDeque = new ArrayDeque();
        this.b = arrayDeque;
        this.c = akrpVar;
        this.d = i;
        arrayDeque.add(0);
        this.e = -1;
        if (alxhVar.h(i)) {
            b();
        }
    }

    private final void b() {
        if (this.b.isEmpty()) {
            this.e = -1;
            return;
        }
        Integer pollFirst = this.b.pollFirst();
        dbsk.s(pollFirst);
        this.e = pollFirst.intValue();
        while (true) {
            if (this.a.h(this.e)) {
                alxh alxhVar = this.a;
                alxe[] alxeVarArr = alxhVar.a;
                int i = this.e;
                alxe alxeVar = alxeVarArr[i];
                akrp akrpVar = this.c;
                akra akraVar = akrpVar.b;
                akra akraVar2 = akrpVar.a;
                if (alxeVar.a <= akraVar.a && alxeVar.b <= akraVar.b && alxeVar.c >= akraVar2.a && alxeVar.d >= akraVar2.b) {
                    if (i >= alxh.e(alxhVar.b - 1)) {
                        return;
                    }
                    int g = alxh.g(this.e);
                    alxh alxhVar2 = this.a;
                    int numberOfTrailingZeros = Integer.numberOfTrailingZeros(Integer.highestOneBit(g + 1));
                    if (alxh.e(alxhVar2.b - 1) + ((g - alxh.e(numberOfTrailingZeros)) << ((alxhVar2.b - numberOfTrailingZeros) - 1)) <= this.d) {
                        this.e = g;
                    } else {
                        this.b.offerFirst(Integer.valueOf(g));
                        this.e = alxh.f(this.e);
                    }
                }
            }
            if (this.b.isEmpty()) {
                this.e = -1;
                return;
            }
            Integer pollFirst2 = this.b.pollFirst();
            dbsk.s(pollFirst2);
            this.e = pollFirst2.intValue();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.e >= 0;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator
    /* renamed from: a */
    public final Integer next() {
        if (hasNext()) {
            int i = this.e;
            b();
            return Integer.valueOf(i);
        }
        throw new IndexOutOfBoundsException();
    }
}
