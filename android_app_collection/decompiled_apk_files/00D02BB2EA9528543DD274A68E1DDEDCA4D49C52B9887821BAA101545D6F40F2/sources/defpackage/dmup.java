package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dmup  reason: default package */
/* loaded from: classes.dex */
public final class dmup extends dmvv<dmum> {
    int a = 0;
    final /* synthetic */ dmut b;

    public dmup(dmut dmutVar) {
        this.b = dmutVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a < this.b.a.b;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        dmut dmutVar = this.b;
        int i = this.a;
        this.a = i + 1;
        return dmutVar.h(i);
    }
}
