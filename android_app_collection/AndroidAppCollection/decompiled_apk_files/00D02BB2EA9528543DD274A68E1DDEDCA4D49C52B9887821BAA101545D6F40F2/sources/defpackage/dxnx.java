package defpackage;
/* compiled from: PG */
/* renamed from: dxnx  reason: default package */
/* loaded from: classes6.dex */
public final class dxnx extends dsqw<dxnx, dxnw> implements dssk {
    public static final dxnx j;
    private static volatile dssr<dxnx> k;
    public dxmm a;
    public dspd b = dspd.b;
    public String c = "";
    public int d;
    public dxna e;
    public int f;
    public boolean g;
    public boolean h;
    public boolean i;

    static {
        dxnx dxnxVar = new dxnx();
        j = dxnxVar;
        dsqw.cc(dxnx.class, dxnxVar);
    }

    private dxnx() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(j, "\u0000\t\u0000\u0000\u0001\t\t\u0000\u0000\u0000\u0001\t\u0002\n\u0003Ȉ\u0004\u0004\u0005\t\u0006\f\u0007\u0007\b\u0007\t\u0007", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i"});
            }
            if (i2 == 3) {
                return new dxnx();
            }
            if (i2 == 4) {
                return new dxnw();
            }
            if (i2 == 5) {
                return j;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dxnx> dssrVar = k;
            if (dssrVar == null) {
                synchronized (dxnx.class) {
                    dssrVar = k;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(j);
                        k = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
