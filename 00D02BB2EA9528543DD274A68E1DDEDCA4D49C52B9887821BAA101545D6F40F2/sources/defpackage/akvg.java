package defpackage;
/* compiled from: PG */
/* renamed from: akvg  reason: default package */
/* loaded from: classes2.dex */
public final class akvg extends dsqw<akvg, akvf> implements dssk {
    public static final akvg c;
    private static volatile dssr<akvg> d;
    public int a;
    public dggg b;

    static {
        akvg akvgVar = new akvg();
        c = akvgVar;
        dsqw.cc(akvg.class, akvgVar);
    }

    private akvg() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new akvg();
            }
            if (i2 == 4) {
                return new akvf();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<akvg> dssrVar = d;
            if (dssrVar == null) {
                synchronized (akvg.class) {
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
