package defpackage;
/* compiled from: PG */
/* renamed from: dxke  reason: default package */
/* loaded from: classes6.dex */
public final class dxke extends dsqw<dxke, dxkd> implements dssk {
    public static final dxke e;
    private static volatile dssr<dxke> f;
    public dxwi a;
    public dspd b = dspd.b;
    public dsrf c = dsqz.b;
    public dxmq d;

    static {
        dxke dxkeVar = new dxke();
        e = dxkeVar;
        dsqw.cc(dxke.class, dxkeVar);
    }

    private dxke() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001\t\u0002\n\u0003,\u0004\t", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new dxke();
            }
            if (i2 == 4) {
                return new dxkd();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dxke> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dxke.class) {
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
