package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: amur  reason: default package */
/* loaded from: classes.dex */
final class amur extends amvn {
    final /* synthetic */ amun a;

    public amur(amun amunVar) {
        this.a = amunVar;
    }

    @Override // defpackage.amvn
    public final boolean a() {
        return false;
    }

    @Override // defpackage.amub, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = this.a.get(entry.getKey());
            if (obj2 != null && obj2.equals(entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.amvn, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.amvn, defpackage.amub, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: k */
    public final amzs iterator() {
        return this.a.a();
    }

    @Override // defpackage.amub
    public final boolean l() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.size();
    }

    @Override // defpackage.amvn, defpackage.amub
    Object writeReplace() {
        return new amuq(this.a);
    }

    public amur() {
    }
}
