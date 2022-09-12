package defpackage;
/* compiled from: PG */
/* renamed from: dnyb  reason: default package */
/* loaded from: classes6.dex */
public final class dnyb extends dsqw<dnyb, dnya> implements dssk {
    public static final dnyb d;
    private static volatile dssr<dnyb> e;
    public int a;
    public boolean b;
    public dsrj<dpma> c = dssu.b;

    static {
        dnyb dnybVar = new dnyb();
        d = dnybVar;
        dsqw.cc(dnyb.class, dnybVar);
    }

    private dnyb() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဇ\u0000\u0002\u001b", new Object[]{"a", "b", "c", dpma.class});
            }
            if (i2 == 3) {
                return new dnyb();
            }
            if (i2 == 4) {
                return new dnya();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnyb> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dnyb.class) {
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
