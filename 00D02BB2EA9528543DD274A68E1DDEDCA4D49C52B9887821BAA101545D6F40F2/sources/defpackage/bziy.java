package defpackage;
/* compiled from: PG */
/* renamed from: bziy  reason: default package */
/* loaded from: classes4.dex */
public final class bziy extends dsqw<bziy, bzix> implements dssk {
    public static final bziy e;
    private static volatile dssr<bziy> f;
    public int a;
    public bziu b;
    public dsrj<bzis> c = dssu.b;
    public bziw d;

    static {
        bziy bziyVar = new bziy();
        e = bziyVar;
        dsqw.cc(bziy.class, bziyVar);
    }

    private bziy() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b\u0003ဉ\u0001", new Object[]{"a", "b", "c", bzis.class, "d"});
            }
            if (i2 == 3) {
                return new bziy();
            }
            if (i2 == 4) {
                return new bzix();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<bziy> dssrVar = f;
            if (dssrVar == null) {
                synchronized (bziy.class) {
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
        dsrj<bzis> dsrjVar = this.c;
        if (!dsrjVar.a()) {
            this.c = dsqw.cl(dsrjVar);
        }
    }
}
