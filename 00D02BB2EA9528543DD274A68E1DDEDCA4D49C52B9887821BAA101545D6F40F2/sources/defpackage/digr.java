package defpackage;
/* compiled from: PG */
/* renamed from: digr  reason: default package */
/* loaded from: classes6.dex */
public final class digr extends dsqw<digr, digo> implements dssk {
    public static final digr d;
    private static volatile dssr<digr> f;
    public dsrj<digq> a = dssu.b;
    public dsrj<digq> b = dssu.b;
    public boolean c;
    private int e;

    static {
        digr digrVar = new digr();
        d = digrVar;
        dsqw.cc(digr.class, digrVar);
    }

    private digr() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0002\u0000\u0001\u001b\u0003\u001b\u0004ဇ\u0001", new Object[]{"e", "a", digq.class, "b", digq.class, "c"});
            }
            if (i2 == 3) {
                return new digr();
            }
            if (i2 == 4) {
                return new digo();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<digr> dssrVar = f;
            if (dssrVar == null) {
                synchronized (digr.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }

    public final void b() {
        dsrj<digq> dsrjVar = this.a;
        if (!dsrjVar.a()) {
            this.a = dsqw.cl(dsrjVar);
        }
    }
}
