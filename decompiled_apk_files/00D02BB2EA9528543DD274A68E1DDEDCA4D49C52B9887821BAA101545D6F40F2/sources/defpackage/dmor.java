package defpackage;
/* compiled from: PG */
/* renamed from: dmor  reason: default package */
/* loaded from: classes.dex */
public final class dmor extends dsqw<dmor, dmoq> implements dssk {
    public static final dmor c;
    private static volatile dssr<dmor> d;
    public int a;
    public int b;

    static {
        dmor dmorVar = new dmor();
        c = dmorVar;
        dsqw.cc(dmor.class, dmorVar);
    }

    private dmor() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dmor();
            }
            if (i2 == 4) {
                return new dmoq();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dmor> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dmor.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
