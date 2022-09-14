package defpackage;
/* compiled from: PG */
/* renamed from: dpda  reason: default package */
/* loaded from: classes6.dex */
public final class dpda extends dsqw<dpda, dpcz> implements dssk {
    public static final dpda c;
    private static volatile dssr<dpda> d;
    public int a;
    public String b = "";

    static {
        dpda dpdaVar = new dpda();
        c = dpdaVar;
        dsqw.cc(dpda.class, dpdaVar);
    }

    private dpda() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dpda();
            }
            if (i2 == 4) {
                return new dpcz();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dpda> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dpda.class) {
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
