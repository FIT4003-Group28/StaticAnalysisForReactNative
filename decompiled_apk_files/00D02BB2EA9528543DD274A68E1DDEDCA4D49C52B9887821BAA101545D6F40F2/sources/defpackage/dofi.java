package defpackage;
/* compiled from: PG */
/* renamed from: dofi  reason: default package */
/* loaded from: classes6.dex */
public final class dofi extends dsqw<dofi, doff> implements dssk {
    public static final dofi c;
    private static volatile dssr<dofi> e;
    public String a = "";
    public dofh b;
    private int d;

    static {
        dofi dofiVar = new dofi();
        c = dofiVar;
        dsqw.cc(dofi.class, dofiVar);
    }

    private dofi() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new dofi();
            }
            if (i2 == 4) {
                return new doff();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dofi> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dofi.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
