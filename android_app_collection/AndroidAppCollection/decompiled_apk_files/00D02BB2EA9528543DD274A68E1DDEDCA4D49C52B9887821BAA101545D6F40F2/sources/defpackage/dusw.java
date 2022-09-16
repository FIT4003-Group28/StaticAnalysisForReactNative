package defpackage;
/* compiled from: PG */
/* renamed from: dusw  reason: default package */
/* loaded from: classes6.dex */
public final class dusw extends dsqw<dusw, dusv> implements dssk {
    public static final dusw c;
    private static volatile dssr<dusw> f;
    private int d;
    private byte e = 2;
    public int a = 1;
    public dsrj<dutk> b = dssu.b;

    static {
        dusw duswVar = new dusw();
        c = duswVar;
        dsqw.cc(dusw.class, duswVar);
    }

    private dusw() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001ဌ\u0000\u0002Л", new Object[]{"d", "a", dutr.a, "b", dutk.class});
            }
            if (i2 == 3) {
                return new dusw();
            }
            if (i2 == 4) {
                return new dusv();
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
            dssr<dusw> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dusw.class) {
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
