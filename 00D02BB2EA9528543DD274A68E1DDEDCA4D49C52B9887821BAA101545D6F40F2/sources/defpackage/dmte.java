package defpackage;
/* compiled from: PG */
/* renamed from: dmte  reason: default package */
/* loaded from: classes.dex */
public final class dmte extends dsqw<dmte, dmtd> implements dssk {
    public static final dmte b;
    private static volatile dssr<dmte> d;
    private byte c = 2;
    public dsrj<dmtc> a = dssu.b;

    static {
        dmte dmteVar = new dmte();
        b = dmteVar;
        dsqw.cc(dmte.class, dmteVar);
    }

    private dmte() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b2 = 1;
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", dmtc.class});
            }
            if (i2 == 3) {
                return new dmte();
            }
            if (i2 == 4) {
                return new dmtd();
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
            dssr<dmte> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dmte.class) {
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
