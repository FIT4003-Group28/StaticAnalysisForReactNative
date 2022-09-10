package defpackage;
/* compiled from: PG */
/* renamed from: dmvd  reason: default package */
/* loaded from: classes6.dex */
final class dmvd extends dmvv<dmuu> {
    int a = 0;
    final /* synthetic */ dmve b;

    public dmvd(dmve dmveVar) {
        this.b = dmveVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a < this.b.b.b;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        dmve dmveVar = this.b;
        int i = this.a;
        this.a = i + 1;
        return dmveVar.g(i);
    }
}
