package defpackage;
/* compiled from: PG */
/* renamed from: dxso  reason: default package */
/* loaded from: classes6.dex */
public final class dxso extends dsqw<dxso, dxsn> implements dssk {
    public static final dxso d;
    private static volatile dssr<dxso> e;
    public int a = 0;
    public Object b;
    public int c;

    static {
        dxso dxsoVar = new dxso();
        d = dxsoVar;
        dsqw.cc(dxso.class, dxsoVar);
    }

    private dxso() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002<\u0000\u0003<\u0000", new Object[]{"b", "a", "c", dxsk.class, dxsc.class});
            }
            if (i2 == 3) {
                return new dxso();
            }
            if (i2 == 4) {
                return new dxsn();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dxso> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dxso.class) {
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
