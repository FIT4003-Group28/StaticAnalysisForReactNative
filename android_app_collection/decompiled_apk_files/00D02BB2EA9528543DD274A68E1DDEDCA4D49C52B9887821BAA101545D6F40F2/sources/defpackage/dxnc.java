package defpackage;
/* compiled from: PG */
/* renamed from: dxnc  reason: default package */
/* loaded from: classes6.dex */
public final class dxnc extends dsqw<dxnc, dxnb> implements dssk {
    public static final dxnc e;
    private static volatile dssr<dxnc> f;
    public int a;
    public String b = "";
    public String c = "";
    public String d = "";

    static {
        dxnc dxncVar = new dxnc();
        e = dxncVar;
        dsqw.cc(dxnc.class, dxncVar);
    }

    private dxnc() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\f\u0002Ȉ\u0003Ȉ\u0004Ȉ", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new dxnc();
            }
            if (i2 == 4) {
                return new dxnb();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dxnc> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dxnc.class) {
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
