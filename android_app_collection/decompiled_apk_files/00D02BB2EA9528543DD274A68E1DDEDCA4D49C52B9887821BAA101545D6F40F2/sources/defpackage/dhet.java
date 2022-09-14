package defpackage;
/* compiled from: PG */
/* renamed from: dhet  reason: default package */
/* loaded from: classes6.dex */
public final class dhet extends dsqw<dhet, dhes> implements dssk {
    public static final dhet d;
    private static volatile dssr<dhet> e;
    public dsrj<dhfk> a = dssu.b;
    public int b;
    public dudy c;

    static {
        dhet dhetVar = new dhet();
        d = dhetVar;
        dsqw.cc(dhet.class, dhetVar);
    }

    private dhet() {
        dsqz dsqzVar = dsqz.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0000\u0003\u0000\u0000\u0001\u0007\u0003\u0000\u0001\u0000\u0001\u001b\u0004\u0004\u0007\t", new Object[]{"a", dhfk.class, "b", "c"});
            }
            if (i2 == 3) {
                return new dhet();
            }
            if (i2 == 4) {
                return new dhes();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dhet> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dhet.class) {
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
