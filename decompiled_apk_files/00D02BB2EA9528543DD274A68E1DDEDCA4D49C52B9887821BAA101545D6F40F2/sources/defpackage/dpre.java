package defpackage;
/* compiled from: PG */
/* renamed from: dpre  reason: default package */
/* loaded from: classes6.dex */
public final class dpre extends dsqw<dpre, dprd> implements dssk {
    public static final dpre e;
    private static volatile dssr<dpre> f;
    public int a;
    public String b = "";
    public String c = "";
    public String d = "";

    static {
        dpre dpreVar = new dpre();
        e = dpreVar;
        dsqw.cc(dpre.class, dpreVar);
    }

    private dpre() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new dpre();
            }
            if (i2 == 4) {
                return new dprd();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dpre> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dpre.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
