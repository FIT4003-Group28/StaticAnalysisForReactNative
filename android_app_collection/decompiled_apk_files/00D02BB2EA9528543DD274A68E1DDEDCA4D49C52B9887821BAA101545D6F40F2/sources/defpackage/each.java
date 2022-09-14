package defpackage;
/* compiled from: PG */
/* renamed from: each  reason: default package */
/* loaded from: classes6.dex */
public final class each extends dsqw<each, eacg> implements dssk {
    public static final each d;
    private static volatile dssr<each> e;
    public int a;
    public int b;
    public int c;

    static {
        each eachVar = new each();
        d = eachVar;
        dsqw.cc(each.class, eachVar);
    }

    private each() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဋ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new each();
            }
            if (i2 == 4) {
                return new eacg();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<each> dssrVar = e;
            if (dssrVar == null) {
                synchronized (each.class) {
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
