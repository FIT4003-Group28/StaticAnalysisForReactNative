package defpackage;
/* compiled from: PG */
/* renamed from: cpzf  reason: default package */
/* loaded from: classes5.dex */
public final class cpzf extends dsqs<cpzf, cpzc> implements dsqt {
    public static final cpzf b;
    private static volatile dssr<cpzf> e;
    public int a;
    private int c;
    private byte d = 2;

    static {
        cpzf cpzfVar = new cpzf();
        b = cpzfVar;
        dsqw.cc(cpzf.class, cpzfVar);
    }

    private cpzf() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b2 = 1;
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"c", "a", cpzd.a});
            }
            if (i2 == 3) {
                return new cpzf();
            }
            if (i2 == 4) {
                return new cpzc();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b2 = 0;
                }
                this.d = b2;
                return null;
            }
            dssr<cpzf> dssrVar = e;
            if (dssrVar == null) {
                synchronized (cpzf.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.d);
    }
}
