package defpackage;
/* compiled from: PG */
/* renamed from: dhrc  reason: default package */
/* loaded from: classes6.dex */
public final class dhrc extends dsqw<dhrc, dhrb> implements dssk {
    public static final dhrc b;
    private static volatile dssr<dhrc> d;
    private byte c = 2;
    public dsrj<draf> a = dssu.b;

    static {
        dhrc dhrcVar = new dhrc();
        b = dhrcVar;
        dsqw.cc(dhrc.class, dhrcVar);
    }

    private dhrc() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b2 = 1;
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", draf.class});
            }
            if (i2 == 3) {
                return new dhrc();
            }
            if (i2 == 4) {
                return new dhrb();
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
            dssr<dhrc> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dhrc.class) {
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
