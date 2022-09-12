package defpackage;

import java.lang.Enum;
import java.util.Collection;
import java.util.EnumSet;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dccw  reason: default package */
/* loaded from: classes.dex */
public final class dccw<E extends Enum<E>> extends dcep<E> {
    private final transient EnumSet<E> a;
    private transient int b;

    public dccw(EnumSet<E> enumSet) {
        this.a = enumSet;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static dcep b(EnumSet enumSet) {
        int size = enumSet.size();
        if (size != 0) {
            if (size == 1) {
                return dcep.B(dcft.c(enumSet));
            }
            return new dccw(enumSet);
        }
        return dcmr.a;
    }

    @Override // defpackage.dcep, defpackage.dccr, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    /* renamed from: SE */
    public final dcpd<E> iterator() {
        return dcgh.a(this.a.iterator());
    }

    @Override // defpackage.dccr
    public final boolean SI() {
        return false;
    }

    @Override // defpackage.dccr, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.a.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection<?> collection) {
        if (collection instanceof dccw) {
            collection = ((dccw) collection).a;
        }
        return this.a.containsAll(collection);
    }

    @Override // defpackage.dcep, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dccw) {
            obj = ((dccw) obj).a;
        }
        return this.a.equals(obj);
    }

    @Override // defpackage.dcep, java.util.Collection, java.util.Set
    public final int hashCode() {
        int i = this.b;
        if (i == 0) {
            int hashCode = this.a.hashCode();
            this.b = hashCode;
            return hashCode;
        }
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.size();
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return this.a.toString();
    }

    @Override // defpackage.dcep
    public final boolean w() {
        return true;
    }

    @Override // defpackage.dcep, defpackage.dccr
    Object writeReplace() {
        return new dccv(this.a);
    }
}
