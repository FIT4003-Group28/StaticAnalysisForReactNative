package defpackage;
/* compiled from: PG */
/* renamed from: dowr  reason: default package */
/* loaded from: classes.dex */
public final class dowr extends dsqw<dowr, dowi> implements dssk {
    public static final dowr m;
    private static volatile dssr<dowr> n;
    public int a;
    public boolean b;
    public boolean c;
    public boolean f;
    public dpev g;
    public boolean h;
    public int k;
    public dquw l;
    public int d = 1;
    public boolean e = true;
    public dsrj<dowm> i = dssu.b;
    public dsrj<dowq> j = dssu.b;

    static {
        dowr dowrVar = new dowr();
        m = dowrVar;
        dsqw.cc(dowr.class, dowrVar);
    }

    private dowr() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(m, "\u0001\u000b\u0000\u0001\u0001-\u000b\u0000\u0002\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0004ဇ\u0004\u0005ဉ\u0007\bဇ\t\u0014ဌ\u0002\u0017\u001b\u0019ဇ\u0006\u001aဌ\u000e\u001bဉ\u000f-\u001b", new Object[]{"a", "b", "c", "e", "g", "h", "d", dqux.a, "i", dowm.class, "f", "k", down.a, "l", "j", dowq.class});
            }
            if (i2 == 3) {
                return new dowr();
            }
            if (i2 == 4) {
                return new dowi();
            }
            if (i2 == 5) {
                return m;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dowr> dssrVar = n;
            if (dssrVar == null) {
                synchronized (dowr.class) {
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
        dsrj<dowm> dsrjVar = this.i;
        if (!dsrjVar.a()) {
            this.i = dsqw.cl(dsrjVar);
        }
    }
}
