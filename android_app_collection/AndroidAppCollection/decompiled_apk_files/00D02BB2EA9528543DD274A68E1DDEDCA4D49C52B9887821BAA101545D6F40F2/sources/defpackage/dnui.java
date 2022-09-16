package defpackage;
/* compiled from: PG */
/* renamed from: dnui  reason: default package */
/* loaded from: classes.dex */
public final class dnui extends dsqw<dnui, dnuf> implements dssk {
    public static final dnui g;
    private static volatile dssr<dnui> i;
    public int a;
    public dqpe c;
    public dpjx d;
    public dnuh e;
    public dnue f;
    private byte h = 2;
    public String b = "";

    static {
        dnui dnuiVar = new dnui();
        g = dnuiVar;
        dsqw.cc(dnui.class, dnuiVar);
    }

    private dnui() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            byte b = 1;
            if (i3 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0001\u0001ဉ\u0001\u0002ဉ\u0002\u0003ᐉ\u0005\u0004ဉ\u0006\u0005ဈ\u0000", new Object[]{"a", "c", "d", "e", "f", "b"});
            }
            if (i3 == 3) {
                return new dnui();
            }
            if (i3 == 4) {
                return new dnuf();
            }
            if (i3 == 5) {
                return g;
            }
            if (i3 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.h = b;
                return null;
            }
            dssr<dnui> dssrVar = i;
            if (dssrVar == null) {
                synchronized (dnui.class) {
                    dssrVar = i;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(g);
                        i = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.h);
    }
}
