package defpackage;
/* compiled from: PG */
/* renamed from: dwzm  reason: default package */
/* loaded from: classes6.dex */
public final class dwzm extends dsqw<dwzm, dwzk> implements dssk {
    public static final dwzm a;
    private static volatile dssr<dwzm> h;
    private int b;
    private dwzq d;
    private dwzs e;
    private dwzj f;
    private byte g = 2;
    private int c = 1;

    static {
        dwzm dwzmVar = new dwzm();
        a = dwzmVar;
        dsqw.cc(dwzm.class, dwzmVar);
    }

    private dwzm() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(a, "\u0001\u0004\u0000\u0001\u0001\u000e\u0004\u0000\u0000\u0004\u0001ᔌ\u0000\u0002ᐉ\u0001\rᐉ\u0004\u000eᐉ\u0005", new Object[]{"b", "c", dwzl.a, "d", "e", "f"});
            }
            if (i2 == 3) {
                return new dwzm();
            }
            if (i2 == 4) {
                return new dwzk();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.g = b;
                return null;
            }
            dssr<dwzm> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dwzm.class) {
                    dssrVar = h;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        h = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.g);
    }
}
