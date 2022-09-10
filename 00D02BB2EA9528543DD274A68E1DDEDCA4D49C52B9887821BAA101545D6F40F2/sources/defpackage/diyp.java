package defpackage;
/* compiled from: PG */
/* renamed from: diyp  reason: default package */
/* loaded from: classes6.dex */
public final class diyp extends dsqw<diyp, diyo> implements dssk {
    public static final diyp a;
    private static volatile dssr<diyp> e;
    private int b;
    private docg c;
    private byte d = 2;

    static {
        diyp diypVar = new diyp();
        a = diypVar;
        dsqw.cc(diyp.class, diypVar);
    }

    private diyp() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002ᐉ\u0001", new Object[]{"b", "c"});
            }
            if (i2 == 3) {
                return new diyp();
            }
            if (i2 == 4) {
                return new diyo();
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
            dssr<diyp> dssrVar = e;
            if (dssrVar == null) {
                synchronized (diyp.class) {
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
