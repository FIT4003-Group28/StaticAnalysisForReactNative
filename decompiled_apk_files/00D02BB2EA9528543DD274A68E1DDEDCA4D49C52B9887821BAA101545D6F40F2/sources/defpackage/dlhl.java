package defpackage;
/* compiled from: PG */
/* renamed from: dlhl  reason: default package */
/* loaded from: classes6.dex */
public final class dlhl extends dsqw<dlhl, dlhg> implements dssk {
    public static final dlhl e;
    private static volatile dssr<dlhl> f;
    public int a;
    public Object c;
    public int b = 0;
    public String d = "";

    static {
        dlhl dlhlVar = new dlhl();
        e = dlhlVar;
        dsqw.cc(dlhl.class, dlhlVar);
    }

    private dlhl() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\f\u0001\u0001\u0001\f\f\u0000\u0000\u0000\u0001ဈ\u0000\u0002ျ\u0000\u0003်\u0000\u0004့\u0000\u0005ဵ\u0000\u0006ှ\u0000\u0007ံ\u0000\bဳ\u0000\tဴ\u0000\nွ\u0000\u000bြ\u0000\fြ\u0000", new Object[]{"c", "b", "a", "d", dlhi.class, dlhk.class});
            }
            if (i2 == 3) {
                return new dlhl();
            }
            if (i2 == 4) {
                return new dlhg();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dlhl> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dlhl.class) {
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
}
