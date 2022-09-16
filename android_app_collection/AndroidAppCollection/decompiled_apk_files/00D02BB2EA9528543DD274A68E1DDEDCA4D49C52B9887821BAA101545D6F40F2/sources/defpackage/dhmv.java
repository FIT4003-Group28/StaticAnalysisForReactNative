package defpackage;
/* compiled from: PG */
/* renamed from: dhmv  reason: default package */
/* loaded from: classes6.dex */
public final class dhmv extends dsqw<dhmv, dhms> implements dssk {
    public static final dhmv e;
    private static volatile dssr<dhmv> g;
    public int a;
    public dnqh d;
    private byte f = 2;
    public dsrj<String> b = dssu.b;
    public dsrj<dhmu> c = dssu.b;

    static {
        dhmv dhmvVar = new dhmv();
        e = dhmvVar;
        dsqw.cc(dhmv.class, dhmvVar);
    }

    private dhmv() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0002\u0001\u0001\u001a\u0002\u001b\u0004ᐉ\u0000", new Object[]{"a", "b", "c", dhmu.class, "d"});
            }
            if (i2 == 3) {
                return new dhmv();
            }
            if (i2 == 4) {
                return new dhms();
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
            dssr<dhmv> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dhmv.class) {
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
}
