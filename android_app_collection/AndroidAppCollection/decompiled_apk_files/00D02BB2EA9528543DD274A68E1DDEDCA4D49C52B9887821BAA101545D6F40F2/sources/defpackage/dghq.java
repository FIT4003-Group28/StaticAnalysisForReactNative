package defpackage;
/* compiled from: PG */
/* renamed from: dghq  reason: default package */
/* loaded from: classes6.dex */
public final class dghq extends dsqw<dghq, dghp> implements dssk {
    public static final dghq b;
    private static volatile dssr<dghq> d;
    private byte c = 2;
    public dsrj<dgii> a = dssu.b;

    static {
        dghq dghqVar = new dghq();
        b = dghqVar;
        dsqw.cc(dghq.class, dghqVar);
    }

    private dghq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b2 = 1;
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", dgii.class});
            }
            if (i2 == 3) {
                return new dghq();
            }
            if (i2 == 4) {
                return new dghp();
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
            dssr<dghq> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dghq.class) {
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
