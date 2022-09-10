package defpackage;
/* compiled from: PG */
/* renamed from: dkck  reason: default package */
/* loaded from: classes6.dex */
public final class dkck extends dsqw<dkck, dkbt> implements dssk {
    public static final dkck e;
    private static volatile dssr<dkck> g;
    public int a;
    public dkch c;
    public dnqh d;
    private byte f = 2;
    public String b = "";

    static {
        dkck dkckVar = new dkck();
        e = dkckVar;
        dsqw.cc(dkck.class, dkckVar);
    }

    private dkck() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ဈ\u0000\u0002ဉ\u0001\u0003ᐉ\u0003", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new dkck();
            }
            if (i2 == 4) {
                return new dkbt();
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
            dssr<dkck> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dkck.class) {
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
