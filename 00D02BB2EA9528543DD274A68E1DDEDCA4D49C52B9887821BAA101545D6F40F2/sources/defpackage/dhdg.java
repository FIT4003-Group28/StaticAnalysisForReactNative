package defpackage;
/* compiled from: PG */
/* renamed from: dhdg  reason: default package */
/* loaded from: classes6.dex */
public final class dhdg extends dsqw<dhdg, dhdd> implements dssk {
    public static final dhdg b;
    private static volatile dssr<dhdg> c;
    public dsrf a = dsqz.b;

    static {
        dhdg dhdgVar = new dhdg();
        b = dhdgVar;
        dsqw.cc(dhdg.class, dhdgVar);
    }

    private dhdg() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001,", new Object[]{"a"});
            }
            if (i2 == 3) {
                return new dhdg();
            }
            if (i2 == 4) {
                return new dhdd();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dhdg> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dhdg.class) {
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
