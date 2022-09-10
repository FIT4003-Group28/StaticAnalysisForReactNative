package defpackage;
/* compiled from: PG */
/* renamed from: djyq  reason: default package */
/* loaded from: classes.dex */
public final class djyq extends dsqw<djyq, djyp> implements dssk {
    public static final djyq d;
    private static volatile dssr<djyq> e;
    public int a;
    public dsrf b = dsqz.b;
    public dhkd c;

    static {
        djyq djyqVar = new djyq();
        d = djyqVar;
        dsqw.cc(djyq.class, djyqVar);
    }

    private djyq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001e\u0002ဉ\u0000", new Object[]{"a", "b", doos.c(), "c"});
            }
            if (i2 == 3) {
                return new djyq();
            }
            if (i2 == 4) {
                return new djyp();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djyq> dssrVar = e;
            if (dssrVar == null) {
                synchronized (djyq.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }

    public final void b() {
        dsrf dsrfVar = this.b;
        if (!dsrfVar.a()) {
            this.b = dsqw.cg(dsrfVar);
        }
    }
}
