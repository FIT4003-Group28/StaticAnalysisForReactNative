package defpackage;
/* compiled from: PG */
/* renamed from: dhnr  reason: default package */
/* loaded from: classes6.dex */
public final class dhnr extends dsqw<dhnr, dhnq> implements dssk {
    public static final dhnr c;
    private static volatile dssr<dhnr> d;
    public int a;
    public String b = "";

    static {
        dhnr dhnrVar = new dhnr();
        c = dhnrVar;
        dsqw.cc(dhnr.class, dhnrVar);
    }

    private dhnr() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dhnr();
            }
            if (i2 == 4) {
                return new dhnq();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dhnr> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dhnr.class) {
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
