package defpackage;
/* compiled from: PG */
/* renamed from: dqdt  reason: default package */
/* loaded from: classes6.dex */
public final class dqdt extends dsqw<dqdt, dqds> implements dssk {
    public static final dqdt b;
    private static volatile dssr<dqdt> d;
    public String a = "";
    private int c;

    static {
        dqdt dqdtVar = new dqdt();
        b = dqdtVar;
        dsqw.cc(dqdt.class, dqdtVar);
    }

    private dqdt() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dqdt();
            }
            if (i2 == 4) {
                return new dqds();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqdt> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dqdt.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
