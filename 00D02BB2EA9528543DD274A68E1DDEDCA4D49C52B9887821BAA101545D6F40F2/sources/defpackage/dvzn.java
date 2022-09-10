package defpackage;
/* compiled from: PG */
/* renamed from: dvzn  reason: default package */
/* loaded from: classes6.dex */
public final class dvzn extends dsqw<dvzn, dvzm> implements dssk {
    public static final dvzn e;
    private static volatile dssr<dvzn> f;
    public int a;
    public dsrf b = dsqz.b;
    public dsrf c = dsqz.b;
    public int d;

    static {
        dvzn dvznVar = new dvzn();
        e = dvznVar;
        dsqw.cc(dvzn.class, dvznVar);
    }

    private dvzn() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0002\u0000\u0001/\u0002/\u0004င\u0000", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new dvzn();
            }
            if (i2 == 4) {
                return new dvzm();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvzn> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dvzn.class) {
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
        dsrf dsrfVar = this.b;
        if (!dsrfVar.a()) {
            this.b = dsqw.cg(dsrfVar);
        }
    }

    public final void e() {
        dsrf dsrfVar = this.c;
        if (!dsrfVar.a()) {
            this.c = dsqw.cg(dsrfVar);
        }
    }
}
