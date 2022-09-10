package defpackage;
/* compiled from: PG */
/* renamed from: dqlk  reason: default package */
/* loaded from: classes6.dex */
public final class dqlk extends dsqw<dqlk, dqlh> implements dssk {
    public static final dqlk d;
    private static volatile dssr<dqlk> e;
    public int a;
    public int b = 2;
    public int c;

    static {
        dqlk dqlkVar = new dqlk();
        d = dqlkVar;
        dsqw.cc(dqlk.class, dqlkVar);
    }

    private dqlk() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", dqli.a, "c", dqlj.a});
            }
            if (i2 == 3) {
                return new dqlk();
            }
            if (i2 == 4) {
                return new dqlh();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqlk> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dqlk.class) {
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
