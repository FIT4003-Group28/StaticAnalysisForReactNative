package defpackage;
/* compiled from: PG */
/* renamed from: dupk  reason: default package */
/* loaded from: classes6.dex */
public final class dupk extends dsqw<dupk, dupj> implements dssk {
    public static final dupk c;
    private static volatile dssr<dupk> d;
    public int a;
    public dwpe b;

    static {
        dupk dupkVar = new dupk();
        c = dupkVar;
        dsqw.cc(dupk.class, dupkVar);
    }

    private dupk() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dupk();
            }
            if (i2 == 4) {
                return new dupj();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dupk> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dupk.class) {
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
