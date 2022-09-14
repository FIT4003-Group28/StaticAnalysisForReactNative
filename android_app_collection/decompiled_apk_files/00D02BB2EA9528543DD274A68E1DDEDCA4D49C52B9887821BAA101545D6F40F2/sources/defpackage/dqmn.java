package defpackage;
/* compiled from: PG */
/* renamed from: dqmn  reason: default package */
/* loaded from: classes6.dex */
public final class dqmn extends dsqw<dqmn, dqmm> implements dssk {
    public static final dsrg<Integer, dpol> d = new dqml();
    public static final dqmn f;
    private static volatile dssr<dqmn> g;
    public int a;
    public int b = 1;
    public dsrf c = dsqz.b;
    public dptk e;

    static {
        dqmn dqmnVar = new dqmn();
        f = dqmnVar;
        dsqw.cc(dqmn.class, dqmnVar);
    }

    private dqmn() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001င\u0000\u0002\u001e\u0003ဉ\u0001", new Object[]{"a", "b", "c", dpol.c(), "e"});
            }
            if (i2 == 3) {
                return new dqmn();
            }
            if (i2 == 4) {
                return new dqmm();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqmn> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dqmn.class) {
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
        dsrf dsrfVar = this.c;
        if (!dsrfVar.a()) {
            this.c = dsqw.cg(dsrfVar);
        }
    }
}
