package defpackage;
/* compiled from: PG */
/* renamed from: dmtz  reason: default package */
/* loaded from: classes.dex */
final class dmtz extends dmvv<dmtj> {
    int a = 0;
    final /* synthetic */ dmue b;

    public dmtz(dmue dmueVar) {
        this.b = dmueVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a < this.b.m.b;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        dmue dmueVar = this.b;
        int i = this.a;
        this.a = i + 1;
        return dmueVar.A(i);
    }
}
