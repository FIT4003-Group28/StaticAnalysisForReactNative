package defpackage;
/* compiled from: PG */
/* renamed from: dmaa  reason: default package */
/* loaded from: classes6.dex */
public final class dmaa extends dsqw<dmaa, dlzz> implements dssk {
    public static final dmaa d;
    private static volatile dssr<dmaa> e;
    public int a;
    public int b = -1;
    public String c = "";

    static {
        dmaa dmaaVar = new dmaa();
        d = dmaaVar;
        dsqw.cc(dmaa.class, dmaaVar);
    }

    private dmaa() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dmaa();
            }
            if (i2 == 4) {
                return new dlzz();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dmaa> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dmaa.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
