package defpackage;
/* compiled from: PG */
/* renamed from: dmtm  reason: default package */
/* loaded from: classes.dex */
final class dmtm extends dmvv<dmvh> {
    int a = 0;
    final /* synthetic */ dmtn b;

    public dmtm(dmtn dmtnVar) {
        this.b = dmtnVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a < this.b.a.b;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        dmtn dmtnVar = this.b;
        int i = this.a;
        this.a = i + 1;
        return dmtnVar.e(i);
    }
}
