package defpackage;
/* compiled from: PG */
/* renamed from: ycz  reason: default package */
/* loaded from: classes7.dex */
public final class ycz {
    public static final /* synthetic */ int a = 0;

    static {
        cqta.f();
    }

    public static cqss a(dpbp dpbpVar, int i, int i2) {
        int a2;
        dotv dotvVar = null;
        if (i2 == 0) {
            int i3 = i - 1;
            if (i3 >= 0 && i3 < dpbpVar.c.size()) {
                dphe dpheVar = dpbpVar.c.get(i3).e;
                if (dpheVar == null) {
                    dpheVar = dphe.x;
                }
                dotvVar = c(dpbpVar, i3, dpheVar.l.size() - 1);
            }
        } else {
            dotvVar = c(dpbpVar, i, i2 - 1);
        }
        if (dotvVar == null) {
            a2 = 0;
        } else {
            dpgl dpglVar = dotvVar.b;
            if (dpglVar == null) {
                dpglVar = dpgl.g;
            }
            a2 = bzlw.a(dpglVar.d);
        }
        return cqta.d(a2);
    }

    public static cqss b(dotv dotvVar) {
        dpgl dpglVar = dotvVar.b;
        if (dpglVar == null) {
            dpglVar = dpgl.g;
        }
        return cqta.d(bzlw.a(dpglVar.d));
    }

    @dzsi
    private static dotv c(dpbp dpbpVar, int i, int i2) {
        if (i >= 0 && i2 >= 0 && i < dpbpVar.c.size()) {
            dpdy dpdyVar = dpbpVar.c.get(i);
            dpec dpecVar = dpdyVar.c;
            if (dpecVar == null) {
                dpecVar = dpec.o;
            }
            dqvj c = dqvj.c(dpecVar.b);
            if (c == null) {
                c = dqvj.DRIVE;
            }
            if (c == dqvj.TRANSIT) {
                dphe dpheVar = dpdyVar.e;
                if (dpheVar == null) {
                    dpheVar = dphe.x;
                }
                if (i2 < dpheVar.l.size()) {
                    return dpheVar.l.get(i2);
                }
            }
        }
        return null;
    }
}
