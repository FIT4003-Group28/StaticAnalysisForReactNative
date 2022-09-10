package defpackage;
/* compiled from: PG */
/* renamed from: bzok  reason: default package */
/* loaded from: classes.dex */
public final class bzok extends dsqw<bzok, bzoh> implements dssk {
    public static final bzok e;
    private static volatile dssr<bzok> f;
    public int a;
    public dsrj<dspd> b = dssu.b;
    public int c;
    public long d;

    static {
        bzok bzokVar = new bzok();
        e = bzokVar;
        dsqw.cc(bzok.class, bzokVar);
    }

    private bzok() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001c\u0002ဌ\u0000\u0003ဂ\u0001", new Object[]{"a", "b", "c", bzoi.a, "d"});
            }
            if (i2 == 3) {
                return new bzok();
            }
            if (i2 == 4) {
                return new bzoh();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<bzok> dssrVar = f;
            if (dssrVar == null) {
                synchronized (bzok.class) {
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
        dsrj<dspd> dsrjVar = this.b;
        if (!dsrjVar.a()) {
            this.b = dsqw.cl(dsrjVar);
        }
    }
}
