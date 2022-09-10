package defpackage;
/* compiled from: PG */
/* renamed from: dmtt  reason: default package */
/* loaded from: classes.dex */
final class dmtt extends dmvv<dmvi> {
    int a = 0;
    final /* synthetic */ dmue b;

    public dmtt(dmue dmueVar) {
        this.b = dmueVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a < this.b.h.b;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        dmue dmueVar = this.b;
        int i = this.a;
        this.a = i + 1;
        return dmueVar.n(i);
    }
}
