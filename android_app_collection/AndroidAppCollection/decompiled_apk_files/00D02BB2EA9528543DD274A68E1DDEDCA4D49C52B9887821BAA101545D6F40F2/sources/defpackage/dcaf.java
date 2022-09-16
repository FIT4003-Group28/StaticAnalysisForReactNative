package defpackage;

import java.lang.Comparable;
import java.util.NoSuchElementException;
/* compiled from: PG */
/* renamed from: dcaf  reason: default package */
/* loaded from: classes5.dex */
public abstract class dcaf<C extends Comparable> extends dcfc<C> {
    final dcau<C> a;

    public dcaf(dcau<C> dcauVar) {
        super(dcln.a);
        this.a = dcauVar;
    }

    public static <C extends Comparable> dcaf<C> a(dclz<C> dclzVar, dcau<C> dcauVar) {
        dbsk.s(dclzVar);
        dbsk.s(dcauVar);
        try {
            dclz<C> s = dclzVar.b != dcai.a ? dclzVar : dclzVar.s(dclz.l(dcauVar.b()));
            if (dclzVar.c == dcag.a) {
                s = s.s(dclz.j(dcauVar.a()));
            }
            if (s.p() || dclz.t(dclzVar.b.g(dcauVar), dclzVar.c.h(dcauVar)) > 0) {
                return new dcaw(dcauVar);
            }
            return new dcmg(s, dcauVar);
        } catch (NoSuchElementException e) {
            throw new IllegalArgumentException(e);
        }
    }

    @Override // defpackage.dcfc
    /* renamed from: b */
    public final dcaf<C> u(C c) {
        dbsk.s(c);
        return h(c, false);
    }

    @Override // defpackage.dcfc
    /* renamed from: c */
    public final dcaf<C> t(C c, boolean z) {
        dbsk.s(c);
        return h(c, z);
    }

    @Override // defpackage.dcfc, java.util.NavigableSet, java.util.SortedSet
    /* renamed from: d */
    public final dcaf<C> subSet(C c, C c2) {
        dbsk.s(c);
        dbsk.s(c2);
        dbsk.a(this.b.compare(c, c2) <= 0);
        return i(c, true, c2, false);
    }

    @Override // defpackage.dcfc, java.util.NavigableSet
    /* renamed from: e */
    public final dcaf<C> subSet(C c, boolean z, C c2, boolean z2) {
        dbsk.s(c);
        dbsk.s(c2);
        dbsk.a(this.b.compare(c, c2) <= 0);
        return i(c, z, c2, z2);
    }

    @Override // defpackage.dcfc, java.util.NavigableSet, java.util.SortedSet
    /* renamed from: f */
    public final dcaf<C> tailSet(C c) {
        dbsk.s(c);
        return j(c, true);
    }

    @Override // defpackage.dcfc, java.util.NavigableSet
    /* renamed from: g */
    public final dcaf<C> tailSet(C c, boolean z) {
        dbsk.s(c);
        return j(c, z);
    }

    public abstract dcaf<C> h(C c, boolean z);

    public abstract dcaf<C> i(C c, boolean z, C c2, boolean z2);

    public abstract dcaf<C> j(C c, boolean z);

    public abstract dclz<C> k();

    @Override // defpackage.dcfc
    public dcfc<C> l() {
        return new dcas(this);
    }

    @Override // defpackage.dcfc
    public /* bridge */ /* synthetic */ dcfc m(Object obj, boolean z) {
        throw null;
    }

    @Override // defpackage.dcfc
    public /* bridge */ /* synthetic */ dcfc n(Object obj, boolean z, Object obj2, boolean z2) {
        throw null;
    }

    @Override // defpackage.dcfc
    public /* bridge */ /* synthetic */ dcfc o(Object obj, boolean z) {
        throw null;
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return k().toString();
    }
}
