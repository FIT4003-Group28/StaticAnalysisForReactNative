package defpackage;
/* compiled from: PG */
/* renamed from: dvyr  reason: default package */
/* loaded from: classes6.dex */
public final class dvyr extends dsqw<dvyr, dvyq> implements dssk {
    public static final dvyr e;
    private static volatile dssr<dvyr> f;
    public int a;
    public int b;
    public float c;
    public dsrj<String> d = dssu.b;

    static {
        dvyr dvyrVar = new dvyr();
        e = dvyrVar;
        dsqw.cc(dvyr.class, dvyrVar);
    }

    private dvyr() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဌ\u0000\u0002ခ\u0001\u0003\u001a", new Object[]{"a", "b", dvys.a, "c", "d"});
            }
            if (i2 == 3) {
                return new dvyr();
            }
            if (i2 == 4) {
                return new dvyq();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvyr> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dvyr.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
