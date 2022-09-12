package defpackage;
/* compiled from: PG */
/* renamed from: dxuw  reason: default package */
/* loaded from: classes6.dex */
public final class dxuw extends dsqw<dxuw, dxuv> implements dssk {
    public static final dxuw e;
    private static volatile dssr<dxuw> f;
    public dxvm a;
    public boolean b;
    public long c;
    public dspd d = dspd.b;

    static {
        dxuw dxuwVar = new dxuw();
        e = dxuwVar;
        dsqw.cc(dxuw.class, dxuwVar);
    }

    private dxuw() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0000\u0004\u0000\u0000\u0002\b\u0004\u0000\u0000\u0000\u0002\t\u0003\u0007\u0004\u0002\b\n", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new dxuw();
            }
            if (i2 == 4) {
                return new dxuv();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dxuw> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dxuw.class) {
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
