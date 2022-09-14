package defpackage;
/* compiled from: PG */
/* renamed from: dmpj  reason: default package */
/* loaded from: classes6.dex */
public final class dmpj extends dsqw<dmpj, dmpi> implements dssk {
    public static final dmpj c;
    private static volatile dssr<dmpj> e;
    public int a = 9;
    public int b = 2;
    private int d;

    static {
        dmpj dmpjVar = new dmpj();
        c = dmpjVar;
        dsqw.cc(dmpj.class, dmpjVar);
    }

    private dmpj() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"d", "a", dmpm.c(), "b", dmpf.a});
            }
            if (i2 == 3) {
                return new dmpj();
            }
            if (i2 == 4) {
                return new dmpi();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dmpj> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dmpj.class) {
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
