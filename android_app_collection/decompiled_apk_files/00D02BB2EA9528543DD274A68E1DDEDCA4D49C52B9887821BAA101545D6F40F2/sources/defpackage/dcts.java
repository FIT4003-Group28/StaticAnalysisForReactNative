package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;
/* compiled from: PG */
/* renamed from: dcts  reason: default package */
/* loaded from: classes5.dex */
final class dcts implements Iterator {
    final /* synthetic */ dctt a;
    private int b = 0;

    public dcts(dctt dcttVar) {
        this.a = dcttVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b < this.a.size();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.b;
        if (i < this.a.size()) {
            dctt dcttVar = this.a;
            Object obj = dcttVar.b.b[dcttVar.a() + i];
            this.b = i + 1;
            return obj;
        }
        throw new NoSuchElementException();
    }
}
