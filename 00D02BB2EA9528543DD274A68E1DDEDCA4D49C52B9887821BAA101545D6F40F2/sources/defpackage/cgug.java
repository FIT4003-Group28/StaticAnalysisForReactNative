package defpackage;
/* compiled from: PG */
/* renamed from: cgug  reason: default package */
/* loaded from: classes4.dex */
public final class cgug extends dsqw<cgug, cgud> implements dssk {
    public static final cgug f;
    private static volatile dssr<cgug> g;
    public int a;
    public float b;
    public float c;
    public int d = 100;
    public int e;

    static {
        cgug cgugVar = new cgug();
        f = cgugVar;
        dsqw.cc(cgug.class, cgugVar);
    }

    private cgug() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003င\u0002\u0004ဌ\u0003", new Object[]{"a", "b", "c", "d", "e", cgue.a});
            }
            if (i2 == 3) {
                return new cgug();
            }
            if (i2 == 4) {
                return new cgud();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<cgug> dssrVar = g;
            if (dssrVar == null) {
                synchronized (cgug.class) {
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
