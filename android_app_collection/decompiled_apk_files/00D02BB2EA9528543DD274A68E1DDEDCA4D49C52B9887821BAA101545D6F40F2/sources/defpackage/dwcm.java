package defpackage;
/* compiled from: PG */
/* renamed from: dwcm  reason: default package */
/* loaded from: classes6.dex */
public final class dwcm extends dsqw<dwcm, dwcl> implements dssk {
    public static final dwcm b;
    private static volatile dssr<dwcm> d;
    public String a = "";
    private int c;

    static {
        dwcm dwcmVar = new dwcm();
        b = dwcmVar;
        dsqw.cc(dwcm.class, dwcmVar);
    }

    private dwcm() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dwcm();
            }
            if (i2 == 4) {
                return new dwcl();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwcm> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dwcm.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
