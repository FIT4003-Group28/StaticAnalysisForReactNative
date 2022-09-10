package defpackage;
/* compiled from: PG */
/* renamed from: dxae  reason: default package */
/* loaded from: classes6.dex */
public final class dxae extends dsqw<dxae, dxad> implements dssk {
    public static final dxae c;
    private static volatile dssr<dxae> e;
    public int a = -1;
    public long b;
    private int d;

    static {
        dxae dxaeVar = new dxae();
        c = dxaeVar;
        dsqw.cc(dxae.class, dxaeVar);
    }

    private dxae() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဃ\u0001", new Object[]{"d", "a", dndr.c(), "b"});
            }
            if (i2 == 3) {
                return new dxae();
            }
            if (i2 == 4) {
                return new dxad();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dxae> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dxae.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
