package defpackage;
/* compiled from: PG */
/* renamed from: dmgf  reason: default package */
/* loaded from: classes6.dex */
public final class dmgf extends dsqw<dmgf, dmge> implements dssk {
    public static final dmgf b;
    private static volatile dssr<dmgf> d;
    public boolean a;
    private int c;

    static {
        dmgf dmgfVar = new dmgf();
        b = dmgfVar;
        dsqw.cc(dmgf.class, dmgfVar);
    }

    private dmgf() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဇ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dmgf();
            }
            if (i2 == 4) {
                return new dmge();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dmgf> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dmgf.class) {
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
