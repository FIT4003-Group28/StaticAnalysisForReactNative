package defpackage;
/* compiled from: PG */
/* renamed from: dpsz  reason: default package */
/* loaded from: classes6.dex */
public final class dpsz extends dsqw<dpsz, dpsy> implements dssk {
    public static final dpsz c;
    private static volatile dssr<dpsz> d;
    public int a;
    public String b = "";

    static {
        dpsz dpszVar = new dpsz();
        c = dpszVar;
        dsqw.cc(dpsz.class, dpszVar);
    }

    private dpsz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dpsz();
            }
            if (i2 == 4) {
                return new dpsy();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dpsz> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dpsz.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
