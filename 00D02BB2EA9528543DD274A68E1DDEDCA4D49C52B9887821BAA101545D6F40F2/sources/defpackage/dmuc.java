package defpackage;
/* compiled from: PG */
/* renamed from: dmuc  reason: default package */
/* loaded from: classes.dex */
final class dmuc extends dmvv<dmuw> {
    int a = 0;
    final /* synthetic */ dmue b;

    public dmuc(dmue dmueVar) {
        this.b = dmueVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a < this.b.d.b;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        dmue dmueVar = this.b;
        int i = this.a;
        this.a = i + 1;
        return dmueVar.h(i);
    }
}
