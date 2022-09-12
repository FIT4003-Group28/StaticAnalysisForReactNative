package defpackage;
/* compiled from: PG */
/* renamed from: dreg  reason: default package */
/* loaded from: classes6.dex */
public final class dreg extends dsqw<dreg, dref> implements dssk {
    public static final dreg c;
    private static volatile dssr<dreg> e;
    public String a = "";
    public String b = "";
    private int d;

    static {
        dreg dregVar = new dreg();
        c = dregVar;
        dsqw.cc(dreg.class, dregVar);
    }

    private dreg() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0003ဈ\u0002", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new dreg();
            }
            if (i2 == 4) {
                return new dref();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dreg> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dreg.class) {
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
