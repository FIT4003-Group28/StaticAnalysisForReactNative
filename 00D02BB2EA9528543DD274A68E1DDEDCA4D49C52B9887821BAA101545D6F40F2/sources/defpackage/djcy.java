package defpackage;
/* compiled from: PG */
/* renamed from: djcy  reason: default package */
/* loaded from: classes6.dex */
public final class djcy extends dsqw<djcy, djcx> implements dssk {
    public static final djcy b;
    private static volatile dssr<djcy> d;
    private byte c = 2;
    public dsrj<djcw> a = dssu.b;

    static {
        djcy djcyVar = new djcy();
        b = djcyVar;
        dsqw.cc(djcy.class, djcyVar);
    }

    private djcy() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b2 = 1;
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0001\u0002Л", new Object[]{"a", djcw.class});
            }
            if (i2 == 3) {
                return new djcy();
            }
            if (i2 == 4) {
                return new djcx();
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
            dssr<djcy> dssrVar = d;
            if (dssrVar == null) {
                synchronized (djcy.class) {
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
