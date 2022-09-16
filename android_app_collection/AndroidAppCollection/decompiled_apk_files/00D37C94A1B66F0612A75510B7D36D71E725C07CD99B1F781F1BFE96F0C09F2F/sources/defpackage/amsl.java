package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
/* compiled from: PG */
/* renamed from: amsl  reason: default package */
/* loaded from: classes.dex */
final class amsl extends AbstractSet {
    final /* synthetic */ amsq a;

    public amsl(amsq amsqVar) {
        this.a = amsqVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Map l = this.a.l();
        if (l != null) {
            return l.entrySet().contains(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            int d = this.a.d(entry.getKey());
            if (d != -1 && akzj.f(this.a.j(d), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return this.a.k();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        amsq amsqVar;
        Map l = this.a.l();
        if (l != null) {
            return l.entrySet().remove(obj);
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (this.a.q()) {
            return false;
        }
        int c = this.a.c();
        int l2 = araa.l(entry.getKey(), entry.getValue(), c, this.a.i(), this.a.r(), this.a.s(), this.a.t());
        if (l2 == -1) {
            return false;
        }
        this.a.o(l2, c);
        amsqVar.f--;
        this.a.m();
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.size();
    }
}
