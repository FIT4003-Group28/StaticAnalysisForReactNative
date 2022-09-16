package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: amrn  reason: default package */
/* loaded from: classes.dex */
public class amrn extends amrl implements List {
    final /* synthetic */ amro f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amrn(amro amroVar, Object obj, List list, amrl amrlVar) {
        super(amroVar, obj, list, amrlVar);
        this.f = amroVar;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        b();
        boolean isEmpty = this.b.isEmpty();
        d().add(i, obj);
        this.f.b++;
        if (isEmpty) {
            a();
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = d().addAll(i, collection);
        if (!addAll) {
            return addAll;
        }
        int size2 = this.b.size();
        this.f.b += size2 - size;
        if (size != 0) {
            return addAll;
        }
        a();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final List d() {
        return (List) this.b;
    }

    @Override // java.util.List
    public final Object get(int i) {
        b();
        return d().get(i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        b();
        return d().indexOf(obj);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        b();
        return d().lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        b();
        return new amrm(this);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        b();
        Object remove = d().remove(i);
        amro amroVar = this.f;
        amroVar.b--;
        c();
        return remove;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        b();
        return d().set(i, obj);
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        b();
        amro amroVar = this.f;
        Object obj = this.a;
        List subList = d().subList(i, i2);
        amrl amrlVar = this.c;
        if (amrlVar == null) {
            amrlVar = this;
        }
        return amroVar.j(obj, subList, amrlVar);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        b();
        return new amrm(this, i);
    }
}
