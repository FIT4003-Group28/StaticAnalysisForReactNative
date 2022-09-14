package defpackage;
/* compiled from: PG */
/* renamed from: dhva  reason: default package */
/* loaded from: classes6.dex */
public final class dhva extends dsqw<dhva, dhuz> implements dssk {
    public static final dhva d;
    private static volatile dssr<dhva> e;
    public int a;
    public dsrj<dggg> b;
    public String c;

    static {
        dhva dhvaVar = new dhva();
        d = dhvaVar;
        dsqw.cc(dhva.class, dhvaVar);
    }

    private dhva() {
        dsrx dsrxVar = dsrx.b;
        this.b = dssu.b;
        this.c = "";
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0003\u0005\u0002\u0000\u0001\u0000\u0003\u001b\u0005ဈ\u0001", new Object[]{"a", "b", dggg.class, "c"});
            }
            if (i2 == 3) {
                return new dhva();
            }
            if (i2 == 4) {
                return new dhuz();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dhva> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dhva.class) {
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
        dsrj<dggg> dsrjVar = this.b;
        if (!dsrjVar.a()) {
            this.b = dsqw.cl(dsrjVar);
        }
    }
}
