package defpackage;
/* compiled from: PG */
/* renamed from: dmtx  reason: default package */
/* loaded from: classes.dex */
final class dmtx extends dmvv<dmtl> {
    int a = 0;
    final /* synthetic */ dmue b;

    public dmtx(dmue dmueVar) {
        this.b = dmueVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a < this.b.k.b;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        dmue dmueVar = this.b;
        int i = this.a;
        this.a = i + 1;
        return dmueVar.q(i);
    }
}
