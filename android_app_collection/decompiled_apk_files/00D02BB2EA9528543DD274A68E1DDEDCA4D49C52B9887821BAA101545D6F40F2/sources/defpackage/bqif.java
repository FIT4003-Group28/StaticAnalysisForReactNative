package defpackage;
/* compiled from: PG */
/* renamed from: bqif  reason: default package */
/* loaded from: classes4.dex */
public final class bqif extends dsqw<bqif, bqhy> implements dssk {
    public static final bqif f;
    private static volatile dssr<bqif> g;
    public int a;
    public dsrj<bqhv> b = dssu.b;
    public bqhr c;
    public bqie d;
    public int e;

    static {
        bqif bqifVar = new bqif();
        f = bqifVar;
        dsqw.cc(bqif.class, bqifVar);
    }

    private bqif() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0001\u0000\u0001\u001b\u0003ဉ\u0001\u0004ဌ\u0002\u0005ဉ\u0000", new Object[]{"a", "b", bqhv.class, "d", "e", bqhz.a, "c"});
            }
            if (i2 == 3) {
                return new bqif();
            }
            if (i2 == 4) {
                return new bqhy();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<bqif> dssrVar = g;
            if (dssrVar == null) {
                synchronized (bqif.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }

    public final void b() {
        dsrj<bqhv> dsrjVar = this.b;
        if (!dsrjVar.a()) {
            this.b = dsqw.cl(dsrjVar);
        }
    }
}
