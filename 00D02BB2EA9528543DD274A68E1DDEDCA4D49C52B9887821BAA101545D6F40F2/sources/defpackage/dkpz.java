package defpackage;
/* compiled from: PG */
/* renamed from: dkpz  reason: default package */
/* loaded from: classes.dex */
public final class dkpz extends dsqw<dkpz, dkpw> implements dssk {
    public static final dkpz b;
    private static volatile dssr<dkpz> c;
    public dsrj<dkpy> a = dssu.b;

    static {
        dkpz dkpzVar = new dkpz();
        b = dkpzVar;
        dsqw.cc(dkpz.class, dkpzVar);
    }

    private dkpz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", dkpy.class});
            }
            if (i2 == 3) {
                return new dkpz();
            }
            if (i2 == 4) {
                return new dkpw();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkpz> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dkpz.class) {
                    dssrVar = c;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        c = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
