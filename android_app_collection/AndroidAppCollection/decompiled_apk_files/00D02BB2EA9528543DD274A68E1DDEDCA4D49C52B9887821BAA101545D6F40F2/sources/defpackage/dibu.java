package defpackage;
/* compiled from: PG */
/* renamed from: dibu  reason: default package */
/* loaded from: classes6.dex */
public final class dibu extends dsqw<dibu, dibt> implements dssk {
    public static final dibu b;
    private static volatile dssr<dibu> d;
    private byte c = 2;
    public dsrj<dvyw> a = dssu.b;

    static {
        dibu dibuVar = new dibu();
        b = dibuVar;
        dsqw.cc(dibu.class, dibuVar);
    }

    private dibu() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b2 = 1;
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", dvyw.class});
            }
            if (i2 == 3) {
                return new dibu();
            }
            if (i2 == 4) {
                return new dibt();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b2 = 0;
                }
                this.c = b2;
                return null;
            }
            dssr<dibu> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dibu.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.c);
    }
}
