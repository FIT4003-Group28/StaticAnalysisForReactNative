package defpackage;
/* compiled from: PG */
/* renamed from: dryr  reason: default package */
/* loaded from: classes6.dex */
public final class dryr extends dsqw<dryr, dryq> implements dssk {
    public static final dryr e;
    private static volatile dssr<dryr> f;
    public int a;
    public String b = "";
    public dsrj<String> c = dssu.b;
    public dsrj<dsay> d = dssu.b;

    static {
        dryr dryrVar = new dryr();
        e = dryrVar;
        dsqw.cc(dryr.class, dryrVar);
    }

    private dryr() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001ဈ\u0000\u0002\u001a\u0003\u001b", new Object[]{"a", "b", "c", "d", dsay.class});
            }
            if (i2 == 3) {
                return new dryr();
            }
            if (i2 == 4) {
                return new dryq();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dryr> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dryr.class) {
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
