package defpackage;
/* compiled from: PG */
/* renamed from: dnqe  reason: default package */
/* loaded from: classes6.dex */
public final class dnqe extends dsqw<dnqe, dnps> implements dssk {
    public static final dnqe i;
    private static volatile dssr<dnqe> j;
    public int a;
    public int b;
    public int c;
    public int d;
    public dhjx e;
    public dnpz f;
    public int g;
    public dsrj<dnpw> h = dssu.b;

    static {
        dnqe dnqeVar = new dnqe();
        i = dnqeVar;
        dsqw.cc(dnqe.class, dnqeVar);
    }

    private dnqe() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(i, "\u0001\u0007\u0000\u0001\u0001\u000b\u0007\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဌ\u0002\u0004ဉ\u0003\u0006ဉ\u0005\u0007င\u0006\u000b\u001b", new Object[]{"a", "b", dnqb.c(), "c", dnpx.a, "d", dnqc.a, "e", "f", "g", "h", dnpw.class});
            }
            if (i3 == 3) {
                return new dnqe();
            }
            if (i3 == 4) {
                return new dnps();
            }
            if (i3 == 5) {
                return i;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<dnqe> dssrVar = j;
            if (dssrVar == null) {
                synchronized (dnqe.class) {
                    dssrVar = j;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(i);
                        j = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }

    public final void b() {
        dsrj<dnpw> dsrjVar = this.h;
        if (!dsrjVar.a()) {
            this.h = dsqw.cl(dsrjVar);
        }
    }
}
