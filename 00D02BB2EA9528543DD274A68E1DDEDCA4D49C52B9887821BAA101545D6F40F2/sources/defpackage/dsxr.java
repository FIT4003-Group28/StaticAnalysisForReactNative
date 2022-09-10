package defpackage;
/* compiled from: PG */
/* renamed from: dsxr  reason: default package */
/* loaded from: classes6.dex */
public final class dsxr extends dsqw<dsxr, dsxq> implements dssk {
    public static final dsxr a;
    private static volatile dssr<dsxr> e;
    private int b;
    private dsxn c;
    private byte d = 2;

    static {
        dsxr dsxrVar = new dsxr();
        a = dsxrVar;
        dsqw.cc(dsxr.class, dsxrVar);
    }

    private dsxr() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᔉ\u0000", new Object[]{"b", "c"});
            }
            if (i2 == 3) {
                return new dsxr();
            }
            if (i2 == 4) {
                return new dsxq();
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
            dssr<dsxr> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dsxr.class) {
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
