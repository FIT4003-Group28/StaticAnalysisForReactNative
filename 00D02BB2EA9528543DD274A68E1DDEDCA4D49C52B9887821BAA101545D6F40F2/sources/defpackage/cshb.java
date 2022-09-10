package defpackage;
/* compiled from: PG */
/* renamed from: cshb  reason: default package */
/* loaded from: classes5.dex */
public final class cshb extends dsqs<cshb, csha> implements cshc {
    public static final cshb f;
    private static volatile dssr<cshb> h;
    public int a;
    public ddxx c;
    public int d;
    public long e;
    private byte g = 2;
    public dsrf b = dsqz.b;

    static {
        cshb cshbVar = new cshb();
        f = cshbVar;
        dsqw.cc(cshb.class, cshbVar);
    }

    private cshb() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0002\u0006\u0004\u0000\u0001\u0001\u0002\u0016\u0004ᐉ\u0000\u0005ဌ\u0001\u0006ဂ\u0002", new Object[]{"a", "b", "c", "d", ddhj.c(), "e"});
            }
            if (i2 == 3) {
                return new cshb();
            }
            if (i2 == 4) {
                return new csha();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.g = b;
                return null;
            }
            dssr<cshb> dssrVar = h;
            if (dssrVar == null) {
                synchronized (cshb.class) {
                    dssrVar = h;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        h = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.g);
    }
}
