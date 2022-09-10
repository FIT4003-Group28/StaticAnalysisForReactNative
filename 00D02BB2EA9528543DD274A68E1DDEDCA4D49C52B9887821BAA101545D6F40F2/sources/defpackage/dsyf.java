package defpackage;
/* compiled from: PG */
/* renamed from: dsyf  reason: default package */
/* loaded from: classes6.dex */
public final class dsyf extends dsqw<dsyf, dsyc> implements dssk {
    public static final dsyf e;
    private static volatile dssr<dsyf> g;
    public int a;
    public dsys d;
    private byte f = 2;
    public dsrj<dsye> b = dssu.b;
    public String c = "";

    static {
        dsyf dsyfVar = new dsyf();
        e = dsyfVar;
        dsqw.cc(dsyf.class, dsyfVar);
    }

    private dsyf() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0002\u0001Л\u0002ဈ\u0000\u0003ᐉ\u0001", new Object[]{"a", "b", dsye.class, "c", "d"});
            }
            if (i2 == 3) {
                return new dsyf();
            }
            if (i2 == 4) {
                return new dsyc();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.f = b;
                return null;
            }
            dssr<dsyf> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dsyf.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.f);
    }
}
