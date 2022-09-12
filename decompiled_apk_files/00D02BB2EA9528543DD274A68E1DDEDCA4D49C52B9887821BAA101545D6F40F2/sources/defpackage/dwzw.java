package defpackage;
/* compiled from: PG */
/* renamed from: dwzw  reason: default package */
/* loaded from: classes6.dex */
public final class dwzw extends dsqw<dwzw, dwzv> implements dssk {
    public static final dwzw c;
    private static volatile dssr<dwzw> e;
    public int a;
    public dwzq b;
    private byte d = 2;

    static {
        dwzw dwzwVar = new dwzw();
        c = dwzwVar;
        dsqw.cc(dwzw.class, dwzwVar);
    }

    private dwzw() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002ᔉ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dwzw();
            }
            if (i2 == 4) {
                return new dwzv();
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
            dssr<dwzw> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dwzw.class) {
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
