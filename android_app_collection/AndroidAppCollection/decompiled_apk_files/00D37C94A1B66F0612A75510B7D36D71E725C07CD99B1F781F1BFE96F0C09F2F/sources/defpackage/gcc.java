package defpackage;

import java.util.ArrayList;
import java.util.ListIterator;
/* compiled from: PG */
/* renamed from: gcc  reason: default package */
/* loaded from: classes3.dex */
public final class gcc {
    public final aizb a;
    public final ojy c;
    public final afy b = new afy();
    private final ArrayList d = new ArrayList();

    public gcc(ojy ojyVar, aizb aizbVar) {
        this.c = ojyVar;
        this.a = aizbVar;
    }

    private final int h(zbb zbbVar) {
        return (this.c.a || (zbbVar instanceof zbe)) ? 0 : 1;
    }

    private final void i() {
        int i = 0;
        while (true) {
            afy afyVar = this.b;
            if (i < afyVar.b) {
                ((gcd) afyVar.b(i)).e();
                i++;
            } else {
                return;
            }
        }
    }

    final int a() {
        if (this.d.isEmpty()) {
            return 0;
        }
        ArrayList arrayList = this.d;
        int i = ((agti) arrayList.get(arrayList.size() - 1)).b;
        if (i == 1) {
            return 1;
        }
        return i == 2 ? 2 : 0;
    }

    public final int b(ezx ezxVar, int i, zbb zbbVar) {
        aqxo.p(elk.l(ezxVar));
        if (ezxVar.g()) {
            return 5;
        }
        int i2 = 1;
        if (ezxVar.b()) {
            if (this.c.a || this.a.b) {
                i2 = 0;
            } else if (!elk.k(i) || !this.a.d()) {
                i2 = 2;
            }
            return elk.m(i2, g(i2, zbbVar));
        } else if (ezxVar.i()) {
            return elk.m(h(zbbVar), false);
        } else {
            return elk.m(a(), true);
        }
    }

    public final Object c(int i) {
        int a = a();
        agti agtiVar = new agti(i);
        this.d.add(agtiVar);
        if (a != i) {
            i();
        }
        return agtiVar.a;
    }

    public final void d(Object obj) {
        if (this.d.isEmpty()) {
            return;
        }
        int a = a();
        ArrayList arrayList = this.d;
        ListIterator listIterator = arrayList.listIterator(arrayList.size());
        while (true) {
            if (listIterator.hasPrevious()) {
                if (((agti) listIterator.previous()).a.equals(obj)) {
                    listIterator.remove();
                    break;
                }
            } else {
                break;
            }
        }
        if (a() == a) {
            return;
        }
        i();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean e(int i, zbb zbbVar) {
        int h = h(zbbVar);
        return h == i || h == 0 || i == 0;
    }

    public final boolean f(int i) {
        boolean k = elk.k(i);
        return (k || elk.j(i)) && k == this.a.d();
    }

    public final boolean g(int i, zbb zbbVar) {
        return !this.c.a && !this.a.b && i == h(zbbVar) && f(i);
    }
}
