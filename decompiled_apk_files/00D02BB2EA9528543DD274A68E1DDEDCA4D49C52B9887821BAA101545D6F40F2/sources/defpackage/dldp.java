package defpackage;
/* compiled from: PG */
/* renamed from: dldp  reason: default package */
/* loaded from: classes6.dex */
public final class dldp extends dsqw<dldp, dldm> implements dssk {
    public static final dldp d;
    private static volatile dssr<dldp> g;
    private int e;
    private byte f = 2;
    public String a = "";
    public String b = "";
    public dsrj<dldo> c = dssu.b;

    static {
        dldp dldpVar = new dldp();
        d = dldpVar;
        dsqw.cc(dldp.class, dldpVar);
    }

    private dldp() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0001\u0001ဈ\u0000\u0002ဈ\u0001\u0003Л", new Object[]{"e", "a", "b", "c", dldo.class});
            }
            if (i2 == 3) {
                return new dldp();
            }
            if (i2 == 4) {
                return new dldm();
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
            dssr<dldp> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dldp.class) {
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
