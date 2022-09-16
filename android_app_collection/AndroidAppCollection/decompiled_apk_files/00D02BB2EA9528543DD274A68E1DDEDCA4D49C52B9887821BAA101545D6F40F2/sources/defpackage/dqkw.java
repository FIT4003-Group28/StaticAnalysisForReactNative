package defpackage;
/* compiled from: PG */
/* renamed from: dqkw  reason: default package */
/* loaded from: classes6.dex */
public final class dqkw extends dsqw<dqkw, dqkt> implements dssk {
    public static final dqkw d;
    private static volatile dssr<dqkw> e;
    public int a;
    public int b;
    public int c;

    static {
        dqkw dqkwVar = new dqkw();
        d = dqkwVar;
        dsqw.cc(dqkw.class, dqkwVar);
    }

    private dqkw() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", dqku.a, "c", dqkv.a});
            }
            if (i2 == 3) {
                return new dqkw();
            }
            if (i2 == 4) {
                return new dqkt();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqkw> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dqkw.class) {
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
