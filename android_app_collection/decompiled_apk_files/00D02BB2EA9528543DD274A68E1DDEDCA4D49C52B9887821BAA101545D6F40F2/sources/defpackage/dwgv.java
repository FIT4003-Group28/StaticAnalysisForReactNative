package defpackage;
/* compiled from: PG */
/* renamed from: dwgv  reason: default package */
/* loaded from: classes6.dex */
public final class dwgv extends dsqw<dwgv, dwgu> implements dssk {
    public static final dwgv c;
    private static volatile dssr<dwgv> e;
    public int a;
    public dnxn b;
    private byte d = 2;

    static {
        dwgv dwgvVar = new dwgv();
        c = dwgvVar;
        dsqw.cc(dwgv.class, dwgvVar);
    }

    private dwgv() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dwgv();
            }
            if (i2 == 4) {
                return new dwgu();
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
            dssr<dwgv> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dwgv.class) {
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
