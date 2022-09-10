package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dccb  reason: default package */
/* loaded from: classes.dex */
public final class dccb extends dcce {
    final /* synthetic */ dccf a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dccb(dccf dccfVar) {
        super(dccfVar);
        this.a = dccfVar;
    }

    @Override // defpackage.dcce
    public final Object a(int i) {
        return this.a.a[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.a.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int b = dccj.b(obj);
        int c = this.a.c(obj, b);
        if (c != -1) {
            this.a.g(c, b);
            return true;
        }
        return false;
    }
}
