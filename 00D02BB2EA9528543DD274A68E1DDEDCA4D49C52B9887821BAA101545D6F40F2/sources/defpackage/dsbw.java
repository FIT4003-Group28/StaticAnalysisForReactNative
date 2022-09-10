package defpackage;
/* compiled from: PG */
/* renamed from: dsbw  reason: default package */
/* loaded from: classes6.dex */
public final class dsbw extends dsqw<dsbw, dsbv> implements dssk {
    public static final dsbw b;
    private static volatile dssr<dsbw> d;
    public String a = "";
    private int c;

    static {
        dsbw dsbwVar = new dsbw();
        b = dsbwVar;
        dsqw.cc(dsbw.class, dsbwVar);
    }

    private dsbw() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dsbw();
            }
            if (i2 == 4) {
                return new dsbv();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dsbw> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dsbw.class) {
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
