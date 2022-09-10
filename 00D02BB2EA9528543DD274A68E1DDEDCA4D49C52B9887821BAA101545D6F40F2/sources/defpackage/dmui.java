package defpackage;
/* compiled from: PG */
/* renamed from: dmui  reason: default package */
/* loaded from: classes6.dex */
final class dmui extends dmvv<dmul> {
    int a = 0;
    final /* synthetic */ dmuk b;

    public dmui(dmuk dmukVar) {
        this.b = dmukVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a < this.b.b.b;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        dmuk dmukVar = this.b;
        int i = this.a;
        this.a = i + 1;
        return dmukVar.e(i);
    }
}
