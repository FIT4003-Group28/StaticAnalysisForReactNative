package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: aoqg  reason: default package */
/* loaded from: classes.dex */
final class aoqg extends aoqi {
    private static final Class c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    static List a(Object obj, long j) {
        return (List) aosg.i(obj, j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static List e(Object obj, long j, int i) {
        aoqe aoqeVar;
        List arrayList;
        List a = a(obj, j);
        if (a.isEmpty()) {
            if (a instanceof aoqf) {
                arrayList = new aoqe(i);
            } else if (!(a instanceof aorc) || !(a instanceof aopu)) {
                arrayList = new ArrayList(i);
            } else {
                arrayList = ((aopu) a).e(i);
            }
            aosg.v(obj, j, arrayList);
            return arrayList;
        }
        if (c.isAssignableFrom(a.getClass())) {
            ArrayList arrayList2 = new ArrayList(a.size() + i);
            arrayList2.addAll(a);
            aosg.v(obj, j, arrayList2);
            aoqeVar = arrayList2;
        } else if (a instanceof aosb) {
            aoqe aoqeVar2 = new aoqe(a.size() + i);
            aoqeVar2.addAll((aosb) a);
            aosg.v(obj, j, aoqeVar2);
            aoqeVar = aoqeVar2;
        } else if (!(a instanceof aorc) || !(a instanceof aopu)) {
            return a;
        } else {
            aopu aopuVar = (aopu) a;
            if (aopuVar.c()) {
                return a;
            }
            aopu e = aopuVar.e(a.size() + i);
            aosg.v(obj, j, e);
            return e;
        }
        return aoqeVar;
    }

    @Override // defpackage.aoqi
    public final List b(Object obj, long j) {
        return e(obj, j, 10);
    }

    @Override // defpackage.aoqi
    public final void c(Object obj, long j) {
        Object unmodifiableList;
        List list = (List) aosg.i(obj, j);
        if (list instanceof aoqf) {
            unmodifiableList = ((aoqf) list).d();
        } else if (c.isAssignableFrom(list.getClass())) {
            return;
        } else {
            if (!(list instanceof aorc) || !(list instanceof aopu)) {
                unmodifiableList = Collections.unmodifiableList(list);
            } else {
                aopu aopuVar = (aopu) list;
                if (!aopuVar.c()) {
                    return;
                }
                aopuVar.b();
                return;
            }
        }
        aosg.v(obj, j, unmodifiableList);
    }

    @Override // defpackage.aoqi
    public final void d(Object obj, Object obj2, long j) {
        List a = a(obj2, j);
        List e = e(obj, j, a.size());
        int size = e.size();
        int size2 = a.size();
        if (size > 0 && size2 > 0) {
            e.addAll(a);
        }
        if (size > 0) {
            a = e;
        }
        aosg.v(obj, j, a);
    }
}
