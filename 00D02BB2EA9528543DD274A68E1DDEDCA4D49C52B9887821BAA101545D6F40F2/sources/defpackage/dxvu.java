package defpackage;
/* compiled from: PG */
/* renamed from: dxvu  reason: default package */
/* loaded from: classes6.dex */
public final class dxvu extends dsqw<dxvu, dxvt> implements dssk {
    public static final dxvu b;
    private static volatile dssr<dxvu> c;
    public dsrj<dxvs> a = dssu.b;

    static {
        dxvu dxvuVar = new dxvu();
        b = dxvuVar;
        dsqw.cc(dxvu.class, dxvuVar);
    }

    private dxvu() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", dxvs.class});
            }
            if (i2 == 3) {
                return new dxvu();
            }
            if (i2 == 4) {
                return new dxvt();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dxvu> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dxvu.class) {
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
