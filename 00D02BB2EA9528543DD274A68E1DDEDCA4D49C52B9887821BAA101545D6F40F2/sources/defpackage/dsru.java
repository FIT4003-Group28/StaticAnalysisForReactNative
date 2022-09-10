package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: dsru  reason: default package */
/* loaded from: classes.dex */
final class dsru extends dsrw {
    private static final Class<?> c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    static <E> List<E> d(Object obj, long j) {
        return (List) dsui.l(obj, j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <L> List<L> e(Object obj, long j, int i) {
        dsrs dsrsVar;
        List<L> arrayList;
        List<L> d = d(obj, j);
        if (d.isEmpty()) {
            if (d instanceof dsrt) {
                arrayList = new dsrs(i);
            } else if (!(d instanceof dsss) || !(d instanceof dsrj)) {
                arrayList = new ArrayList<>(i);
            } else {
                arrayList = ((dsrj) d).e(i);
            }
            dsui.m(obj, j, arrayList);
            return arrayList;
        }
        if (c.isAssignableFrom(d.getClass())) {
            ArrayList arrayList2 = new ArrayList(d.size() + i);
            arrayList2.addAll(d);
            dsui.m(obj, j, arrayList2);
            dsrsVar = arrayList2;
        } else if (d instanceof dsuc) {
            dsrs dsrsVar2 = new dsrs(d.size() + i);
            dsrsVar2.addAll((dsuc) d);
            dsui.m(obj, j, dsrsVar2);
            dsrsVar = dsrsVar2;
        } else if (!(d instanceof dsss) || !(d instanceof dsrj)) {
            return d;
        } else {
            dsrj dsrjVar = (dsrj) d;
            if (dsrjVar.a()) {
                return d;
            }
            dsrj e = dsrjVar.e(d.size() + i);
            dsui.m(obj, j, e);
            return e;
        }
        return dsrsVar;
    }

    @Override // defpackage.dsrw
    public final <L> List<L> a(Object obj, long j) {
        return e(obj, j, 10);
    }

    @Override // defpackage.dsrw
    public final void b(Object obj, long j) {
        Object unmodifiableList;
        List list = (List) dsui.l(obj, j);
        if (list instanceof dsrt) {
            unmodifiableList = ((dsrt) list).i();
        } else if (c.isAssignableFrom(list.getClass())) {
            return;
        } else {
            if (!(list instanceof dsss) || !(list instanceof dsrj)) {
                unmodifiableList = Collections.unmodifiableList(list);
            } else {
                dsrj dsrjVar = (dsrj) list;
                if (!dsrjVar.a()) {
                    return;
                }
                dsrjVar.b();
                return;
            }
        }
        dsui.m(obj, j, unmodifiableList);
    }

    @Override // defpackage.dsrw
    public final <E> void c(Object obj, Object obj2, long j) {
        List d = d(obj2, j);
        List e = e(obj, j, d.size());
        int size = e.size();
        int size2 = d.size();
        if (size > 0 && size2 > 0) {
            e.addAll(d);
        }
        if (size > 0) {
            d = e;
        }
        dsui.m(obj, j, d);
    }
}
