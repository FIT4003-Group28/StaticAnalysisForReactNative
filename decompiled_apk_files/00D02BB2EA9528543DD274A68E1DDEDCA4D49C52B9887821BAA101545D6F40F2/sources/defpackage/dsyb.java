package defpackage;
/* compiled from: PG */
/* renamed from: dsyb  reason: default package */
/* loaded from: classes6.dex */
public final class dsyb extends dsqw<dsyb, dsya> implements dssk {
    public static final dsyb a;
    private static volatile dssr<dsyb> f;
    private int b;
    private byte e = 2;
    private String c = "";
    private String d = "";

    static {
        dsyb dsybVar = new dsyb();
        a = dsybVar;
        dsqw.cc(dsyb.class, dsybVar);
    }

    private dsyb() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔈ\u0000\u0002ᔈ\u0001", new Object[]{"b", "c", "d"});
            }
            if (i2 == 3) {
                return new dsyb();
            }
            if (i2 == 4) {
                return new dsya();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.e = b;
                return null;
            }
            dssr<dsyb> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dsyb.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.e);
    }
}
