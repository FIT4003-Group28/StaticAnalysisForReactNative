package defpackage;
/* compiled from: PG */
/* renamed from: dmtv  reason: default package */
/* loaded from: classes.dex */
final class dmtv extends dmvv<dmum> {
    int a = 0;
    final /* synthetic */ dmue b;

    public dmtv(dmue dmueVar) {
        this.b = dmueVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a < this.b.j.b;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        dmue dmueVar = this.b;
        int i = this.a;
        this.a = i + 1;
        return dmueVar.p(i);
    }
}
