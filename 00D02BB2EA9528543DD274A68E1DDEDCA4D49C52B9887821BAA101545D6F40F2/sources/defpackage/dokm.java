package defpackage;
/* compiled from: PG */
/* renamed from: dokm  reason: default package */
/* loaded from: classes6.dex */
public final class dokm extends dsqw<dokm, dokl> implements dssk {
    public static final dokm c;
    private static volatile dssr<dokm> e;
    public int a;
    public dokh b;
    private int d;

    static {
        dokm dokmVar = new dokm();
        c = dokmVar;
        dsqw.cc(dokm.class, dokmVar);
    }

    private dokm() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001", new Object[]{"d", "a", dokj.a, "b"});
            }
            if (i2 == 3) {
                return new dokm();
            }
            if (i2 == 4) {
                return new dokl();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dokm> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dokm.class) {
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
