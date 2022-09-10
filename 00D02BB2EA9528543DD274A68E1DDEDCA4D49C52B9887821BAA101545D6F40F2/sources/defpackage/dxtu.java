package defpackage;
/* compiled from: PG */
/* renamed from: dxtu  reason: default package */
/* loaded from: classes6.dex */
public final class dxtu extends dsqw<dxtu, dxts> implements dssk {
    public static final dxtu d;
    private static volatile dssr<dxtu> e;
    public int a = 0;
    public Object b;
    public int c;

    static {
        dxtu dxtuVar = new dxtu();
        d = dxtuVar;
        dsqw.cc(dxtu.class, dxtuVar);
    }

    private dxtu() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0000\u0006\u0001\u0000\u0001m\u0006\u0000\u0000\u0000\u0001\fi<\u0000j<\u0000k<\u0000l<\u0000m<\u0000", new Object[]{"b", "a", "c", dxwu.class, dxwo.class, dxxa.class, dxws.class, dxwq.class});
            }
            if (i2 == 3) {
                return new dxtu();
            }
            if (i2 == 4) {
                return new dxts();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dxtu> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dxtu.class) {
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
