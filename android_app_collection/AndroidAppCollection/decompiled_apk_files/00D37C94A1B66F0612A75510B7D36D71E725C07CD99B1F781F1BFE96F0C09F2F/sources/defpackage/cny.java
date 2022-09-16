package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
/* compiled from: PG */
/* renamed from: cny  reason: default package */
/* loaded from: classes2.dex */
public final class cny {
    private static final cnq a = new cnw();
    private final List b = new ArrayList();
    private final Set c = new HashSet();
    private final jk d;

    public cny(jk jkVar) {
        this.d = jkVar;
    }

    private final cnq h(cnx cnxVar) {
        cnq c = cnxVar.b.c(this);
        hy.N(c);
        return c;
    }

    private final void i(Class cls, Class cls2, cnr cnrVar, boolean z) {
        cnx cnxVar = new cnx(cls, cls2, cnrVar);
        List list = this.b;
        list.add(z ? list.size() : 0, cnxVar);
    }

    public final synchronized cnq a(Class cls, Class cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            boolean z = false;
            for (cnx cnxVar : this.b) {
                if (this.c.contains(cnxVar)) {
                    z = true;
                } else if (cnxVar.b(cls, cls2)) {
                    this.c.add(cnxVar);
                    arrayList.add(h(cnxVar));
                    this.c.remove(cnxVar);
                }
            }
            if (arrayList.size() > 1) {
                return new cnv(arrayList, this.d);
            } else if (arrayList.size() == 1) {
                return (cnq) arrayList.get(0);
            } else if (!z) {
                throw new cfy(cls, cls2);
            } else {
                return a;
            }
        } catch (Throwable th) {
            this.c.clear();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized List b(Class cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (cnx cnxVar : this.b) {
                if (!this.c.contains(cnxVar) && cnxVar.a(cls)) {
                    this.c.add(cnxVar);
                    arrayList.add(h(cnxVar));
                    this.c.remove(cnxVar);
                }
            }
        } catch (Throwable th) {
            this.c.clear();
            throw th;
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized List c(Class cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (cnx cnxVar : this.b) {
            if (!arrayList.contains(cnxVar.a) && cnxVar.a(cls)) {
                arrayList.add(cnxVar.a);
            }
        }
        return arrayList;
    }

    final synchronized List d(Class cls, Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            cnx cnxVar = (cnx) it.next();
            if (cnxVar.b(cls, cls2)) {
                it.remove();
                arrayList.add(cnxVar.b);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized List e(Class cls, Class cls2, cnr cnrVar) {
        List d;
        d = d(cls, cls2);
        f(cls, cls2, cnrVar);
        return d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void f(Class cls, Class cls2, cnr cnrVar) {
        i(cls, cls2, cnrVar, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void g(Class cls, Class cls2, cnr cnrVar) {
        i(cls, cls2, cnrVar, false);
    }
}
