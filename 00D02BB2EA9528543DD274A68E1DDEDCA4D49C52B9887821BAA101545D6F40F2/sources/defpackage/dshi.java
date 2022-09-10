package defpackage;
/* compiled from: PG */
/* renamed from: dshi  reason: default package */
/* loaded from: classes6.dex */
public final class dshi extends dsqw<dshi, dshg> implements dssk {
    public static final dshi e;
    private static volatile dssr<dshi> f;
    public int a;
    public Object c;
    public int b = 0;
    public String d = "";

    static {
        dshi dshiVar = new dshi();
        e = dshiVar;
        dsqw.cc(dshi.class, dshiVar);
    }

    private dshi() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ျ\u0000\u0003ျ\u0000", new Object[]{"c", "b", "a", "d"});
            }
            if (i2 == 3) {
                return new dshi();
            }
            if (i2 == 4) {
                return new dshg();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dshi> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dshi.class) {
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
