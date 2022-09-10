package defpackage;
/* compiled from: PG */
/* renamed from: awtq  reason: default package */
/* loaded from: classes3.dex */
public final class awtq extends dsqw<awtq, awtp> implements dssk {
    public static final awtq c;
    private static volatile dssr<awtq> d;
    public int a;
    public String b = "";

    static {
        awtq awtqVar = new awtq();
        c = awtqVar;
        dsqw.cc(awtq.class, awtqVar);
    }

    private awtq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new awtq();
            }
            if (i2 == 4) {
                return new awtp();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<awtq> dssrVar = d;
            if (dssrVar == null) {
                synchronized (awtq.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
