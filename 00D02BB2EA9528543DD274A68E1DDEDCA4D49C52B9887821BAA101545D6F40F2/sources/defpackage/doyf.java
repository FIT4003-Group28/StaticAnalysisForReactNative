package defpackage;
/* compiled from: PG */
/* renamed from: doyf  reason: default package */
/* loaded from: classes6.dex */
public final class doyf extends dsqw<doyf, doye> implements dssk {
    public static final doyf c;
    private static volatile dssr<doyf> e;
    public int a;
    public doyb b;
    private byte d = 2;

    static {
        doyf doyfVar = new doyf();
        c = doyfVar;
        dsqw.cc(doyf.class, doyfVar);
    }

    private doyf() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0004", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new doyf();
            }
            if (i2 == 4) {
                return new doye();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.d = b;
                return null;
            }
            dssr<doyf> dssrVar = e;
            if (dssrVar == null) {
                synchronized (doyf.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.d);
    }
}
