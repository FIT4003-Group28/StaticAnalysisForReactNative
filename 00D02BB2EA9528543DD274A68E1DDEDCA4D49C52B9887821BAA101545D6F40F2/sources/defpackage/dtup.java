package defpackage;
/* compiled from: PG */
/* renamed from: dtup  reason: default package */
/* loaded from: classes6.dex */
public final class dtup extends dsqw<dtup, dtul> implements dssk {
    public static final dtup f;
    private static volatile dssr<dtup> g;
    public int a;
    public int b;
    public dsrf c = dsqz.b;
    public int d;
    public int e;

    static {
        dtup dtupVar = new dtup();
        f = dtupVar;
        dsqw.cc(dtup.class, dtupVar);
    }

    private dtup() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001င\u0000\u0002,\u0003ဌ\u0001\u0004ဌ\u0002", new Object[]{"a", "b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new dtup();
            }
            if (i2 == 4) {
                return new dtul();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dtup> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dtup.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
