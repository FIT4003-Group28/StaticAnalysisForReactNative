package defpackage;

import java.util.Comparator;
import java.util.SortedSet;
/* compiled from: PG */
/* renamed from: dbyd  reason: default package */
/* loaded from: classes5.dex */
class dbyd extends dbxy implements SortedSet {
    final /* synthetic */ dbye g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dbyd(dbye dbyeVar, Object obj, SortedSet sortedSet, dbxy dbxyVar) {
        super(dbyeVar, obj, sortedSet, dbxyVar);
        this.g = dbyeVar;
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return e().comparator();
    }

    public SortedSet e() {
        return (SortedSet) this.b;
    }

    @Override // java.util.SortedSet
    public final Object first() {
        a();
        return e().first();
    }

    @Override // java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        a();
        dbye dbyeVar = this.g;
        Object obj2 = this.a;
        SortedSet headSet = e().headSet(obj);
        dbxy dbxyVar = this.c;
        if (dbxyVar == null) {
            dbxyVar = this;
        }
        return new dbyd(dbyeVar, obj2, headSet, dbxyVar);
    }

    @Override // java.util.SortedSet
    public final Object last() {
        a();
        return e().last();
    }

    @Override // java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        a();
        dbye dbyeVar = this.g;
        Object obj3 = this.a;
        SortedSet subSet = e().subSet(obj, obj2);
        dbxy dbxyVar = this.c;
        if (dbxyVar == null) {
            dbxyVar = this;
        }
        return new dbyd(dbyeVar, obj3, subSet, dbxyVar);
    }

    @Override // java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        a();
        dbye dbyeVar = this.g;
        Object obj2 = this.a;
        SortedSet tailSet = e().tailSet(obj);
        dbxy dbxyVar = this.c;
        if (dbxyVar == null) {
            dbxyVar = this;
        }
        return new dbyd(dbyeVar, obj2, tailSet, dbxyVar);
    }
}
