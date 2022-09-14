package defpackage;
/* compiled from: PG */
/* renamed from: dokn  reason: default package */
/* loaded from: classes6.dex */
public final class dokn extends dsqw<dokn, doki> implements dssk {
    public static final dokn b;
    private static volatile dssr<dokn> c;
    public dsrj<dokm> a = dssu.b;

    static {
        dokn doknVar = new dokn();
        b = doknVar;
        dsqw.cc(dokn.class, doknVar);
    }

    private dokn() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", dokm.class});
            }
            if (i2 == 3) {
                return new dokn();
            }
            if (i2 == 4) {
                return new doki();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dokn> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dokn.class) {
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
