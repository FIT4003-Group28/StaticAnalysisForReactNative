package defpackage;
/* compiled from: PG */
/* renamed from: diav  reason: default package */
/* loaded from: classes6.dex */
public final class diav extends dsqw<diav, diau> implements dssk {
    public static final diav d;
    private static volatile dssr<diav> e;
    public int a;
    public boolean b;
    public boolean c;

    static {
        diav diavVar = new diav();
        d = diavVar;
        dsqw.cc(diav.class, diavVar);
    }

    private diav() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new diav();
            }
            if (i2 == 4) {
                return new diau();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<diav> dssrVar = e;
            if (dssrVar == null) {
                synchronized (diav.class) {
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
