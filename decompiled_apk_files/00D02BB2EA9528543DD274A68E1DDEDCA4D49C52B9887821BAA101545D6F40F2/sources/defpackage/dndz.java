package defpackage;
/* compiled from: PG */
/* renamed from: dndz  reason: default package */
/* loaded from: classes.dex */
public final class dndz extends dsqw<dndz, dndy> implements dssk {
    public static final dndz e;
    private static volatile dssr<dndz> f;
    public int a;
    public int b;
    public dneb c;
    public int d;

    static {
        dndz dndzVar = new dndz();
        e = dndzVar;
        dsqw.cc(dndz.class, dndzVar);
    }

    private dndz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0000\u0000\u0002င\u0000\u0003ဉ\u0001\u0004ဌ\u0002", new Object[]{"a", "b", "c", "d", dndw.a});
            }
            if (i2 == 3) {
                return new dndz();
            }
            if (i2 == 4) {
                return new dndy();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dndz> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dndz.class) {
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
