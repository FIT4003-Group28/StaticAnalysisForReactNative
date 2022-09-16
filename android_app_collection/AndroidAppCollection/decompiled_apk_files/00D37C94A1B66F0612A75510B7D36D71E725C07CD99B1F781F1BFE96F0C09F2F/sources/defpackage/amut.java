package defpackage;

import java.util.Iterator;
import java.util.Map;
/* compiled from: PG */
/* renamed from: amut  reason: default package */
/* loaded from: classes.dex */
final class amut extends amvt {
    private final amup a;

    public amut(amup amupVar) {
        this.a = amupVar;
    }

    @Override // defpackage.amvt
    public final Object c(int i) {
        return ((Map.Entry) this.a.entrySet().g().get(i)).getKey();
    }

    @Override // defpackage.amub, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.a.containsKey(obj);
    }

    @Override // defpackage.amvt, defpackage.amvn, defpackage.amub, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return iterator();
    }

    @Override // defpackage.amvt, defpackage.amvn, defpackage.amub
    public final amzs k() {
        return this.a.se();
    }

    @Override // defpackage.amub
    public final boolean l() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.size();
    }

    @Override // defpackage.amvn, defpackage.amub
    Object writeReplace() {
        return new amus(this.a);
    }
}
