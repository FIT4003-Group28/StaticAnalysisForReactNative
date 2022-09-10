package defpackage;
/* compiled from: PG */
/* renamed from: dwid  reason: default package */
/* loaded from: classes6.dex */
public final class dwid extends dsqw<dwid, dwic> implements dssk {
    public static final dwid b;
    private static volatile dssr<dwid> c;
    public dsrj<dwhz> a = dssu.b;

    static {
        dwid dwidVar = new dwid();
        b = dwidVar;
        dsqw.cc(dwid.class, dwidVar);
    }

    private dwid() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", dwhz.class});
            }
            if (i2 == 3) {
                return new dwid();
            }
            if (i2 == 4) {
                return new dwic();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwid> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dwid.class) {
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
