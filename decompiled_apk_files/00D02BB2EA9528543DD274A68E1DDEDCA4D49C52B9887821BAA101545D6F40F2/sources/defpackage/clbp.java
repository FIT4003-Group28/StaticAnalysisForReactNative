package defpackage;

import java.util.Iterator;
/* compiled from: PG */
/* renamed from: clbp  reason: default package */
/* loaded from: classes5.dex */
final class clbp implements Iterator<Integer> {
    final /* synthetic */ clbq a;
    private int b;
    private int c;

    public clbp(clbq clbqVar) {
        this.a = clbqVar;
        clbr clbrVar = clbqVar.a;
        this.b = clbrVar.b;
        this.c = clbrVar.a;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.b;
        clbr clbrVar = this.a.a;
        return i <= clbrVar.d && this.c <= clbrVar.c;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Integer next() {
        clbq clbqVar = this.a;
        int i = clbqVar.b.e;
        int i2 = this.b;
        int i3 = this.c;
        int i4 = (i * i2) + i3;
        clbr clbrVar = clbqVar.a;
        if (i3 < clbrVar.c) {
            this.c = i3 + 1;
        } else {
            this.b = i2 + 1;
            this.c = clbrVar.a;
        }
        return Integer.valueOf(i4);
    }

    @Override // java.util.Iterator
    public final void remove() {
    }
}
