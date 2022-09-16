package defpackage;
/* compiled from: PG */
/* renamed from: dqbt  reason: default package */
/* loaded from: classes6.dex */
public final class dqbt extends dsqw<dqbt, dqbs> implements dssk {
    public static final dqbt c;
    private static volatile dssr<dqbt> e;
    public String a = "";
    public String b = "";
    private int d;

    static {
        dqbt dqbtVar = new dqbt();
        c = dqbtVar;
        dsqw.cc(dqbt.class, dqbtVar);
    }

    private dqbt() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new dqbt();
            }
            if (i2 == 4) {
                return new dqbs();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqbt> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dqbt.class) {
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
