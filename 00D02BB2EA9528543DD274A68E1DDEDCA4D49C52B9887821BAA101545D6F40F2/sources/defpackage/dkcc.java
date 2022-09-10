package defpackage;
/* compiled from: PG */
/* renamed from: dkcc  reason: default package */
/* loaded from: classes6.dex */
public final class dkcc extends dsqw<dkcc, dkcb> implements dssk {
    public static final dkcc c;
    private static volatile dssr<dkcc> d;
    public int a;
    public String b = "";

    static {
        dkcc dkccVar = new dkcc();
        c = dkccVar;
        dsqw.cc(dkcc.class, dkccVar);
    }

    private dkcc() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dkcc();
            }
            if (i2 == 4) {
                return new dkcb();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkcc> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dkcc.class) {
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
