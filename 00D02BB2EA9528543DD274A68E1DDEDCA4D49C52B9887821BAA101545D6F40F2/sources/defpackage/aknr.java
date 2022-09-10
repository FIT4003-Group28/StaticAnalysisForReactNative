package defpackage;
/* compiled from: PG */
/* renamed from: aknr  reason: default package */
/* loaded from: classes.dex */
public final class aknr extends dsqw<aknr, akno> implements dssk {
    public static final aknr b;
    private static volatile dssr<aknr> d;
    private byte c = 2;
    public dsrj<aknq> a = dssu.b;

    static {
        aknr aknrVar = new aknr();
        b = aknrVar;
        dsqw.cc(aknr.class, aknrVar);
    }

    private aknr() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b2 = 1;
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0001\u0002Л", new Object[]{"a", aknq.class});
            }
            if (i2 == 3) {
                return new aknr();
            }
            if (i2 == 4) {
                return new akno();
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
            dssr<aknr> dssrVar = d;
            if (dssrVar == null) {
                synchronized (aknr.class) {
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
