package defpackage;
/* compiled from: PG */
/* renamed from: dong  reason: default package */
/* loaded from: classes6.dex */
public final class dong extends dsqw<dong, domr> implements dssk {
    public static final dong d;
    private static volatile dssr<dong> e;
    public int a;
    public boolean b;
    public donf c;

    static {
        dong dongVar = new dong();
        d = dongVar;
        dsqw.cc(dong.class, dongVar);
    }

    private dong() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dong();
            }
            if (i2 == 4) {
                return new domr();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dong> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dong.class) {
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
