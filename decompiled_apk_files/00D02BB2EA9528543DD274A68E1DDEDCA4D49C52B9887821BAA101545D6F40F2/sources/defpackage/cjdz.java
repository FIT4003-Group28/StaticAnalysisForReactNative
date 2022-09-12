package defpackage;
/* compiled from: PG */
/* renamed from: cjdz  reason: default package */
/* loaded from: classes4.dex */
public final class cjdz extends dsqw<cjdz, cjdy> implements dssk {
    public static final cjdz d;
    private static volatile dssr<cjdz> e;
    public int a;
    public boolean b = true;
    public int c;

    static {
        cjdz cjdzVar = new cjdz();
        d = cjdzVar;
        dsqw.cc(cjdz.class, cjdzVar);
    }

    private cjdz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", "c", cjdx.c()});
            }
            if (i2 == 3) {
                return new cjdz();
            }
            if (i2 == 4) {
                return new cjdy();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<cjdz> dssrVar = e;
            if (dssrVar == null) {
                synchronized (cjdz.class) {
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
