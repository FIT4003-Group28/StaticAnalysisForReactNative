package defpackage;
/* compiled from: PG */
/* renamed from: dtak  reason: default package */
/* loaded from: classes6.dex */
public final class dtak extends dsqw<dtak, dtaj> implements dssk {
    public static final dtak d;
    private static volatile dssr<dtak> e;
    public int a;
    public int b;
    public int c;

    static {
        dtak dtakVar = new dtak();
        d = dtakVar;
        dsqw.cc(dtak.class, dtakVar);
    }

    private dtak() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဍ\u0000\u0002ဍ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dtak();
            }
            if (i2 == 4) {
                return new dtaj();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dtak> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dtak.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
