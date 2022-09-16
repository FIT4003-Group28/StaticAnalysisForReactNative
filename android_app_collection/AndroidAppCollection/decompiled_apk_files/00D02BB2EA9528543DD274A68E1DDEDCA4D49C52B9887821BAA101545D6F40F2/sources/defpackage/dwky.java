package defpackage;
/* compiled from: PG */
/* renamed from: dwky  reason: default package */
/* loaded from: classes6.dex */
public final class dwky extends dsqw<dwky, dwkx> implements dssk {
    public static final dwky c;
    private static volatile dssr<dwky> f;
    public dwmk a;
    public int b;
    private int d;
    private byte e = 2;

    static {
        dwky dwkyVar = new dwky();
        c = dwkyVar;
        dsqw.cc(dwky.class, dwkyVar);
    }

    private dwky() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0002င\u0001", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new dwky();
            }
            if (i2 == 4) {
                return new dwkx();
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
            dssr<dwky> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dwky.class) {
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
