package defpackage;
/* compiled from: PG */
/* renamed from: dwfn  reason: default package */
/* loaded from: classes.dex */
public final class dwfn extends dsqw<dwfn, dwfm> implements dssk {
    public static final dwfn b;
    private static volatile dssr<dwfn> c;
    public dsrj<dwfl> a = dssu.b;

    static {
        dwfn dwfnVar = new dwfn();
        b = dwfnVar;
        dsqw.cc(dwfn.class, dwfnVar);
    }

    private dwfn() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", dwfl.class});
            }
            if (i2 == 3) {
                return new dwfn();
            }
            if (i2 == 4) {
                return new dwfm();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwfn> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dwfn.class) {
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
