package defpackage;
/* compiled from: PG */
/* renamed from: dqnx  reason: default package */
/* loaded from: classes6.dex */
public final class dqnx extends dsqw<dqnx, dqnw> implements dssk {
    public static final dqnx d;
    private static volatile dssr<dqnx> e;
    public int a;
    public dsrj<String> b = dssu.b;
    public String c = "";

    static {
        dqnx dqnxVar = new dqnx();
        d = dqnxVar;
        dsqw.cc(dqnx.class, dqnxVar);
    }

    private dqnx() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001a\u0002ဈ\u0000", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dqnx();
            }
            if (i2 == 4) {
                return new dqnw();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqnx> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dqnx.class) {
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
        dsrj<String> dsrjVar = this.b;
        if (!dsrjVar.a()) {
            this.b = dsqw.cl(dsrjVar);
        }
    }
}
