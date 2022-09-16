package defpackage;
/* compiled from: PG */
/* renamed from: akuu  reason: default package */
/* loaded from: classes.dex */
public final class akuu extends dsqw<akuu, akut> implements dssk {
    public static final akuu d;
    private static volatile dssr<akuu> e;
    public int a;
    public int b = 9;
    public int c = 2;

    static {
        akuu akuuVar = new akuu();
        d = akuuVar;
        dsqw.cc(akuu.class, akuuVar);
    }

    private akuu() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", dmpm.c(), "c", dmpf.a});
            }
            if (i2 == 3) {
                return new akuu();
            }
            if (i2 == 4) {
                return new akut();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<akuu> dssrVar = e;
            if (dssrVar == null) {
                synchronized (akuu.class) {
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
