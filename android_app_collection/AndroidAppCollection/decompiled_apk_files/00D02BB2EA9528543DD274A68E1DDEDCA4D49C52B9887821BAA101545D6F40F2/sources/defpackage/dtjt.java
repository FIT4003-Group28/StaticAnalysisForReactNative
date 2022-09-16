package defpackage;
/* compiled from: PG */
/* renamed from: dtjt  reason: default package */
/* loaded from: classes6.dex */
public final class dtjt extends dsqw<dtjt, dtjq> implements dssk {
    public static final dtjt e;
    private static volatile dssr<dtjt> g;
    public int a;
    public dtjv b;
    public int d;
    private byte f = 2;
    public dsrj<dtrk> c = dssu.b;

    static {
        dtjt dtjtVar = new dtjt();
        e = dtjtVar;
        dsqw.cc(dtjt.class, dtjtVar);
    }

    private dtjt() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0002\u0001ᐉ\u0000\u0002Л\u0003ဋ\u0001", new Object[]{"a", "b", "c", dtrk.class, "d"});
            }
            if (i2 == 3) {
                return new dtjt();
            }
            if (i2 == 4) {
                return new dtjq();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.f = b;
                return null;
            }
            dssr<dtjt> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dtjt.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.f);
    }

    public final void c() {
        dsrj<dtrk> dsrjVar = this.c;
        if (!dsrjVar.a()) {
            this.c = dsqw.cl(dsrjVar);
        }
    }
}
