package defpackage;
/* compiled from: PG */
/* renamed from: dwod  reason: default package */
/* loaded from: classes6.dex */
public final class dwod extends dsqw<dwod, dwoc> implements dssk {
    public static final dwod a;
    private static volatile dssr<dwod> e;
    private int b;
    private dnqh c;
    private byte d = 2;

    static {
        dwod dwodVar = new dwod();
        a = dwodVar;
        dsqw.cc(dwod.class, dwodVar);
    }

    private dwod() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(a, "\u0001\u0001\u0000\u0001\u0005\u0005\u0001\u0000\u0000\u0001\u0005ᐉ\u0002", new Object[]{"b", "c"});
            }
            if (i2 == 3) {
                return new dwod();
            }
            if (i2 == 4) {
                return new dwoc();
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
            dssr<dwod> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dwod.class) {
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
