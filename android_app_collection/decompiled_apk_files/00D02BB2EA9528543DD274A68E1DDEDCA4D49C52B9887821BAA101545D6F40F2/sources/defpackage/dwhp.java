package defpackage;
/* compiled from: PG */
/* renamed from: dwhp  reason: default package */
/* loaded from: classes6.dex */
public final class dwhp extends dsqw<dwhp, dwho> implements dssk {
    public static final dwhp c;
    private static volatile dssr<dwhp> e;
    public String a = "";
    public dsrj<dqfj> b = dssu.b;
    private int d;

    static {
        dwhp dwhpVar = new dwhp();
        c = dwhpVar;
        dsqw.cc(dwhp.class, dwhpVar);
    }

    private dwhp() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000", new Object[]{"d", "b", dqfj.class, "a"});
            }
            if (i2 == 3) {
                return new dwhp();
            }
            if (i2 == 4) {
                return new dwho();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwhp> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dwhp.class) {
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
