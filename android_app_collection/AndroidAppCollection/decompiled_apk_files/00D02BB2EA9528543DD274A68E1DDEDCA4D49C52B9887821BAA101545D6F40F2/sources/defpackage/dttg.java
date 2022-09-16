package defpackage;
/* compiled from: PG */
/* renamed from: dttg  reason: default package */
/* loaded from: classes6.dex */
public final class dttg extends dsqw<dttg, dttf> implements dssk {
    public static final dttg b;
    private static volatile dssr<dttg> c;
    public boolean a;

    static {
        dttg dttgVar = new dttg();
        b = dttgVar;
        dsqw.cc(dttg.class, dttgVar);
    }

    private dttg() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"a"});
            }
            if (i2 == 3) {
                return new dttg();
            }
            if (i2 == 4) {
                return new dttf();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dttg> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dttg.class) {
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
