package defpackage;

import java.lang.Comparable;
import java.util.Collection;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dcmg  reason: default package */
/* loaded from: classes5.dex */
public final class dcmg<C extends Comparable> extends dcaf<C> {
    private static final long serialVersionUID = 0;
    private final dclz<C> d;

    public dcmg(dclz<C> dclzVar, dcau<C> dcauVar) {
        super(dcauVar);
        this.d = dclzVar;
    }

    public static boolean W(Comparable<?> comparable, Comparable<?> comparable2) {
        return comparable2 != null && dclz.t(comparable, comparable2) == 0;
    }

    private final dcaf<C> Z(dclz<C> dclzVar) {
        if (this.d.r(dclzVar)) {
            return dcaf.a(this.d.s(dclzVar), this.a);
        }
        return new dcaw(this.a);
    }

    @Override // defpackage.dcfc, defpackage.dcep, defpackage.dccr, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    /* renamed from: SE */
    public final dcpd<C> iterator() {
        return new dcmc(this, first());
    }

    @Override // defpackage.dcfc, java.util.NavigableSet
    /* renamed from: SG */
    public final dcpd<C> descendingIterator() {
        return new dcmd(this, last());
    }

    @Override // defpackage.dcep
    public final dcdc<C> SH() {
        boolean z = this.a.b;
        return new dcme(this);
    }

    @Override // defpackage.dccr
    public final boolean SI() {
        return false;
    }

    @Override // defpackage.dcfc, java.util.SortedSet
    /* renamed from: X */
    public final C first() {
        return this.d.b.g(this.a);
    }

    @Override // defpackage.dcfc, java.util.SortedSet
    /* renamed from: Y */
    public final C last() {
        return this.d.c.h(this.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dccr, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return this.d.a((Comparable) obj);
        } catch (ClassCastException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection<?> collection) {
        return dbze.e(this, collection);
    }

    @Override // defpackage.dcep, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dcmg) {
            dcmg dcmgVar = (dcmg) obj;
            if (this.a.equals(dcmgVar.a)) {
                return first().equals(dcmgVar.first()) && last().equals(dcmgVar.last());
            }
        }
        return super.equals(obj);
    }

    @Override // defpackage.dcaf, defpackage.dcfc
    /* renamed from: h */
    public final dcaf<C> o(C c, boolean z) {
        return Z(dclz.k(c, dbyz.a(z)));
    }

    @Override // defpackage.dcep, java.util.Collection, java.util.Set
    public final int hashCode() {
        return dcnm.r(this);
    }

    @Override // defpackage.dcaf, defpackage.dcfc
    /* renamed from: i */
    public final dcaf<C> n(C c, boolean z, C c2, boolean z2) {
        if (c.compareTo(c2) != 0 || z || z2) {
            return Z(dclz.h(c, dbyz.a(z), c2, dbyz.a(z2)));
        }
        return new dcaw(this.a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return false;
    }

    @Override // defpackage.dcaf, defpackage.dcfc
    /* renamed from: j */
    public final dcaf<C> m(C c, boolean z) {
        return Z(dclz.m(c, dbyz.a(z)));
    }

    @Override // defpackage.dcaf
    public final dclz<C> k() {
        return dclz.d(this.d.b.c(dbyz.CLOSED, this.a), this.d.c.d(dbyz.CLOSED, this.a));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        long intValue = ((Integer) last()).intValue() - ((Integer) first()).intValue();
        if (intValue >= 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return ((int) intValue) + 1;
    }

    @Override // defpackage.dcfc, defpackage.dcep, defpackage.dccr
    Object writeReplace() {
        return new dcmf(this.d, this.a);
    }
}
