package defpackage;
/* compiled from: PG */
/* renamed from: zmz  reason: default package */
/* loaded from: classes7.dex */
public final class zmz {
    private final vwv a;

    public zmz(vwv vwvVar) {
        this.a = vwvVar;
    }

    public static boolean c(amve amveVar, @dzsi dwao dwaoVar) {
        dqvj c = dqvj.c(amveVar.b().b);
        if (c == null) {
            c = dqvj.DRIVE;
        }
        if (!c.equals(dqvj.TAXI) || dwaoVar == null || !wuw.b(amveVar)) {
            return false;
        }
        dpeg dpegVar = dwaoVar.k;
        if (dpegVar == null) {
            dpegVar = dpeg.f;
        }
        dpef dpefVar = dpegVar.b;
        if (dpefVar == null) {
            dpefVar = dpef.e;
        }
        int i = dpefVar.a;
        if ((i & 2) != 0 && dpefVar.c) {
            return false;
        }
        return (i & 1) == 0 || !dpefVar.b;
    }

    public static boolean d(amve amveVar, @dzsi dwao dwaoVar) {
        dqvj c = dqvj.c(amveVar.b().b);
        if (c == null) {
            c = dqvj.DRIVE;
        }
        if (!c.equals(dqvj.TAXI) || dwaoVar == null || !wuw.c(amveVar)) {
            return false;
        }
        dpeg dpegVar = dwaoVar.k;
        if (dpegVar == null) {
            dpegVar = dpeg.f;
        }
        dpef dpefVar = dpegVar.b;
        if (dpefVar == null) {
            dpefVar = dpef.e;
        }
        return (dpefVar.a & 4) == 0 || !dpefVar.d;
    }

    public final boolean a(amve amveVar, @dzsi dwao dwaoVar) {
        return b(amveVar) || c(amveVar, dwaoVar) || d(amveVar, dwaoVar);
    }

    public final boolean b(amve amveVar) {
        dqvj c = dqvj.c(amveVar.b().b);
        if (c == null) {
            c = dqvj.DRIVE;
        }
        return c == dqvj.BIKESHARING && this.a.k;
    }
}
