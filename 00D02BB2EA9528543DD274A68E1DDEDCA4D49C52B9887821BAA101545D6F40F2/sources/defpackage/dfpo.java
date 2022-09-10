package defpackage;
/* compiled from: PG */
/* renamed from: dfpo  reason: default package */
/* loaded from: classes6.dex */
public final class dfpo extends dsqw<dfpo, dfpn> implements dssk {
    public static final dfpo h;
    public static final dsqv<dmlk, dfpo> i;
    private static volatile dssr<dfpo> k;
    public int a;
    public dfos b;
    public int d;
    public int e;
    public dncj f;
    private byte j = 2;
    public String c = "";
    public dsrj<dfpm> g = dssu.b;

    static {
        dfpo dfpoVar = new dfpo();
        h = dfpoVar;
        dsqw.cc(dfpo.class, dfpoVar);
        i = dsqw.newSingularGeneratedExtension(dmlk.a, dfpoVar, dfpoVar, null, 299174093, dsur.MESSAGE, dfpo.class);
    }

    private dfpo() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            byte b = 1;
            if (i3 == 2) {
                return cd(h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0001\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဌ\u0002\u0004ဉ\u0004\u0005Л\u0006ဌ\u0003", new Object[]{"a", "b", "c", "d", dpvf.c(), "f", "g", dfpm.class, "e", dfpy.c()});
            }
            if (i3 == 3) {
                return new dfpo();
            }
            if (i3 == 4) {
                return new dfpn();
            }
            if (i3 == 5) {
                return h;
            }
            if (i3 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.j = b;
                return null;
            }
            dssr<dfpo> dssrVar = k;
            if (dssrVar == null) {
                synchronized (dfpo.class) {
                    dssrVar = k;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(h);
                        k = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.j);
    }

    public final void b() {
        dsrj<dfpm> dsrjVar = this.g;
        if (!dsrjVar.a()) {
            this.g = dsqw.cl(dsrjVar);
        }
    }
}
