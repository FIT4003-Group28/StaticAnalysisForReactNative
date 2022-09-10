package defpackage;
/* compiled from: PG */
/* renamed from: dpdx  reason: default package */
/* loaded from: classes6.dex */
public final class dpdx extends dsqw<dpdx, dpdw> implements dssk {
    public static final dpdx d;
    private static volatile dssr<dpdx> g;
    public dgas a;
    private int e;
    private byte f = 2;
    public dsrj<doyp> b = dssu.b;
    public dsrj<dpce> c = dssu.b;

    static {
        dpdx dpdxVar = new dpdx();
        d = dpdxVar;
        dsqw.cc(dpdx.class, dpdxVar);
    }

    private dpdx() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0002\t\u0003\u0000\u0002\u0002\u0002ဉ\u0000\u0003Л\tЛ", new Object[]{"e", "a", "b", doyp.class, "c", dpce.class});
            }
            if (i2 == 3) {
                return new dpdx();
            }
            if (i2 == 4) {
                return new dpdw();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.f = b;
                return null;
            }
            dssr<dpdx> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dpdx.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.f);
    }
}
