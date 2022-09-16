package defpackage;
/* compiled from: PG */
/* renamed from: doqp  reason: default package */
/* loaded from: classes6.dex */
public final class doqp extends dsqw<doqp, doqi> implements dssk {
    public static final doqp i;
    private static volatile dssr<doqp> j;
    public int a;
    public doqk b;
    public doqk c;
    public int d;
    public int e;
    public String f = "";
    public dnpq g;
    public dnwd h;

    static {
        doqp doqpVar = new doqp();
        i = doqpVar;
        dsqw.cc(doqp.class, doqpVar);
    }

    private doqp() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(i, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဌ\u0002\u0004ဌ\u0003\u0005ဈ\u0004\u0007ဉ\u0007\bဉ\b", new Object[]{"a", "b", "c", "d", doql.a, "e", doqn.a, "f", "g", "h"});
            }
            if (i3 == 3) {
                return new doqp();
            }
            if (i3 == 4) {
                return new doqi();
            }
            if (i3 == 5) {
                return i;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<doqp> dssrVar = j;
            if (dssrVar == null) {
                synchronized (doqp.class) {
                    dssrVar = j;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(i);
                        j = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
