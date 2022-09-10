package defpackage;
/* compiled from: PG */
/* renamed from: dter  reason: default package */
/* loaded from: classes6.dex */
public final class dter extends dsqw<dter, dteq> implements dssk {
    public static final dter a;
    private static volatile dssr<dter> e;
    private int b;
    private dtdh c;
    private byte d = 2;

    static {
        dter dterVar = new dter();
        a = dterVar;
        dsqw.cc(dter.class, dterVar);
    }

    private dter() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"b", "c"});
            }
            if (i2 == 3) {
                return new dter();
            }
            if (i2 == 4) {
                return new dteq();
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
            dssr<dter> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dter.class) {
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
