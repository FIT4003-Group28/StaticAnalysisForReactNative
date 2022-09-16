package defpackage;
/* compiled from: PG */
/* renamed from: dpot  reason: default package */
/* loaded from: classes6.dex */
public final class dpot extends dsqw<dpot, dpoq> implements dssk {
    public static final dpot m;
    private static volatile dssr<dpot> n;
    public int a;
    public dpov b;
    public int c;
    public dpri d;
    public dpre e;
    public String f = "";
    public String g = "";
    public dsrj<dppl> h = dssu.b;
    public long i;
    public dpos j;
    public dpox k;
    public dpqd l;

    static {
        dpot dpotVar = new dpot();
        m = dpotVar;
        dsqw.cc(dpot.class, dpotVar);
    }

    private dpot() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(m, "\u0001\u000b\u0000\u0001\u0001\u0011\u000b\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဌ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\t\u001b\nဉ\n\u000eဃ\t\u0010ဉ\u000b\u0011ဉ\f", new Object[]{"a", "b", "c", dpqw.c(), "d", "e", "f", "g", "h", dppl.class, "j", "i", "k", "l"});
            }
            if (i2 == 3) {
                return new dpot();
            }
            if (i2 == 4) {
                return new dpoq();
            }
            if (i2 == 5) {
                return m;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dpot> dssrVar = n;
            if (dssrVar == null) {
                synchronized (dpot.class) {
                    dssrVar = n;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(m);
                        n = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }

    public final void b() {
        dsrj<dppl> dsrjVar = this.h;
        if (!dsrjVar.a()) {
            this.h = dsqw.cl(dsrjVar);
        }
    }
}
