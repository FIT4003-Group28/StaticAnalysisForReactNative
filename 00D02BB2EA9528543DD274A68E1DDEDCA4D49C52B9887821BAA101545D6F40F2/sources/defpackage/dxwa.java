package defpackage;
/* compiled from: PG */
/* renamed from: dxwa  reason: default package */
/* loaded from: classes6.dex */
public final class dxwa extends dsqw<dxwa, dxvz> implements dssk {
    public static final dxwa e;
    private static volatile dssr<dxwa> f;
    public dstn a;
    public dxvw b;
    public dspf c;
    public dstn d;

    static {
        dxwa dxwaVar = new dxwa();
        e = dxwaVar;
        dsqw.cc(dxwa.class, dxwaVar);
    }

    private dxwa() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0000\u0004\u0000\u0000\u0001\u0006\u0004\u0000\u0000\u0000\u0001\t\u0003\t\u0005\t\u0006\t", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new dxwa();
            }
            if (i2 == 4) {
                return new dxvz();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dxwa> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dxwa.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
