package defpackage;
/* compiled from: PG */
/* renamed from: dujs  reason: default package */
/* loaded from: classes6.dex */
public final class dujs extends dsqw<dujs, dujr> implements dssk {
    public static final dujs f;
    private static volatile dssr<dujs> g;
    public int a;
    public int b;
    public String c = "";
    public long d;
    public long e;

    static {
        dujs dujsVar = new dujs();
        f = dujsVar;
        dsqw.cc(dujs.class, dujsVar);
    }

    private dujs() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဂ\u0003", new Object[]{"a", "b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new dujs();
            }
            if (i2 == 4) {
                return new dujr();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dujs> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dujs.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
