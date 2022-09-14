package defpackage;
/* compiled from: PG */
/* renamed from: dloj  reason: default package */
/* loaded from: classes6.dex */
public final class dloj extends dsqw<dloj, dloh> implements dssk {
    public static final dloj f;
    private static volatile dssr<dloj> h;
    public int a;
    public dltc b;
    public dvfo c;
    public int d;
    public int e;
    private byte g = 2;

    static {
        dloj dlojVar = new dloj();
        f = dlojVar;
        dsqw.cc(dloj.class, dlojVar);
    }

    private dloj() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ဌ\u0002\u0004ဌ\u0003", new Object[]{"a", "b", "c", "d", dloi.a, "e", ddpc.a});
            }
            if (i2 == 3) {
                return new dloj();
            }
            if (i2 == 4) {
                return new dloh();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.g = b;
                return null;
            }
            dssr<dloj> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dloj.class) {
                    dssrVar = h;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        h = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.g);
    }
}
