package defpackage;
/* compiled from: PG */
/* renamed from: dvew  reason: default package */
/* loaded from: classes.dex */
public final class dvew extends dsqw<dvew, dver> implements dssk {
    public static final dvew b;
    private static volatile dssr<dvew> c;
    public dsrj<dvev> a = dssu.b;

    static {
        dvew dvewVar = new dvew();
        b = dvewVar;
        dsqw.cc(dvew.class, dvewVar);
    }

    private dvew() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", dvev.class});
            }
            if (i2 == 3) {
                return new dvew();
            }
            if (i2 == 4) {
                return new dver();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvew> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dvew.class) {
                    dssrVar = c;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        c = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
