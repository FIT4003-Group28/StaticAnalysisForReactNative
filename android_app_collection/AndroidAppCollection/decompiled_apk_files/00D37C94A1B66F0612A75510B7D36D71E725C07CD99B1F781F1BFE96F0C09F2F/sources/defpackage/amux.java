package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: amux  reason: default package */
/* loaded from: classes.dex */
public final class amux extends amub {
    public final amup a;

    public amux(amup amupVar) {
        this.a = amupVar;
    }

    @Override // defpackage.amub, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj != null) {
            amzs it = iterator();
            while (it.hasNext()) {
                if (obj.equals(it.next())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Override // defpackage.amub
    public final amuk g() {
        return new amuv(this.a.entrySet().g());
    }

    @Override // defpackage.amub, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: k */
    public final amzs iterator() {
        return new amuu(this);
    }

    @Override // defpackage.amub
    public final boolean l() {
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.a.size();
    }

    @Override // defpackage.amub
    Object writeReplace() {
        return new amuw(this.a);
    }
}
