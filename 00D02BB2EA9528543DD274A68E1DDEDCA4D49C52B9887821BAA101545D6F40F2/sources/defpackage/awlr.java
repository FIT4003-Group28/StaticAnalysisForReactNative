package defpackage;
/* compiled from: PG */
/* renamed from: awlr  reason: default package */
/* loaded from: classes3.dex */
public final class awlr extends dsqw<awlr, awlq> implements dssk {
    public static final awlr d;
    private static volatile dssr<awlr> e;
    public int a;
    public long b;
    public long c;

    static {
        awlr awlrVar = new awlr();
        d = awlrVar;
        dsqw.cc(awlr.class, awlrVar);
    }

    private awlr() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new awlr();
            }
            if (i2 == 4) {
                return new awlq();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<awlr> dssrVar = e;
            if (dssrVar == null) {
                synchronized (awlr.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
