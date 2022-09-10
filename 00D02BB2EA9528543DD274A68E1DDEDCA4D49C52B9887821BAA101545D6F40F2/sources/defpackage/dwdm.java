package defpackage;
/* compiled from: PG */
/* renamed from: dwdm  reason: default package */
/* loaded from: classes6.dex */
public final class dwdm extends dsqw<dwdm, dwdl> implements dssk {
    public static final dwdm b;
    private static volatile dssr<dwdm> d;
    public dwdt a;
    private int c;

    static {
        dwdm dwdmVar = new dwdm();
        b = dwdmVar;
        dsqw.cc(dwdm.class, dwdmVar);
    }

    private dwdm() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dwdm();
            }
            if (i2 == 4) {
                return new dwdl();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwdm> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dwdm.class) {
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
