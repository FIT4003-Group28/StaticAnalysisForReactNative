package defpackage;
/* compiled from: PG */
/* renamed from: dsfv  reason: default package */
/* loaded from: classes6.dex */
public final class dsfv extends dsqw<dsfv, dsfu> implements dssk {
    public static final dsfv b;
    private static volatile dssr<dsfv> d;
    public dsfk a;
    private int c;

    static {
        dsfv dsfvVar = new dsfv();
        b = dsfvVar;
        dsqw.cc(dsfv.class, dsfvVar);
    }

    private dsfv() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dsfv();
            }
            if (i2 == 4) {
                return new dsfu();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dsfv> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dsfv.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
