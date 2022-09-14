package defpackage;

import java.lang.Comparable;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dcaw  reason: default package */
/* loaded from: classes5.dex */
public final class dcaw<C extends Comparable> extends dcaf<C> {
    public dcaw(dcau<C> dcauVar) {
        super(dcauVar);
    }

    @Override // defpackage.dcfc, defpackage.dcep, defpackage.dccr
    public final dcpd<C> SE() {
        return dcgb.a;
    }

    @Override // defpackage.dcfc
    public final dcpd<C> SG() {
        return dcgb.a;
    }

    @Override // defpackage.dccr
    public final boolean SI() {
        return false;
    }

    @Override // defpackage.dccr, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return false;
    }

    @Override // defpackage.dcfc, java.util.NavigableSet
    public final /* bridge */ /* synthetic */ Iterator descendingIterator() {
        return dcgb.a;
    }

    @Override // defpackage.dcep, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj instanceof Set) {
            return ((Set) obj).isEmpty();
        }
        return false;
    }

    @Override // defpackage.dcfc, java.util.SortedSet
    public final /* bridge */ /* synthetic */ Object first() {
        throw new NoSuchElementException();
    }

    @Override // defpackage.dcaf
    public final dcaf<C> h(C c, boolean z) {
        return this;
    }

    @Override // defpackage.dcep, java.util.Collection, java.util.Set
    public final int hashCode() {
        return 0;
    }

    @Override // defpackage.dcaf
    public final dcaf<C> i(C c, boolean z, C c2, boolean z2) {
        return this;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return true;
    }

    @Override // defpackage.dcfc, defpackage.dcep, defpackage.dccr, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return dcgb.a;
    }

    @Override // defpackage.dcaf
    public final dcaf<C> j(C c, boolean z) {
        return this;
    }

    @Override // defpackage.dcaf
    public final dclz<C> k() {
        throw new NoSuchElementException();
    }

    @Override // defpackage.dcaf, defpackage.dcfc
    public final dcfc<C> l() {
        return dcfc.P(dcmw.a);
    }

    @Override // defpackage.dcfc, java.util.SortedSet
    public final /* bridge */ /* synthetic */ Object last() {
        throw new NoSuchElementException();
    }

    @Override // defpackage.dcaf, defpackage.dcfc
    public final /* bridge */ /* synthetic */ dcfc m(Object obj, boolean z) {
        Comparable comparable = (Comparable) obj;
        return this;
    }

    @Override // defpackage.dcaf, defpackage.dcfc
    public final /* bridge */ /* synthetic */ dcfc n(Object obj, boolean z, Object obj2, boolean z2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        return this;
    }

    @Override // defpackage.dcaf, defpackage.dcfc
    public final /* bridge */ /* synthetic */ dcfc o(Object obj, boolean z) {
        Comparable comparable = (Comparable) obj;
        return this;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 0;
    }

    @Override // defpackage.dcaf, java.util.AbstractCollection
    public final String toString() {
        return "[]";
    }

    @Override // defpackage.dcep, defpackage.dccr
    public final dcdc<C> v() {
        return dcdc.e();
    }

    @Override // defpackage.dcep
    public final boolean w() {
        return true;
    }

    @Override // defpackage.dcfc, defpackage.dcep, defpackage.dccr
    Object writeReplace() {
        return new dcav(this.a);
    }
}
