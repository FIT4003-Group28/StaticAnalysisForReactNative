package defpackage;
/* compiled from: PG */
/* renamed from: dizd  reason: default package */
/* loaded from: classes6.dex */
public final class dizd extends dsqw<dizd, dizc> implements dssk {
    public static final dizd d;
    private static volatile dssr<dizd> e;
    public int a;
    public dpum b;
    public String c = "";

    static {
        dizd dizdVar = new dizd();
        d = dizdVar;
        dsqw.cc(dizd.class, dizdVar);
    }

    private dizd() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0002\u0004\u0002\u0000\u0000\u0000\u0002ဉ\u0001\u0004ဈ\u0002", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dizd();
            }
            if (i2 == 4) {
                return new dizc();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dizd> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dizd.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}