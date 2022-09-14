package defpackage;

import java.util.Iterator;
/* compiled from: PG */
/* renamed from: dcgr  reason: default package */
/* loaded from: classes5.dex */
final class dcgr extends dcnj {
    final /* synthetic */ dcgz a;

    public dcgr(dcgz dcgzVar) {
        this.a = dcgzVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.a.m(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new dcgu(this.a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        return !this.a.d(obj).isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.c.size();
    }
}
