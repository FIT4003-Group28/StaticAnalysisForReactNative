package defpackage;
/* compiled from: PG */
/* renamed from: dlrq  reason: default package */
/* loaded from: classes6.dex */
public final class dlrq extends dsqw<dlrq, dlrp> implements dssk {
    public static final dsrg<Integer, dluy> e = new dlro();
    public static final dlrq q;
    private static volatile dssr<dlrq> s;
    public int a;
    public int b;
    public int c;
    public long f;
    public long g;
    public int i;
    public boolean l;
    public boolean n;
    public ddpm p;
    private byte r = 2;
    public dsrf d = dsqz.b;
    public dsrj<dlpt> h = dssu.b;
    public dsrj<dlpx> j = dssu.b;
    public dsrj<dlqq> k = dssu.b;
    public dsri m = dsrx.b;
    public dsrj<dlrh> o = dssu.b;

    static {
        dlrq dlrqVar = new dlrq();
        q = dlrqVar;
        dsqw.cc(dlrq.class, dlrqVar);
    }

    private dlrq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(q, "\u0001\u000e\u0000\u0001\u0001\u0014\u000e\u0000\u0006\u0001\u0001င\u0000\u0002င\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005Л\u0006ဌ\u0004\u0007\u001b\nဇ\u0007\u000e\u0014\u0010\u001e\u0011ဇ\b\u0012\u001b\u0013\u001b\u0014ဉ\t", new Object[]{"a", "b", "c", "f", "g", "h", dlpt.class, "i", dlpu.a, "j", dlpx.class, "l", "m", "d", dluy.c(), "n", "o", dlrh.class, "k", dlqq.class, "p"});
            }
            if (i2 == 3) {
                return new dlrq();
            }
            if (i2 == 4) {
                return new dlrp();
            }
            if (i2 == 5) {
                return q;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.r = b;
                return null;
            }
            dssr<dlrq> dssrVar = s;
            if (dssrVar == null) {
                synchronized (dlrq.class) {
                    dssrVar = s;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(q);
                        s = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.r);
    }
}
