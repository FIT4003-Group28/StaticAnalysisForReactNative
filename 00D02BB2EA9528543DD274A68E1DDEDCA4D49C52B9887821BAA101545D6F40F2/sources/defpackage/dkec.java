package defpackage;
/* compiled from: PG */
/* renamed from: dkec  reason: default package */
/* loaded from: classes6.dex */
public final class dkec extends dsqw<dkec, dkeb> implements dssk {
    public static final dkec f;
    private static volatile dssr<dkec> g;
    public int a;
    public int b;
    public int c;
    public int d;
    public String e = "";

    static {
        dkec dkecVar = new dkec();
        f = dkecVar;
        dsqw.cc(dkec.class, dkecVar);
    }

    private dkec() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004ဈ\u0003", new Object[]{"a", "b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new dkec();
            }
            if (i2 == 4) {
                return new dkeb();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkec> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dkec.class) {
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