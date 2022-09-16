package defpackage;
/* compiled from: PG */
/* renamed from: dnie  reason: default package */
/* loaded from: classes.dex */
public final class dnie extends dsqw<dnie, dnid> implements dssk {
    public static final dnie d;
    private static volatile dssr<dnie> e;
    public int a;
    public doft b;
    public doft c;

    static {
        dnie dnieVar = new dnie();
        d = dnieVar;
        dsqw.cc(dnie.class, dnieVar);
    }

    private dnie() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dnie();
            }
            if (i2 == 4) {
                return new dnid();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnie> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dnie.class) {
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
