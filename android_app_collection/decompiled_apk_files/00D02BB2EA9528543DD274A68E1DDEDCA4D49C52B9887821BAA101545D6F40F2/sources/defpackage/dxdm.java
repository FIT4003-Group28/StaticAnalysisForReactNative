package defpackage;
/* compiled from: PG */
/* renamed from: dxdm  reason: default package */
/* loaded from: classes6.dex */
public final class dxdm extends dsqw<dxdm, dxdl> implements dssk {
    public static final dxdm e;
    private static volatile dssr<dxdm> f;
    public int a;
    public String b = "";
    public dsrj<dxdo> c = dssu.b;
    public String d = "";

    static {
        dxdm dxdmVar = new dxdm();
        e = dxdmVar;
        dsqw.cc(dxdm.class, dxdmVar);
    }

    private dxdm() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဈ\u0001", new Object[]{"a", "b", "c", dxdo.class, "d"});
            }
            if (i2 == 3) {
                return new dxdm();
            }
            if (i2 == 4) {
                return new dxdl();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dxdm> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dxdm.class) {
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
