package defpackage;
/* compiled from: PG */
/* renamed from: dxla  reason: default package */
/* loaded from: classes6.dex */
public final class dxla extends dsqw<dxla, dxkz> implements dssk {
    public static final dxla c;
    private static volatile dssr<dxla> d;
    public dxqi a;
    public dsrj<dxks> b = dssu.b;

    static {
        dxla dxlaVar = new dxla();
        c = dxlaVar;
        dsqw.cc(dxla.class, dxlaVar);
    }

    private dxla() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\t\u0002\u001b", new Object[]{"a", "b", dxks.class});
            }
            if (i2 == 3) {
                return new dxla();
            }
            if (i2 == 4) {
                return new dxkz();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dxla> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dxla.class) {
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
