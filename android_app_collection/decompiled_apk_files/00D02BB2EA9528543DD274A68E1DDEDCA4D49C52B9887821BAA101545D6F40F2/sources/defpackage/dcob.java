package defpackage;
/* compiled from: PG */
/* renamed from: dcob  reason: default package */
/* loaded from: classes5.dex */
abstract class dcob<T> extends dcnj<T> {
    final /* synthetic */ dcoc b;

    public dcob(dcoc dcocVar) {
        this.b = dcocVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.b.b.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.b.b.isEmpty();
    }
}
