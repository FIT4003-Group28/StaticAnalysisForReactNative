package defpackage;
/* compiled from: PG */
/* renamed from: dimp  reason: default package */
/* loaded from: classes6.dex */
public final class dimp extends dsqw<dimp, dimo> implements dssk {
    public static final dimp e;
    private static volatile dssr<dimp> f;
    public int a;
    public dspd b = dspd.b;
    public dsrj<dqae> c = dssu.b;
    public dspd d = dspd.b;

    static {
        dimp dimpVar = new dimp();
        e = dimpVar;
        dsqw.cc(dimp.class, dimpVar);
    }

    private dimp() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ည\u0000\u0002\u001b\u0003ည\u0001", new Object[]{"a", "b", "c", dqae.class, "d"});
            }
            if (i2 == 3) {
                return new dimp();
            }
            if (i2 == 4) {
                return new dimo();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dimp> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dimp.class) {
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

    public final void b() {
        dsrj<dqae> dsrjVar = this.c;
        if (!dsrjVar.a()) {
            this.c = dsqw.cl(dsrjVar);
        }
    }
}
