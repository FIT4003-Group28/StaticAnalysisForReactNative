package defpackage;
/* compiled from: PG */
/* renamed from: dhrt  reason: default package */
/* loaded from: classes6.dex */
public final class dhrt extends dsqw<dhrt, dhrr> implements dssk {
    public static final dhrt d;
    private static volatile dssr<dhrt> e;
    public int a;
    public int b;
    public String c = "";

    static {
        dhrt dhrtVar = new dhrt();
        d = dhrtVar;
        dsqw.cc(dhrt.class, dhrtVar);
    }

    private dhrt() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0003ဈ\u0002", new Object[]{"a", "b", dhrs.a, "c"});
            }
            if (i2 == 3) {
                return new dhrt();
            }
            if (i2 == 4) {
                return new dhrr();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dhrt> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dhrt.class) {
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
