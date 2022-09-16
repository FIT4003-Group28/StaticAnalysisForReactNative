package defpackage;
/* compiled from: PG */
/* renamed from: dkqt  reason: default package */
/* loaded from: classes.dex */
public final class dkqt extends dsqw<dkqt, dkqs> implements dssk {
    public static final dkqt b;
    private static volatile dssr<dkqt> d;
    public int a = 1;
    private int c;

    static {
        dkqt dkqtVar = new dkqt();
        b = dkqtVar;
        dsqw.cc(dkqt.class, dkqtVar);
    }

    private dkqt() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002င\u0001", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dkqt();
            }
            if (i2 == 4) {
                return new dkqs();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkqt> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dkqt.class) {
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
