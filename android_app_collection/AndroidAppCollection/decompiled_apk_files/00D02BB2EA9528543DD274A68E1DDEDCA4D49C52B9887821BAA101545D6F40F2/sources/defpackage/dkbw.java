package defpackage;
/* compiled from: PG */
/* renamed from: dkbw  reason: default package */
/* loaded from: classes6.dex */
public final class dkbw extends dsqw<dkbw, dkbv> implements dssk {
    public static final dkbw c;
    private static volatile dssr<dkbw> d;
    public int a;
    public String b = "";

    static {
        dkbw dkbwVar = new dkbw();
        c = dkbwVar;
        dsqw.cc(dkbw.class, dkbwVar);
    }

    private dkbw() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dkbw();
            }
            if (i2 == 4) {
                return new dkbv();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkbw> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dkbw.class) {
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
