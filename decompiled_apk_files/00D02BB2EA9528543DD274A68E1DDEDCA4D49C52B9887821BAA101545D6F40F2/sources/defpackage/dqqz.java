package defpackage;
/* compiled from: PG */
/* renamed from: dqqz  reason: default package */
/* loaded from: classes6.dex */
public final class dqqz extends dsqw<dqqz, dqqy> implements dssk {
    public static final dqqz b;
    private static volatile dssr<dqqz> c;
    public dsrj<drnp> a = dssu.b;

    static {
        dqqz dqqzVar = new dqqz();
        b = dqqzVar;
        dsqw.cc(dqqz.class, dqqzVar);
    }

    private dqqz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", drnp.class});
            }
            if (i2 == 3) {
                return new dqqz();
            }
            if (i2 == 4) {
                return new dqqy();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqqz> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dqqz.class) {
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
