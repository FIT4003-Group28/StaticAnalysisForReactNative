package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dbya  reason: default package */
/* loaded from: classes.dex */
public class dbya extends dbxy implements List {
    final /* synthetic */ dbye f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dbya(dbye dbyeVar, Object obj, List list, dbxy dbxyVar) {
        super(dbyeVar, obj, list, dbxyVar);
        this.f = dbyeVar;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        a();
        boolean isEmpty = this.b.isEmpty();
        d().add(i, obj);
        dbye.z(this.f);
        if (isEmpty) {
            c();
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
        dbye.B(this.f, this.b.size() - size);
        if (size != 0) {
            return addAll;
        }
        c();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final List d() {
        return (List) this.b;
    }

    @Override // java.util.List
    public final Object get(int i) {
        a();
        return d().get(i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        a();
        return d().indexOf(obj);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        a();
        return d().lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        a();
        return new dbxz(this);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        a();
        Object remove = d().remove(i);
        dbye.A(this.f);
        b();
        return remove;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        a();
        return d().set(i, obj);
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        a();
        dbye dbyeVar = this.f;
        Object obj = this.a;
        List subList = d().subList(i, i2);
        dbxy dbxyVar = this.c;
        if (dbxyVar == null) {
            dbxyVar = this;
        }
        return dbyeVar.q(obj, subList, dbxyVar);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        a();
        return new dbxz(this, i);
    }
}
