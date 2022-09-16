package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: amtr  reason: default package */
/* loaded from: classes.dex */
public final class amtr extends amtt {
    final /* synthetic */ amtu a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amtr(amtu amtuVar) {
        super(amtuVar);
        this.a = amtuVar;
    }

    @Override // defpackage.amtt
    public final Object a(int i) {
        return this.a.b[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.a.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int G = arey.G(obj);
        int f = this.a.f(obj, G);
        if (f != -1) {
            this.a.k(f, G);
            return true;
        }
        return false;
    }
}
