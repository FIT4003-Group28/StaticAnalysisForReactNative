package defpackage;
/* compiled from: PG */
/* renamed from: driz  reason: default package */
/* loaded from: classes6.dex */
public final class driz extends dsqw<driz, driy> implements dssk {
    public static final driz b;
    private static volatile dssr<driz> d;
    public String a = "";
    private int c;

    static {
        driz drizVar = new driz();
        b = drizVar;
        dsqw.cc(driz.class, drizVar);
    }

    private driz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new driz();
            }
            if (i2 == 4) {
                return new driy();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<driz> dssrVar = d;
            if (dssrVar == null) {
                synchronized (driz.class) {
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
