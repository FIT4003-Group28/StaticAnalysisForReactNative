package defpackage;
/* compiled from: PG */
/* renamed from: dorz  reason: default package */
/* loaded from: classes6.dex */
public final class dorz extends dsqw<dorz, doru> implements dssk {
    public static final dorz f;
    private static volatile dssr<dorz> g;
    public int a;
    public int b;
    public dniu c;
    public dorw d;
    public int e;

    static {
        dorz dorzVar = new dorz();
        f = dorzVar;
        dsqw.cc(dorz.class, dorzVar);
    }

    private dorz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဌ\u0003", new Object[]{"a", "b", dory.c(), "c", "d", "e", dort.a});
            }
            if (i2 == 3) {
                return new dorz();
            }
            if (i2 == 4) {
                return new doru();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dorz> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dorz.class) {
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
