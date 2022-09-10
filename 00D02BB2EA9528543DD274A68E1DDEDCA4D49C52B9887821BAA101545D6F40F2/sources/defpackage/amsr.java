package defpackage;
/* compiled from: PG */
/* renamed from: amsr  reason: default package */
/* loaded from: classes2.dex */
public final class amsr {
    public static boolean a(amsy amsyVar) {
        amuq[] c;
        dzru dzruVar = new dzru();
        for (int i = 0; i < amsyVar.n(); i++) {
            amve m = amsyVar.m(i);
            dqvj c2 = dqvj.c(m.b().b);
            if (c2 == null) {
                c2 = dqvj.DRIVE;
            }
            if (c2 == dqvj.BIKESHARING) {
                dpan dpanVar = null;
                for (amtr amtrVar : m.b) {
                    for (amuq amuqVar : amtrVar.c()) {
                        if (c(amuqVar) && (dpanVar = amuqVar.i().f) == null) {
                            dpanVar = dpan.e;
                        }
                        if (d(amuqVar) && (dpanVar = amuqVar.j().b) == null) {
                            dpanVar = dpan.e;
                        }
                    }
                }
                if (dpanVar != null) {
                    dzruVar.add(dpanVar.b);
                }
            }
        }
        return dzruVar.f > 1;
    }

    public static amsq b(amve amveVar) {
        amuq[] c;
        dqvj c2 = dqvj.c(amveVar.b().b);
        if (c2 == null) {
            c2 = dqvj.DRIVE;
        }
        if (c2 == dqvj.BIKESHARING) {
            for (amtr amtrVar : amveVar.b) {
                for (amuq amuqVar : amtrVar.c()) {
                    if (!c(amuqVar)) {
                        if (d(amuqVar)) {
                            return amsq.DOCKED_BIKESHARING;
                        }
                    } else {
                        return amsq.DOCKLESS_BIKESHARING;
                    }
                }
            }
            return amsq.NONE;
        }
        return amsq.NONE;
    }

    public static boolean c(amuq amuqVar) {
        dowh i = amuqVar.i();
        int i2 = i.a;
        if ((i2 & 1) == 0 || (i2 & 2) == 0) {
            return false;
        }
        dott dottVar = i.c;
        if (dottVar == null) {
            dottVar = dott.h;
        }
        if (!f(dottVar) || (i.a & 8) == 0) {
            return false;
        }
        dpan dpanVar = i.f;
        if (dpanVar == null) {
            dpanVar = dpan.e;
        }
        return amuk.d(dpanVar);
    }

    public static boolean d(amuq amuqVar) {
        dowf j = amuqVar.j();
        if ((j.a & 1) != 0) {
            dpan dpanVar = j.b;
            if (dpanVar == null) {
                dpanVar = dpan.e;
            }
            if (!amuk.d(dpanVar)) {
                return false;
            }
            dowd dowdVar = j.c;
            if (dowdVar == null) {
                dowdVar = dowd.f;
            }
            if (!e(dowdVar)) {
                return false;
            }
            dowd dowdVar2 = j.e;
            if (dowdVar2 == null) {
                dowdVar2 = dowd.f;
            }
            return e(dowdVar2);
        }
        return false;
    }

    public static boolean e(dowd dowdVar) {
        int i = dowdVar.a;
        return ((i & 2) == 0 || (i & 8) == 0) ? false : true;
    }

    public static boolean f(dott dottVar) {
        int i = dottVar.a;
        return ((i & 4) == 0 || (i & 16) == 0) ? false : true;
    }
}
