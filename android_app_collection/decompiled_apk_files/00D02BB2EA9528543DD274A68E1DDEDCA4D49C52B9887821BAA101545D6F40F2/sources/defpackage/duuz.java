package defpackage;
/* compiled from: PG */
/* renamed from: duuz  reason: default package */
/* loaded from: classes6.dex */
public final class duuz extends dsqw<duuz, duuy> implements dssk {
    public static final duuz c;
    private static volatile dssr<duuz> e;
    public int a;
    public dijv b;
    private byte d = 2;

    static {
        duuz duuzVar = new duuz();
        c = duuzVar;
        dsqw.cc(duuz.class, duuzVar);
    }

    private duuz() {
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
                return new duuz();
            }
            if (i2 == 4) {
                return new duuy();
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
            dssr<duuz> dssrVar = e;
            if (dssrVar == null) {
                synchronized (duuz.class) {
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
