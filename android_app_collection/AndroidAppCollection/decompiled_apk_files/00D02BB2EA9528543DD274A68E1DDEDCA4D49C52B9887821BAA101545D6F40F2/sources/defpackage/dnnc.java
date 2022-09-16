package defpackage;
/* compiled from: PG */
/* renamed from: dnnc  reason: default package */
/* loaded from: classes6.dex */
public final class dnnc extends dsqw<dnnc, dnnb> implements dssk {
    public static final dnnc e;
    private static volatile dssr<dnnc> f;
    public int a;
    public dsrj<String> b = dssu.b;
    public String c = "";
    public String d = "";

    static {
        dnnc dnncVar = new dnnc();
        e = dnncVar;
        dsqw.cc(dnnc.class, dnncVar);
    }

    private dnnc() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001a\u0002ဈ\u0000\u0003ဈ\u0001", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new dnnc();
            }
            if (i2 == 4) {
                return new dnnb();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnnc> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dnnc.class) {
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
