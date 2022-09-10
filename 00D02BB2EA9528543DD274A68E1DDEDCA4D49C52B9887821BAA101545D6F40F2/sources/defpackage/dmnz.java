package defpackage;
/* compiled from: PG */
/* renamed from: dmnz  reason: default package */
/* loaded from: classes6.dex */
public final class dmnz extends dsqw<dmnz, dmny> implements dssk {
    public static final dmnz d;
    private static volatile dssr<dmnz> g;
    public dmrb a;
    public int b;
    public int c;
    private int e;
    private byte f = 2;

    static {
        dmnz dmnzVar = new dmnz();
        d = dmnzVar;
        dsqw.cc(dmnz.class, dmnzVar);
    }

    private dmnz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ᐉ\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"e", "a", "b", "c"});
            }
            if (i2 == 3) {
                return new dmnz();
            }
            if (i2 == 4) {
                return new dmny();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.f = b;
                return null;
            }
            dssr<dmnz> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dmnz.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.f);
    }
}
