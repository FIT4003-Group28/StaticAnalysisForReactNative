package defpackage;
/* compiled from: PG */
/* renamed from: dxrc  reason: default package */
/* loaded from: classes6.dex */
public final class dxrc extends dsqw<dxrc, dxrb> implements dssk {
    public static final dxrc c;
    private static volatile dssr<dxrc> d;
    public dugy a;
    public float b;

    static {
        dxrc dxrcVar = new dxrc();
        c = dxrcVar;
        dsqw.cc(dxrc.class, dxrcVar);
    }

    private dxrc() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u0001", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dxrc();
            }
            if (i2 == 4) {
                return new dxrb();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dxrc> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dxrc.class) {
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
