package defpackage;
/* compiled from: PG */
/* renamed from: dvqr  reason: default package */
/* loaded from: classes6.dex */
public final class dvqr extends dsqw<dvqr, dvqk> implements dssk {
    public static final dvqr g;
    private static volatile dssr<dvqr> j;
    public int a;
    public int b;
    public docg c;
    public djgl d;
    public dvqo f;
    private dwzh h;
    private byte i = 2;
    public dsrj<dvqm> e = dssu.b;

    static {
        dvqr dvqrVar = new dvqr();
        g = dvqrVar;
        dsqw.cc(dvqr.class, dvqrVar);
    }

    private dvqr() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(g, "\u0001\u0006\u0000\u0001\u0001\b\u0006\u0000\u0001\u0003\u0001ဌ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0005ᐉ\u0004\u0007\u001b\bဉ\u0006", new Object[]{"a", "b", dvqp.a, "h", "c", "d", "e", dvqm.class, "f"});
            }
            if (i2 == 3) {
                return new dvqr();
            }
            if (i2 == 4) {
                return new dvqk();
            }
            if (i2 == 5) {
                return g;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.i = b;
                return null;
            }
            dssr<dvqr> dssrVar = j;
            if (dssrVar == null) {
                synchronized (dvqr.class) {
                    dssrVar = j;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(g);
                        j = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.i);
    }
}
