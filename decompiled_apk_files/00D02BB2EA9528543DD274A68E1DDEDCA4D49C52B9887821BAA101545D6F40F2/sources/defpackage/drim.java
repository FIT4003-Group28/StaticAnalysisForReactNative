package defpackage;
/* compiled from: PG */
/* renamed from: drim  reason: default package */
/* loaded from: classes6.dex */
public final class drim extends dsqw<drim, dril> implements dssk {
    public static final drim c;
    private static volatile dssr<drim> d;
    public int a;
    public String b = "";

    static {
        drim drimVar = new drim();
        c = drimVar;
        dsqw.cc(drim.class, drimVar);
    }

    private drim() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new drim();
            }
            if (i2 == 4) {
                return new dril();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drim> dssrVar = d;
            if (dssrVar == null) {
                synchronized (drim.class) {
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
