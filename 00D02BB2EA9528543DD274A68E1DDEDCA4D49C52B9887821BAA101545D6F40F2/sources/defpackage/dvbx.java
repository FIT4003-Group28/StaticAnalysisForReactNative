package defpackage;
/* compiled from: PG */
/* renamed from: dvbx  reason: default package */
/* loaded from: classes6.dex */
public final class dvbx extends dsqw<dvbx, dvbw> implements dssk {
    public static final dvbx c;
    private static volatile dssr<dvbx> d;
    public int a;
    public String b = "";

    static {
        dvbx dvbxVar = new dvbx();
        c = dvbxVar;
        dsqw.cc(dvbx.class, dvbxVar);
    }

    private dvbx() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဈ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dvbx();
            }
            if (i2 == 4) {
                return new dvbw();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvbx> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dvbx.class) {
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
