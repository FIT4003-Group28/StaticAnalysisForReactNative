package defpackage;
/* compiled from: PG */
/* renamed from: dxrs  reason: default package */
/* loaded from: classes6.dex */
public final class dxrs extends dsqw<dxrs, dxrr> implements dssk {
    public static final dxrs c;
    private static volatile dssr<dxrs> d;
    public String a = "";
    public dxro b;

    static {
        dxrs dxrsVar = new dxrs();
        c = dxrsVar;
        dsqw.cc(dxrs.class, dxrsVar);
    }

    private dxrs() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dxrs();
            }
            if (i2 == 4) {
                return new dxrr();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dxrs> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dxrs.class) {
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
