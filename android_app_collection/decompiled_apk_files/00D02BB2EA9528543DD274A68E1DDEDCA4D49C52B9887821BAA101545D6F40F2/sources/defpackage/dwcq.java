package defpackage;
/* compiled from: PG */
/* renamed from: dwcq  reason: default package */
/* loaded from: classes6.dex */
public final class dwcq extends dsqw<dwcq, dwcp> implements dssk {
    public static final dwcq c;
    private static volatile dssr<dwcq> d;
    public int a;
    public String b = "";

    static {
        dwcq dwcqVar = new dwcq();
        c = dwcqVar;
        dsqw.cc(dwcq.class, dwcqVar);
    }

    private dwcq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003ဈ\u0002", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dwcq();
            }
            if (i2 == 4) {
                return new dwcp();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwcq> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dwcq.class) {
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
