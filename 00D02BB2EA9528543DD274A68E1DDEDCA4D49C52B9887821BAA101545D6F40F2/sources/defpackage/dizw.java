package defpackage;
/* compiled from: PG */
/* renamed from: dizw  reason: default package */
/* loaded from: classes6.dex */
public final class dizw extends dsqw<dizw, dizv> implements dssk {
    public static final dizw c;
    private static volatile dssr<dizw> e;
    public int a;
    public dipo b;
    private byte d = 2;

    static {
        dizw dizwVar = new dizw();
        c = dizwVar;
        dsqw.cc(dizw.class, dizwVar);
    }

    private dizw() {
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
                return new dizw();
            }
            if (i2 == 4) {
                return new dizv();
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
            dssr<dizw> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dizw.class) {
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
