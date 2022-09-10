package defpackage;
/* compiled from: PG */
/* renamed from: dkbg  reason: default package */
/* loaded from: classes6.dex */
public final class dkbg extends dsqw<dkbg, dkbf> implements dssk {
    public static final dkbg b;
    private static volatile dssr<dkbg> e;
    public int a;
    private dnqh c;
    private byte d = 2;

    static {
        dkbg dkbgVar = new dkbg();
        b = dkbgVar;
        dsqw.cc(dkbg.class, dkbgVar);
    }

    private dkbg() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b2 = 1;
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0001\u0004ᐉ\u0003", new Object[]{"a", "c"});
            }
            if (i2 == 3) {
                return new dkbg();
            }
            if (i2 == 4) {
                return new dkbf();
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
            dssr<dkbg> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dkbg.class) {
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
