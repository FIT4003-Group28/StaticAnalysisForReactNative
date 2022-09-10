package defpackage;
/* compiled from: PG */
/* renamed from: bzhu  reason: default package */
/* loaded from: classes4.dex */
public final class bzhu extends dsqw<bzhu, bzht> implements dssk {
    public static final bzhu d;
    private static volatile dssr<bzhu> e;
    public int a;
    public String b = "";
    public dpum c;

    static {
        bzhu bzhuVar = new bzhu();
        d = bzhuVar;
        dsqw.cc(bzhu.class, bzhuVar);
    }

    private bzhu() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new bzhu();
            }
            if (i2 == 4) {
                return new bzht();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<bzhu> dssrVar = e;
            if (dssrVar == null) {
                synchronized (bzhu.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
