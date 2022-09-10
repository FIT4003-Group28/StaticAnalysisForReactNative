package defpackage;
/* compiled from: PG */
/* renamed from: dlbq  reason: default package */
/* loaded from: classes6.dex */
public final class dlbq extends dsqw<dlbq, dlbp> implements dssk {
    public static final dlbq f;
    private static volatile dssr<dlbq> h;
    public int a;
    public dpuq b;
    public boolean c;
    public int d;
    public dnqh e;
    private byte g = 2;

    static {
        dlbq dlbqVar = new dlbq();
        f = dlbqVar;
        dsqw.cc(dlbq.class, dlbqVar);
    }

    private dlbq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0001\u0001ဉ\u0000\u0002ᐉ\u0003\u0004ဇ\u0001\u0005ဌ\u0002", new Object[]{"a", "b", "e", "c", "d", dkzq.c()});
            }
            if (i2 == 3) {
                return new dlbq();
            }
            if (i2 == 4) {
                return new dlbp();
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
            dssr<dlbq> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dlbq.class) {
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
