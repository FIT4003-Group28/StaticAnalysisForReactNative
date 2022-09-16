package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dmur  reason: default package */
/* loaded from: classes6.dex */
public final class dmur extends dmvv<dmuo> {
    int a = 0;
    final /* synthetic */ dmut b;

    public dmur(dmut dmutVar) {
        this.b = dmutVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a < this.b.c.b;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        dmut dmutVar = this.b;
        int i = this.a;
        this.a = i + 1;
        return dmutVar.I(i);
    }
}
