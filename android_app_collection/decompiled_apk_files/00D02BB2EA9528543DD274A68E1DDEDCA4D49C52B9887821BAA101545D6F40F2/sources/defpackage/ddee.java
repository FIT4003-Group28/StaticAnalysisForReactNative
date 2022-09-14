package defpackage;
/* compiled from: PG */
/* renamed from: ddee  reason: default package */
/* loaded from: classes5.dex */
public final class ddee extends dsqw<ddee, ddec> implements dssk {
    public static final ddee g;
    private static volatile dssr<ddee> i;
    public int a;
    public ddei b;
    public int c;
    public ddei d;
    public long e;
    public boolean f;
    private byte h = 2;

    static {
        ddee ddeeVar = new ddee();
        g = ddeeVar;
        dsqw.cc(ddee.class, ddeeVar);
    }

    private ddee() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            byte b = 1;
            if (i3 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ဌ\u0001\u0003ᐉ\u0002\u0004ဂ\u0004\u0006ဇ\u0005", new Object[]{"a", "b", "c", dded.a, "d", "e", "f"});
            }
            if (i3 == 3) {
                return new ddee();
            }
            if (i3 == 4) {
                return new ddec();
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
            dssr<ddee> dssrVar = i;
            if (dssrVar == null) {
                synchronized (ddee.class) {
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
