package defpackage;
/* compiled from: PG */
/* renamed from: dncg  reason: default package */
/* loaded from: classes6.dex */
public final class dncg extends dsqw<dncg, dncd> implements dssk {
    public static final dncg b;
    private static volatile dssr<dncg> c;
    public dsrj<dncf> a = dssu.b;

    static {
        dncg dncgVar = new dncg();
        b = dncgVar;
        dsqw.cc(dncg.class, dncgVar);
    }

    private dncg() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", dncf.class});
            }
            if (i2 == 3) {
                return new dncg();
            }
            if (i2 == 4) {
                return new dncd();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dncg> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dncg.class) {
                    dssrVar = c;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        c = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
