package defpackage;
/* compiled from: PG */
/* renamed from: chik  reason: default package */
/* loaded from: classes4.dex */
public final class chik extends dsqw<chik, chij> implements dssk {
    public static final chik c;
    private static volatile dssr<chik> e;
    public Object b;
    public int a = 0;
    private byte d = 2;

    static {
        chik chikVar = new chik();
        c = chikVar;
        dsqw.cc(chik.class, chikVar);
    }

    private chik() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(c, "\u0001\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0001\u0001ြ\u0000\u0002ᐼ\u0000\u0003ြ\u0000", new Object[]{"b", "a", chhy.class, chig.class, chii.class});
            }
            if (i2 == 3) {
                return new chik();
            }
            if (i2 == 4) {
                return new chij();
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
            dssr<chik> dssrVar = e;
            if (dssrVar == null) {
                synchronized (chik.class) {
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
