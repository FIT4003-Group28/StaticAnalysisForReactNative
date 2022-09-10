package defpackage;
/* compiled from: PG */
/* renamed from: dxsa  reason: default package */
/* loaded from: classes6.dex */
public final class dxsa extends dsqw<dxsa, dxrz> implements dssk {
    public static final dxsa e;
    private static volatile dssr<dxsa> f;
    public String a = "";
    public dspd b = dspd.b;
    public dxmm c;
    public dxna d;

    static {
        dxsa dxsaVar = new dxsa();
        e = dxsaVar;
        dsqw.cc(dxsa.class, dxsaVar);
    }

    private dxsa() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\t\u0004\t", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new dxsa();
            }
            if (i2 == 4) {
                return new dxrz();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dxsa> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dxsa.class) {
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
