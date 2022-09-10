package defpackage;
/* compiled from: PG */
/* renamed from: absc  reason: default package */
/* loaded from: classes2.dex */
public final class absc extends dsqw<absc, absa> implements dssk {
    public static final absc b;
    private static volatile dssr<absc> c;
    public dssd<String, abrz> a = dssd.b;

    static {
        absc abscVar = new absc();
        b = abscVar;
        dsqw.cc(absc.class, abscVar);
    }

    private absc() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"a", absb.a});
            }
            if (i2 == 3) {
                return new absc();
            }
            if (i2 == 4) {
                return new absa();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<absc> dssrVar = c;
            if (dssrVar == null) {
                synchronized (absc.class) {
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
