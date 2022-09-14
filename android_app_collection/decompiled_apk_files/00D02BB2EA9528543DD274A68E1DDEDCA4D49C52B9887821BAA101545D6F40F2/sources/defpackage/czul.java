package defpackage;
/* compiled from: PG */
/* renamed from: czul  reason: default package */
/* loaded from: classes5.dex */
public final class czul extends dsqw<czul, czuk> implements dssk {
    public static final czul c;
    private static volatile dssr<czul> d;
    public dsrj<String> a = dssu.b;
    public dsrf b = dsqz.b;

    static {
        czul czulVar = new czul();
        c = czulVar;
        dsqw.cc(czul.class, czulVar);
    }

    private czul() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001a\u0002\u0016", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new czul();
            }
            if (i2 == 4) {
                return new czuk();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<czul> dssrVar = d;
            if (dssrVar == null) {
                synchronized (czul.class) {
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
