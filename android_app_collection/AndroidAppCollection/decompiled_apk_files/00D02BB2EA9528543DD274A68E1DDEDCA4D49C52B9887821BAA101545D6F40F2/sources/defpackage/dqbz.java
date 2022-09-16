package defpackage;
/* compiled from: PG */
/* renamed from: dqbz  reason: default package */
/* loaded from: classes6.dex */
public final class dqbz extends dsqw<dqbz, dqby> implements dssk {
    public static final dqbz b;
    private static volatile dssr<dqbz> d;
    public String a = "";
    private int c;

    static {
        dqbz dqbzVar = new dqbz();
        b = dqbzVar;
        dsqw.cc(dqbz.class, dqbzVar);
    }

    private dqbz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003ဈ\u0002", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dqbz();
            }
            if (i2 == 4) {
                return new dqby();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqbz> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dqbz.class) {
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
