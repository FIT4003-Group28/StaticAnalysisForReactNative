package defpackage;
/* compiled from: PG */
/* renamed from: dmtp  reason: default package */
/* loaded from: classes.dex */
final class dmtp extends dmvv<dmto> {
    int a = 0;
    final /* synthetic */ dmtq b;

    public dmtp(dmtq dmtqVar) {
        this.b = dmtqVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a < this.b.a.b;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        dmtq dmtqVar = this.b;
        int i = this.a;
        this.a = i + 1;
        return dmtqVar.f(i);
    }
}
