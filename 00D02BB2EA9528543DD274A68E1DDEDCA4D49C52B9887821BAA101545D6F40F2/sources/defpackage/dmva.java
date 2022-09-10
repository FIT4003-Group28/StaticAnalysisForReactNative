package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dmva  reason: default package */
/* loaded from: classes6.dex */
public final class dmva extends dmvv<dmuy> {
    int a = 0;
    final /* synthetic */ dmvb b;

    public dmva(dmvb dmvbVar) {
        this.b = dmvbVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a < this.b.b.b;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        dmvb dmvbVar = this.b;
        int i = this.a;
        this.a = i + 1;
        return dmvbVar.h(i);
    }
}
