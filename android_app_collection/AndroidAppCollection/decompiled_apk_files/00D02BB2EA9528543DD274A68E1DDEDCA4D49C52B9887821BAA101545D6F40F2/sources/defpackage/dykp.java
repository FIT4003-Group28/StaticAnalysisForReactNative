package defpackage;

import java.io.InputStream;
/* compiled from: PG */
/* renamed from: dykp  reason: default package */
/* loaded from: classes6.dex */
public abstract class dykp implements dyvj {
    @Override // defpackage.dyvj
    public final void b(int i) {
        dyko u = u();
        dymg dymgVar = u.o;
        int i2 = dyzn.a;
        u.d(new dykn(u, i));
    }

    @Override // defpackage.dyvj
    public final void c(InputStream inputStream) {
        dbsk.t(inputStream, "message");
        try {
            if (!v().c()) {
                v().a(inputStream);
            }
        } finally {
            dyow.j(inputStream);
        }
    }

    @Override // defpackage.dyvj
    public final void g() {
        if (!v().c()) {
            v().b();
        }
    }

    @Override // defpackage.dyvj
    public final void h(dyfi dyfiVar) {
        v().f(dyfiVar);
    }

    @Override // defpackage.dyvj
    public final void n() {
        dyko u = u();
        dysq dysqVar = u.r;
        dysqVar.a = u;
        u.o = dysqVar;
    }

    protected abstract dyko u();

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract dyoo v();

    public final void x(int i) {
        dyko u = u();
        synchronized (u.p) {
            u.s += i;
        }
    }
}
