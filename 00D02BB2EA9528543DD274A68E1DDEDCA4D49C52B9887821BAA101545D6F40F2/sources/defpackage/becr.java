package defpackage;
/* compiled from: PG */
/* renamed from: becr  reason: default package */
/* loaded from: classes3.dex */
public final class becr extends dsqw<becr, becq> implements dssk {
    public static final becr b;
    private static volatile dssr<becr> c;
    public dsrj<becp> a = dssu.b;

    static {
        becr becrVar = new becr();
        b = becrVar;
        dsqw.cc(becr.class, becrVar);
    }

    private becr() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", becp.class});
            }
            if (i2 == 3) {
                return new becr();
            }
            if (i2 == 4) {
                return new becq();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<becr> dssrVar = c;
            if (dssrVar == null) {
                synchronized (becr.class) {
                    dssrVar = c;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        c = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
