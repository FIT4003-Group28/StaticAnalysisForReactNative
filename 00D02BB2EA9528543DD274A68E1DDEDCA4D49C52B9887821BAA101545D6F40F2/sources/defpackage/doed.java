package defpackage;
/* compiled from: PG */
/* renamed from: doed  reason: default package */
/* loaded from: classes6.dex */
public final class doed extends dsqw<doed, doea> implements doee {
    public static final doed c;
    private static volatile dssr<doed> d;
    public int a;
    public doec b;

    static {
        doed doedVar = new doed();
        c = doedVar;
        dsqw.cc(doed.class, doedVar);
    }

    private doed() {
        dssu<Object> dssuVar = dssu.b;
        dspd dspdVar = dspd.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0005\u0005\u0001\u0000\u0000\u0000\u0005ဉ\u0005", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new doed();
            }
            if (i2 == 4) {
                return new doea();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<doed> dssrVar = d;
            if (dssrVar == null) {
                synchronized (doed.class) {
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
