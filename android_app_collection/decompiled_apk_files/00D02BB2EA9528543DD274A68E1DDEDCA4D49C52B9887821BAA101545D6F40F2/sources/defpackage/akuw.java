package defpackage;
/* compiled from: PG */
/* renamed from: akuw  reason: default package */
/* loaded from: classes.dex */
public final class akuw extends dsqw<akuw, akuv> implements dssk {
    public static final akuw b;
    private static volatile dssr<akuw> c;
    public dsrj<akuu> a = dssu.b;

    static {
        akuw akuwVar = new akuw();
        b = akuwVar;
        dsqw.cc(akuw.class, akuwVar);
    }

    private akuw() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", akuu.class});
            }
            if (i2 == 3) {
                return new akuw();
            }
            if (i2 == 4) {
                return new akuv();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<akuw> dssrVar = c;
            if (dssrVar == null) {
                synchronized (akuw.class) {
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
