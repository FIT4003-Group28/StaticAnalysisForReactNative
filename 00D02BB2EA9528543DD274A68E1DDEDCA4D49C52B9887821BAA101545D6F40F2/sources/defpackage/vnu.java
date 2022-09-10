package defpackage;

import android.content.Context;
import android.content.res.Resources;
import java.io.Serializable;
/* compiled from: PG */
/* renamed from: vnu  reason: default package */
/* loaded from: classes7.dex */
public abstract class vnu implements Serializable {
    public static vnu g(dqvj dqvjVar, boolean z, String str, vwn vwnVar, @dzsi douj doujVar) {
        return new vls(dqvjVar, z, str, vwnVar, false, bvrt.a(doujVar));
    }

    public static vnu h(dqvj dqvjVar) {
        return n(dqvjVar, vwn.n);
    }

    @dzsi
    public static vnu k(dovh dovhVar, vwn vwnVar) {
        dove doveVar = dovhVar.b;
        if (doveVar == null) {
            doveVar = dove.c;
        }
        douj doujVar = null;
        if ((doveVar.a & 1) != 0) {
            dove doveVar2 = dovhVar.b;
            if (doveVar2 == null) {
                doveVar2 = dove.c;
            }
            dqvj c = dqvj.c(doveVar2.b);
            if (c == null) {
                c = dqvj.DRIVE;
            }
            boolean z = dovhVar.c;
            dgas dgasVar = dovhVar.d;
            if (dgasVar == null) {
                dgasVar = dgas.e;
            }
            String str = dgasVar.c;
            if ((dovhVar.a & 8) != 0 && (doujVar = dovhVar.f) == null) {
                doujVar = douj.h;
            }
            return g(c, z, str, vwnVar, doujVar);
        }
        return null;
    }

    public static vnu n(dqvj dqvjVar, vwn vwnVar) {
        return g(dqvjVar, false, "", vwnVar, null);
    }

    public abstract dqvj a();

    public abstract boolean b();

    public abstract String c();

    public abstract vwn d();

    public abstract boolean e();

    @dzsi
    public abstract bvrt<douj> f();

    public final vnu i(boolean z) {
        return e() == z ? this : new vls(a(), b(), c(), d(), z, f());
    }

    public final vnu j(Context context, vwn vwnVar) {
        String A;
        if (!vwnVar.equals(d())) {
            amub w = vwnVar.w(context);
            if (w == null) {
                A = null;
            } else {
                Resources resources = context.getResources();
                amve amveVar = w.d;
                dgar bZ = dgas.e.bZ();
                int E = w.E();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dgas dgasVar = (dgas) bZ.b;
                dgasVar.a |= 1;
                dgasVar.b = E;
                A = vyb.A(resources, amveVar, bZ.bK());
            }
            dqvj a = a();
            boolean b = b();
            if (A == null) {
                A = c();
            }
            return new vls(a, b, A, vwnVar, e(), f());
        }
        return this;
    }

    public final boolean l(vnu vnuVar) {
        return a() == vnuVar.a();
    }

    public final boolean m(dovh dovhVar) {
        dqvj a = a();
        dove doveVar = dovhVar.b;
        if (doveVar == null) {
            doveVar = dove.c;
        }
        dqvj c = dqvj.c(doveVar.b);
        if (c == null) {
            c = dqvj.DRIVE;
        }
        return a == c;
    }
}
