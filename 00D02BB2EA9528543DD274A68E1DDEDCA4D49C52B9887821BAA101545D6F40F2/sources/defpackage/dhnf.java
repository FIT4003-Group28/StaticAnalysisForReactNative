package defpackage;
/* compiled from: PG */
/* renamed from: dhnf  reason: default package */
/* loaded from: classes6.dex */
public final class dhnf extends dsqw<dhnf, dhne> implements dssk {
    public static final dhnf c;
    private static volatile dssr<dhnf> f;
    public int a;
    private dnqh d;
    private byte e = 2;
    public String b = "";

    static {
        dhnf dhnfVar = new dhnf();
        c = dhnfVar;
        dsqw.cc(dhnf.class, dhnfVar);
    }

    private dhnf() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဈ\u0001", new Object[]{"a", "d", "b"});
            }
            if (i2 == 3) {
                return new dhnf();
            }
            if (i2 == 4) {
                return new dhne();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.e = b;
                return null;
            }
            dssr<dhnf> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dhnf.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.e);
    }
}
