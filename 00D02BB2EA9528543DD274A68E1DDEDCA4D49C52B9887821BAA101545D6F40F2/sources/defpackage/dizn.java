package defpackage;
/* compiled from: PG */
/* renamed from: dizn  reason: default package */
/* loaded from: classes6.dex */
public final class dizn extends dsqw<dizn, dizm> implements dssk {
    public static final dizn c;
    private static volatile dssr<dizn> d;
    public int a;
    public String b = "";

    static {
        dizn diznVar = new dizn();
        c = diznVar;
        dsqw.cc(dizn.class, diznVar);
    }

    private dizn() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dizn();
            }
            if (i2 == 4) {
                return new dizm();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dizn> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dizn.class) {
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
