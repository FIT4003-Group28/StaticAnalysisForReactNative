package defpackage;

import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: PG */
/* renamed from: dyvi  reason: default package */
/* loaded from: classes6.dex */
public final class dyvi {
    public static final dyvi a = new dyvi(new dyje[0]);
    private final dyje[] b;
    private final AtomicBoolean c = new AtomicBoolean(false);

    public dyvi(dyje[] dyjeVarArr) {
        this.b = dyjeVarArr;
    }

    public static dyvi a(dyet dyetVar, dyel dyelVar, dyhw dyhwVar) {
        List<dyfb> list = dyetVar.e;
        if (!list.isEmpty()) {
            dyfc dyfcVar = new dyfc();
            dbsk.t(dyelVar, "transportAttrs cannot be null");
            dyfcVar.a = dyelVar;
            dbsk.t(dyetVar, "callOptions cannot be null");
            dyfcVar.b = dyetVar;
            new dyfd(dyfcVar.a, dyfcVar.b);
            int size = list.size();
            dyje[] dyjeVarArr = new dyje[size];
            for (int i = 0; i < size; i++) {
                dyjeVarArr[i] = list.get(i).b();
            }
            return new dyvi(dyjeVarArr);
        }
        return a;
    }

    public final void b() {
        for (dyje dyjeVar : this.b) {
            dyfe dyfeVar = (dyfe) dyjeVar;
        }
    }

    public final void c() {
        for (dyje dyjeVar : this.b) {
            ((dyfe) dyjeVar).a();
        }
    }

    public final void d(long j) {
        for (dyje dyjeVar : this.b) {
            dyjeVar.b(j);
        }
    }

    public final void e(long j) {
        for (dyje dyjeVar : this.b) {
            dyjeVar.c(j);
        }
    }

    public final void f() {
        for (dyje dyjeVar : this.b) {
            dyfe dyfeVar = (dyfe) dyjeVar;
        }
    }

    public final void g() {
        dyje[] dyjeVarArr;
        for (dyje dyjeVar : this.b) {
        }
    }

    public final void h() {
        dyje[] dyjeVarArr;
        for (dyje dyjeVar : this.b) {
        }
    }

    public final void i() {
        dyje[] dyjeVarArr;
        for (dyje dyjeVar : this.b) {
        }
    }

    public final void j() {
        dyje[] dyjeVarArr;
        for (dyje dyjeVar : this.b) {
        }
    }

    public final void k() {
        dyje[] dyjeVarArr;
        for (dyje dyjeVar : this.b) {
        }
    }

    public final void l() {
        dyje[] dyjeVarArr;
        for (dyje dyjeVar : this.b) {
        }
    }

    public final void m() {
        if (this.c.compareAndSet(false, true)) {
            for (dyje dyjeVar : this.b) {
                dyjeVar.d();
            }
        }
    }
}
