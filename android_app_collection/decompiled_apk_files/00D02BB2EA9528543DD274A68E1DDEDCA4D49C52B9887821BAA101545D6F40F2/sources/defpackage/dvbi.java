package defpackage;
/* compiled from: PG */
/* renamed from: dvbi  reason: default package */
/* loaded from: classes6.dex */
public final class dvbi extends dsqw<dvbi, dvbh> implements dssk {
    public static final dvbi f;
    private static volatile dssr<dvbi> g;
    public int a;
    public int b = 0;
    public Object c;
    public dnic d;
    public int e;

    static {
        dvbi dvbiVar = new dvbi();
        f = dvbiVar;
        dsqw.cc(dvbi.class, dvbiVar);
    }

    private dvbi() {
        dsqz dsqzVar = dsqz.b;
        this.e = 10;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0001\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ြ\u0000\u0003ြ\u0000\u0005င\u0003", new Object[]{"c", "b", "a", "d", dvbg.class, dpum.class, "e"});
            }
            if (i2 == 3) {
                return new dvbi();
            }
            if (i2 == 4) {
                return new dvbh();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvbi> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dvbi.class) {
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
