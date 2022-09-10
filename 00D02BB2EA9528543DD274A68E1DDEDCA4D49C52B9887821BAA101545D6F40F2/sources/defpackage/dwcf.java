package defpackage;
/* compiled from: PG */
/* renamed from: dwcf  reason: default package */
/* loaded from: classes6.dex */
public final class dwcf extends dsqw<dwcf, dwce> implements dssk {
    public static final dwcf c;
    private static volatile dssr<dwcf> e;
    public dgfs a;
    public String b = "";
    private int d;

    static {
        dwcf dwcfVar = new dwcf();
        c = dwcfVar;
        dsqw.cc(dwcf.class, dwcfVar);
    }

    private dwcf() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဈ\u0002\u0003ဉ\u0001", new Object[]{"d", "b", "a"});
            }
            if (i2 == 3) {
                return new dwcf();
            }
            if (i2 == 4) {
                return new dwce();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwcf> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dwcf.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
