package defpackage;
/* compiled from: PG */
/* renamed from: dfss  reason: default package */
/* loaded from: classes6.dex */
public final class dfss extends dsqw<dfss, dfsp> implements dssk {
    public static final dfss k;
    private static volatile dssr<dfss> m;
    public int a;
    public double b;
    public double c;
    public double d;
    public dhkd g;
    public dfso i;
    public dfsr j;
    public String e = "";
    public float f = 1.0f;
    private float l = 0.5f;
    public float h = 0.5f;

    static {
        dfss dfssVar = new dfss();
        k = dfssVar;
        dsqw.cc(dfss.class, dfssVar);
    }

    private dfss() {
    }

    public static /* synthetic */ void b(dfss dfssVar) {
        dfssVar.a |= 256;
        dfssVar.l = 0.5f;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(k, "\u0001\n\u0000\u0001\u0001\f\n\u0000\u0000\u0000\u0001က\u0000\u0002က\u0001\u0003က\u0002\u0005ဈ\u0004\u0007ခ\u0006\bခ\b\tခ\t\nဉ\n\u000bဉ\u000b\fဉ\u0007", new Object[]{"a", "b", "c", "d", "e", "f", "l", "h", "i", "j", "g"});
            }
            if (i2 == 3) {
                return new dfss();
            }
            if (i2 == 4) {
                return new dfsp();
            }
            if (i2 == 5) {
                return k;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dfss> dssrVar = m;
            if (dssrVar == null) {
                synchronized (dfss.class) {
                    dssrVar = m;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(k);
                        m = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
