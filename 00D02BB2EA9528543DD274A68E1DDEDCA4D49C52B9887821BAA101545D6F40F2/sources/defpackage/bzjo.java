package defpackage;
/* compiled from: PG */
/* renamed from: bzjo  reason: default package */
/* loaded from: classes4.dex */
public final class bzjo extends dsqw<bzjo, bzjm> implements dssk {
    public static final bzjo e;
    private static volatile dssr<bzjo> f;
    public int a;
    public int c;
    public dssd<String, bzip> b = dssd.b;
    public boolean d = true;

    static {
        bzjo bzjoVar = new bzjo();
        e = bzjoVar;
        dsqw.cc(bzjo.class, bzjoVar);
    }

    private bzjo() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0001\u0000\u0000\u00012\u0002င\u0000\u0003ဇ\u0001", new Object[]{"a", "b", bzjn.a, "c", "d"});
            }
            if (i2 == 3) {
                return new bzjo();
            }
            if (i2 == 4) {
                return new bzjm();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<bzjo> dssrVar = f;
            if (dssrVar == null) {
                synchronized (bzjo.class) {
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

    public final dssd<String, bzip> b() {
        dssd<String, bzip> dssdVar = this.b;
        if (!dssdVar.a) {
            this.b = dssdVar.a();
        }
        return this.b;
    }

    public final boolean c(String str) {
        str.getClass();
        return this.b.containsKey(str);
    }
}
