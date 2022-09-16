package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: amtq  reason: default package */
/* loaded from: classes.dex */
public final class amtq extends amtt {
    final /* synthetic */ amtu a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amtq(amtu amtuVar) {
        super(amtuVar);
        this.a = amtuVar;
    }

    @Override // defpackage.amtt
    public final Object a(int i) {
        return this.a.a[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.a.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int G = arey.G(obj);
        int d = this.a.d(obj, G);
        if (d != -1) {
            this.a.j(d, G);
            return true;
        }
        return false;
    }
}
