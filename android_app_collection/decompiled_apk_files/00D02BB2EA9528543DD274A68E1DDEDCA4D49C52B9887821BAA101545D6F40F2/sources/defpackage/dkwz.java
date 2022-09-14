package defpackage;
/* compiled from: PG */
/* renamed from: dkwz  reason: default package */
/* loaded from: classes.dex */
public final class dkwz extends dsqw<dkwz, dkww> implements dssk {
    public static final dkwz d;
    private static volatile dssr<dkwz> f;
    public int a = 1;
    public int b = 3;
    public dsrj<dkwy> c = dssu.b;
    private int e;

    static {
        dkwz dkwzVar = new dkwz();
        d = dkwzVar;
        dsqw.cc(dkwz.class, dkwzVar);
    }

    private dkwz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001င\u0000\u0002င\u0001\u0003\u001b", new Object[]{"e", "a", "b", "c", dkwy.class});
            }
            if (i2 == 3) {
                return new dkwz();
            }
            if (i2 == 4) {
                return new dkww();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkwz> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dkwz.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
