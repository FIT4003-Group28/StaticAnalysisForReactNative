package defpackage;
/* compiled from: PG */
/* renamed from: dlcc  reason: default package */
/* loaded from: classes6.dex */
public final class dlcc extends dsqw<dlcc, dlbz> implements dssk {
    public static final dlcc e;
    private static volatile dssr<dlcc> g;
    public int a;
    public dlcb d;
    private byte f = 2;
    public String b = "";
    public String c = "";

    static {
        dlcc dlccVar = new dlcc();
        e = dlccVar;
        dsqw.cc(dlcc.class, dlccVar);
    }

    private dlcc() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ဈ\u0000\u0002ဈ\u0001\u0003ᐉ\u0002", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new dlcc();
            }
            if (i2 == 4) {
                return new dlbz();
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
            dssr<dlcc> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dlcc.class) {
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
