package defpackage;
/* compiled from: PG */
/* renamed from: dhuc  reason: default package */
/* loaded from: classes6.dex */
public final class dhuc extends dsqw<dhuc, dhub> implements dssk {
    public static final dhuc a;
    private static volatile dssr<dhuc> e;
    private int b;
    private dnqh c;
    private byte d = 2;

    static {
        dhuc dhucVar = new dhuc();
        a = dhucVar;
        dsqw.cc(dhuc.class, dhucVar);
    }

    private dhuc() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002ᐉ\u0001", new Object[]{"b", "c"});
            }
            if (i2 == 3) {
                return new dhuc();
            }
            if (i2 == 4) {
                return new dhub();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.d = b;
                return null;
            }
            dssr<dhuc> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dhuc.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.d);
    }
}