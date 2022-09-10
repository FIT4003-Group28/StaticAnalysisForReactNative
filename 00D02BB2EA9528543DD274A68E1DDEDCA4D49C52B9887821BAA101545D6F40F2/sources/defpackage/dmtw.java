package defpackage;
/* compiled from: PG */
/* renamed from: dmtw  reason: default package */
/* loaded from: classes.dex */
final class dmtw extends dmvv<dmtq> {
    int a = 0;
    final /* synthetic */ dmue b;

    public dmtw(dmue dmueVar) {
        this.b = dmueVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a < this.b.a.b;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        dmue dmueVar = this.b;
        int i = this.a;
        this.a = i + 1;
        return dmueVar.e(i);
    }
}
