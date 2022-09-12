package defpackage;
/* compiled from: PG */
/* renamed from: digi  reason: default package */
/* loaded from: classes6.dex */
public final class digi extends dsqw<digi, digf> implements dssk {
    public static final digi b;
    private static volatile dssr<digi> d;
    public digh a;
    private int c;

    static {
        digi digiVar = new digi();
        b = digiVar;
        dsqw.cc(digi.class, digiVar);
    }

    private digi() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0001", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new digi();
            }
            if (i2 == 4) {
                return new digf();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<digi> dssrVar = d;
            if (dssrVar == null) {
                synchronized (digi.class) {
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
