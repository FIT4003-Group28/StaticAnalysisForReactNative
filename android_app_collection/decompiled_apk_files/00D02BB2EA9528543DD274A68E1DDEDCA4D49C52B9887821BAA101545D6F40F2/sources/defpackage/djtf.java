package defpackage;
/* compiled from: PG */
/* renamed from: djtf  reason: default package */
/* loaded from: classes6.dex */
public final class djtf extends dsqw<djtf, djte> implements dssk {
    public static final djtf d;
    private static volatile dssr<djtf> e;
    public int a;
    public String b = "";
    public int c;

    static {
        djtf djtfVar = new djtf();
        d = djtfVar;
        dsqw.cc(djtf.class, djtfVar);
    }

    private djtf() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", "c", djta.a});
            }
            if (i2 == 3) {
                return new djtf();
            }
            if (i2 == 4) {
                return new djte();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djtf> dssrVar = e;
            if (dssrVar == null) {
                synchronized (djtf.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
