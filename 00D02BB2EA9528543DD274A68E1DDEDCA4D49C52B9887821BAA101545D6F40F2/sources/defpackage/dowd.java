package defpackage;
/* compiled from: PG */
/* renamed from: dowd  reason: default package */
/* loaded from: classes6.dex */
public final class dowd extends dsqw<dowd, dowc> implements dssk {
    public static final dowd f;
    private static volatile dssr<dowd> g;
    public int a;
    public String b = "";
    public dnoh c;
    public int d;
    public int e;

    static {
        dowd dowdVar = new dowd();
        f = dowdVar;
        dsqw.cc(dowd.class, dowdVar);
    }

    private dowd() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ဉ\u0001\u0003င\u0003\u0004င\u0004\u0005ဈ\u0000", new Object[]{"a", "c", "d", "e", "b"});
            }
            if (i2 == 3) {
                return new dowd();
            }
            if (i2 == 4) {
                return new dowc();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dowd> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dowd.class) {
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
