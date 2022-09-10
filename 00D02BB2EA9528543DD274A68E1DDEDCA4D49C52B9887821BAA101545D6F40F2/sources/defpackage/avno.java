package defpackage;
/* compiled from: PG */
/* renamed from: avno  reason: default package */
/* loaded from: classes3.dex */
public final class avno extends dsqw<avno, avnn> implements dssk {
    public static final avno d;
    private static volatile dssr<avno> e;
    public int a;
    public dsrj<avnq> b = dssu.b;
    public dmzj c;

    static {
        avno avnoVar = new avno();
        d = avnoVar;
        dsqw.cc(avno.class, avnoVar);
    }

    private avno() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"a", "b", avnq.class, "c"});
            }
            if (i2 == 3) {
                return new avno();
            }
            if (i2 == 4) {
                return new avnn();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<avno> dssrVar = e;
            if (dssrVar == null) {
                synchronized (avno.class) {
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
        dsrj<avnq> dsrjVar = this.b;
        if (!dsrjVar.a()) {
            this.b = dsqw.cl(dsrjVar);
        }
    }
}
