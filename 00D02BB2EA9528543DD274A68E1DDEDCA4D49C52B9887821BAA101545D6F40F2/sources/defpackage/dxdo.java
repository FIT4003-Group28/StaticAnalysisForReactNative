package defpackage;
/* compiled from: PG */
/* renamed from: dxdo  reason: default package */
/* loaded from: classes6.dex */
public final class dxdo extends dsqw<dxdo, dxdn> implements dssk {
    public static final dxdo d;
    private static volatile dssr<dxdo> e;
    public int a;
    public String b = "";
    public String c = "";

    static {
        dxdo dxdoVar = new dxdo();
        d = dxdoVar;
        dsqw.cc(dxdo.class, dxdoVar);
    }

    private dxdo() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dxdo();
            }
            if (i2 == 4) {
                return new dxdn();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dxdo> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dxdo.class) {
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
