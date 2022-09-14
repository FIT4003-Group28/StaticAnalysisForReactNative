package defpackage;
/* compiled from: PG */
/* renamed from: ddwb  reason: default package */
/* loaded from: classes6.dex */
public final class ddwb extends dsqw<ddwb, ddvq> implements dssk {
    public static final ddwb e;
    private static volatile dssr<ddwb> g;
    public int a;
    public ddwr b;
    public int d;
    private byte f = 2;
    public dsrj<ddvu> c = dssu.b;

    static {
        ddwb ddwbVar = new ddwb();
        e = ddwbVar;
        dsqw.cc(ddwb.class, ddwbVar);
    }

    private ddwb() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003င\u0001", new Object[]{"a", "b", "c", ddvu.class, "d"});
            }
            if (i2 == 3) {
                return new ddwb();
            }
            if (i2 == 4) {
                return new ddvq();
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
            dssr<ddwb> dssrVar = g;
            if (dssrVar == null) {
                synchronized (ddwb.class) {
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

    public final void b() {
        dsrj<ddvu> dsrjVar = this.c;
        if (!dsrjVar.a()) {
            this.c = dsqw.cl(dsrjVar);
        }
    }
}
