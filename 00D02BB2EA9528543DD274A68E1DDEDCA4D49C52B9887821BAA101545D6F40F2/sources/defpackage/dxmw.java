package defpackage;
/* compiled from: PG */
/* renamed from: dxmw  reason: default package */
/* loaded from: classes6.dex */
public final class dxmw extends dsqw<dxmw, dxmv> implements dssk {
    public static final dxmw e;
    private static volatile dssr<dxmw> f;
    public boolean b;
    public boolean c;
    public String a = "";
    public dsrj<dxnc> d = dssu.b;

    static {
        dxmw dxmwVar = new dxmw();
        e = dxmwVar;
        dsqw.cc(dxmw.class, dxmwVar);
    }

    private dxmw() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001Ȉ\u0002\u0007\u0003\u0007\u0004\u001b", new Object[]{"a", "b", "c", "d", dxnc.class});
            }
            if (i2 == 3) {
                return new dxmw();
            }
            if (i2 == 4) {
                return new dxmv();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dxmw> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dxmw.class) {
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
