package defpackage;
/* compiled from: PG */
/* renamed from: dkas  reason: default package */
/* loaded from: classes6.dex */
public final class dkas extends dsqw<dkas, dkar> implements dssk {
    public static final dkas c;
    private static volatile dssr<dkas> e;
    public int a;
    public dpql b;
    private int d;

    static {
        dkas dkasVar = new dkas();
        c = dkasVar;
        dsqw.cc(dkas.class, dkasVar);
    }

    private dkas() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0003ဉ\u0001", new Object[]{"d", "a", dpqw.c(), "b"});
            }
            if (i2 == 3) {
                return new dkas();
            }
            if (i2 == 4) {
                return new dkar();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkas> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dkas.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
