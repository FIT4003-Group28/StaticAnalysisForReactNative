package defpackage;
/* compiled from: PG */
/* renamed from: dwjv  reason: default package */
/* loaded from: classes6.dex */
public final class dwjv extends dsqw<dwjv, dwju> implements dssk {
    public static final dwjv e;
    private static volatile dssr<dwjv> f;
    public int a;
    public dsrj<dosk> b = dssu.b;
    public dnqf c;
    public djgw d;

    static {
        dwjv dwjvVar = new dwjv();
        e = dwjvVar;
        dsqw.cc(dwjv.class, dwjvVar);
    }

    private dwjv() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000\u0004ဉ\u0002", new Object[]{"a", "b", dosk.class, "c", "d"});
            }
            if (i2 == 3) {
                return new dwjv();
            }
            if (i2 == 4) {
                return new dwju();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwjv> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dwjv.class) {
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

    public final void c() {
        dsrj<dosk> dsrjVar = this.b;
        if (!dsrjVar.a()) {
            this.b = dsqw.cl(dsrjVar);
        }
    }
}
