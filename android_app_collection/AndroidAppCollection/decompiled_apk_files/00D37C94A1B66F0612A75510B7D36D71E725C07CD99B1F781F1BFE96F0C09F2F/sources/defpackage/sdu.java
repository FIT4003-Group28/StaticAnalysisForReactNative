package defpackage;

import j$.util.Iterator;
import j$.util.function.Consumer;
/* compiled from: PG */
/* renamed from: sdu  reason: default package */
/* loaded from: classes4.dex */
final class sdu implements Iterator, java.util.Iterator {
    final /* synthetic */ sdv a;
    private final long b;
    private final long c;
    private long d;
    private int e = 1;

    public sdu(sdv sdvVar, long j, long j2) {
        this.a = sdvVar;
        this.b = j;
        this.c = j2;
        b(1);
    }

    @Override // j$.util.Iterator
    /* renamed from: a */
    public final Long mo416next() {
        long j = this.d;
        sdv sdvVar = this.a;
        this.d = sdvVar.a(sdvVar.a, j, this.e);
        return Long.valueOf(j);
    }

    public final void b(int i) {
        sdv.d(i);
        this.e = i;
        sdv sdvVar = this.a;
        this.d = sdvVar.b(sdvVar.a, this.b, i);
    }

    @Override // j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // j$.util.Iterator
    public final boolean hasNext() {
        return this.d <= this.c;
    }

    @Override // j$.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Cannot remove");
    }
}
