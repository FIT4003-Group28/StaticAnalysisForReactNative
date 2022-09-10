package defpackage;
/* compiled from: PG */
/* renamed from: dmph  reason: default package */
/* loaded from: classes.dex */
public final class dmph extends dsqs<dmph, dmpe> implements dsqt {
    public static final dmph f;
    private static volatile dssr<dmph> h;
    public int a;
    private byte g = 2;
    public dsrj<dmpd> b = dssu.b;
    public int c = -1;
    public long d = -1;
    public int e = 1;

    static {
        dmph dmphVar = new dmph();
        f = dmphVar;
        dsqw.cc(dmph.class, dmphVar);
    }

    private dmph() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0001\u0001Л\u0002င\u0000\u0003ဂ\u0001\u0004ဌ\u0002", new Object[]{"a", "b", dmpd.class, "c", "d", "e", dmpf.a});
            }
            if (i2 == 3) {
                return new dmph();
            }
            if (i2 == 4) {
                return new dmpe();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.g = b;
                return null;
            }
            dssr<dmph> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dmph.class) {
                    dssrVar = h;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        h = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.g);
    }

    public final void b() {
        dsrj<dmpd> dsrjVar = this.b;
        if (!dsrjVar.a()) {
            this.b = dsqw.cl(dsrjVar);
        }
    }
}
