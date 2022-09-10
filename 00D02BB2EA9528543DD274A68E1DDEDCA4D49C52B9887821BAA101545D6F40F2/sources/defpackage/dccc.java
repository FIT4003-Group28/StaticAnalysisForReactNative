package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dccc  reason: default package */
/* loaded from: classes5.dex */
public final class dccc extends dcce {
    final /* synthetic */ dccf a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dccc(dccf dccfVar) {
        super(dccfVar);
        this.a = dccfVar;
    }

    @Override // defpackage.dcce
    public final Object a(int i) {
        return this.a.b[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.a.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int b = dccj.b(obj);
        int e = this.a.e(obj, b);
        if (e != -1) {
            this.a.h(e, b);
            return true;
        }
        return false;
    }
}
