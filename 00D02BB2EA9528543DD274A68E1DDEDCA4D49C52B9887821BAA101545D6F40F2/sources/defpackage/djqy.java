package defpackage;
/* compiled from: PG */
/* renamed from: djqy  reason: default package */
/* loaded from: classes6.dex */
public final class djqy extends dsqw<djqy, djqx> implements dssk {
    public static final djqy b;
    private static volatile dssr<djqy> d;
    private byte c = 2;
    public dsrj<dopk> a = dssu.b;

    static {
        djqy djqyVar = new djqy();
        b = djqyVar;
        dsqw.cc(djqy.class, djqyVar);
    }

    private djqy() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b2 = 1;
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", dopk.class});
            }
            if (i2 == 3) {
                return new djqy();
            }
            if (i2 == 4) {
                return new djqx();
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
            dssr<djqy> dssrVar = d;
            if (dssrVar == null) {
                synchronized (djqy.class) {
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
