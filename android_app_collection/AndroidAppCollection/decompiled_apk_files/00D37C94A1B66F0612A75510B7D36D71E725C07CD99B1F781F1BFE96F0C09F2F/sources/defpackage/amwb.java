package defpackage;

import java.util.NoSuchElementException;
/* compiled from: PG */
/* renamed from: amwb  reason: default package */
/* loaded from: classes.dex */
final class amwb extends amzs {
    boolean a;
    final /* synthetic */ Object b;

    public amwb(Object obj) {
        this.b = obj;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        return !this.a;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    /* renamed from: next */
    public final Object mo416next() {
        if (!this.a) {
            this.a = true;
            return this.b;
        }
        throw new NoSuchElementException();
    }
}
