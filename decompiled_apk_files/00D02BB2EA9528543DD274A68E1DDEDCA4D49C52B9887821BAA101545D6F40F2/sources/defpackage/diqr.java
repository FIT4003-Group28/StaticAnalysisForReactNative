package defpackage;
/* compiled from: PG */
/* renamed from: diqr  reason: default package */
/* loaded from: classes6.dex */
public final class diqr extends dsqw<diqr, diqq> implements dssk {
    public static final diqr a;
    private static volatile dssr<diqr> e;
    private int b;
    private dnqh c;
    private byte d = 2;

    static {
        diqr diqrVar = new diqr();
        a = diqrVar;
        dsqw.cc(diqr.class, diqrVar);
    }

    private diqr() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002ᐉ\u0000", new Object[]{"b", "c"});
            }
            if (i2 == 3) {
                return new diqr();
            }
            if (i2 == 4) {
                return new diqq();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.d = b;
                return null;
            }
            dssr<diqr> dssrVar = e;
            if (dssrVar == null) {
                synchronized (diqr.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.d);
    }
}
