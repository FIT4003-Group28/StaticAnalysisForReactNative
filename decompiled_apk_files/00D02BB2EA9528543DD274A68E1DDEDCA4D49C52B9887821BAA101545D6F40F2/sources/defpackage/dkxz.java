package defpackage;
/* compiled from: PG */
/* renamed from: dkxz  reason: default package */
/* loaded from: classes.dex */
public final class dkxz extends dsqw<dkxz, dkxw> implements dssk {
    public static final dkxz c;
    private static volatile dssr<dkxz> e;
    public int a;
    public boolean b;
    private int d;

    static {
        dkxz dkxzVar = new dkxz();
        c = dkxzVar;
        dsqw.cc(dkxz.class, dkxzVar);
    }

    private dkxz() {
        dsqz dsqzVar = dsqz.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0003\u0004\u0002\u0000\u0000\u0000\u0003ဌ\u0003\u0004ဇ\u0004", new Object[]{"d", "a", dkxx.a, "b"});
            }
            if (i2 == 3) {
                return new dkxz();
            }
            if (i2 == 4) {
                return new dkxw();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkxz> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dkxz.class) {
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
