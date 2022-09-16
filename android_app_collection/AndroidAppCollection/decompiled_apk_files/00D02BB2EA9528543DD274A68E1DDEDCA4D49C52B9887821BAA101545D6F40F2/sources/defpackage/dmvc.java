package defpackage;
/* compiled from: PG */
/* renamed from: dmvc  reason: default package */
/* loaded from: classes6.dex */
final class dmvc extends dmvv<dmvb> {
    int a = 0;
    final /* synthetic */ dmve b;

    public dmvc(dmve dmveVar) {
        this.b = dmveVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a < this.b.a.b;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        dmve dmveVar = this.b;
        int i = this.a;
        this.a = i + 1;
        return dmveVar.e(i);
    }
}
