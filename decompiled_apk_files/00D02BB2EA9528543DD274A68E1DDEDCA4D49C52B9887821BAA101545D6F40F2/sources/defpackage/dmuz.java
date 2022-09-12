package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dmuz  reason: default package */
/* loaded from: classes6.dex */
public final class dmuz extends dmvv<dmun> {
    int a = 0;
    final /* synthetic */ dmvb b;

    public dmuz(dmvb dmvbVar) {
        this.b = dmvbVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a < this.b.a.b;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        dmvb dmvbVar = this.b;
        int i = this.a;
        this.a = i + 1;
        return dmvbVar.f(i);
    }
}
