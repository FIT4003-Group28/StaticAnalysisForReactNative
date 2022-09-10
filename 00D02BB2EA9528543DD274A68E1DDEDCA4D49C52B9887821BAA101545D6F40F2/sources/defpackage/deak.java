package defpackage;
/* compiled from: PG */
/* renamed from: deak  reason: default package */
/* loaded from: classes6.dex */
public final class deak extends dsqw<deak, deaj> implements dssk {
    public static final deak d;
    private static volatile dssr<deak> e;
    public int a;
    public int b;
    public int c;

    static {
        deak deakVar = new deak();
        d = deakVar;
        dsqw.cc(deak.class, deakVar);
    }

    private deak() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", dpkp.c(), "c", dpkn.c()});
            }
            if (i2 == 3) {
                return new deak();
            }
            if (i2 == 4) {
                return new deaj();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<deak> dssrVar = e;
            if (dssrVar == null) {
                synchronized (deak.class) {
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
