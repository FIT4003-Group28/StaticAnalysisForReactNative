package defpackage;
/* compiled from: PG */
/* renamed from: dwda  reason: default package */
/* loaded from: classes6.dex */
public final class dwda extends dsqw<dwda, dwcz> implements dssk {
    public static final dwda c;
    private static volatile dssr<dwda> d;
    public int a;
    public dnol b;

    static {
        dwda dwdaVar = new dwda();
        c = dwdaVar;
        dsqw.cc(dwda.class, dwdaVar);
    }

    private dwda() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0001", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dwda();
            }
            if (i2 == 4) {
                return new dwcz();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwda> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dwda.class) {
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
