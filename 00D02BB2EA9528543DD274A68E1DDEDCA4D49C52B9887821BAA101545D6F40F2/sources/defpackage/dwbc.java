package defpackage;
/* compiled from: PG */
/* renamed from: dwbc  reason: default package */
/* loaded from: classes6.dex */
public final class dwbc extends dsqs<dwbc, dwaz> implements dsqt {
    public static final dwbc g;
    private static volatile dssr<dwbc> i;
    public int a;
    public dwaa b;
    public int d;
    public dwas e;
    public dway f;
    private byte h = 2;
    public dsrj<dvxl> c = dssu.b;

    static {
        dwbc dwbcVar = new dwbc();
        g = dwbcVar;
        dsqw.cc(dwbc.class, dwbcVar);
    }

    private dwbc() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            byte b = 1;
            if (i3 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0001\u0017\u0005\u0000\u0001\u0001\u0001ᐉ\u0000\u0003\u001b\u0014ဌ\u0001\u0016ဉ\u0003\u0017ဉ\u0004", new Object[]{"a", "b", "c", dvxl.class, "d", dwba.a, "e", "f"});
            }
            if (i3 == 3) {
                return new dwbc();
            }
            if (i3 == 4) {
                return new dwaz();
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
            dssr<dwbc> dssrVar = i;
            if (dssrVar == null) {
                synchronized (dwbc.class) {
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
