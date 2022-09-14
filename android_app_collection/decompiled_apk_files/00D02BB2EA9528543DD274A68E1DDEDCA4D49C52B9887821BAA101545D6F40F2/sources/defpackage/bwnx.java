package defpackage;
/* compiled from: PG */
/* renamed from: bwnx  reason: default package */
/* loaded from: classes4.dex */
public final class bwnx extends dsqw<bwnx, bwnt> implements dssk {
    public static final bwnx d;
    private static volatile dssr<bwnx> f;
    public int a;
    public dssd<Integer, bwnv> b = dssd.b;
    private byte e = 2;
    public String c = "";

    static {
        bwnx bwnxVar = new bwnx();
        d = bwnxVar;
        dsqw.cc(bwnx.class, bwnxVar);
    }

    private bwnx() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0001\u0000\u0001\u0001в\u0002ဈ\u0000", new Object[]{"a", "b", bwnw.a, "c"});
            }
            if (i2 == 3) {
                return new bwnx();
            }
            if (i2 == 4) {
                return new bwnt();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.e = b;
                return null;
            }
            dssr<bwnx> dssrVar = f;
            if (dssrVar == null) {
                synchronized (bwnx.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.e);
    }
}
