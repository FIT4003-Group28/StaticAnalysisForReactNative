package defpackage;
/* compiled from: PG */
/* renamed from: duod  reason: default package */
/* loaded from: classes.dex */
public final class duod extends dsqw<duod, dunz> implements dssk {
    public static final duod q;
    private static volatile dssr<duod> s;
    public int a;
    public boolean d;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    private int r;
    public float b = 1.0f;
    public int c = 1;
    public int e = 500;
    public int f = 3;

    static {
        duod duodVar = new duod();
        q = duodVar;
        dsqw.cc(duod.class, duodVar);
    }

    private duod() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(q, "\u0001\u000f\u0000\u0002\u0010>\u000f\u0000\u0000\u0000\u0010ဌ\n\u0012ဇ\f\u0013င\r\u0018ဌ\u0011$ဇ &ခ\u0007)ဇ!+ဇ#,ဇ$-ဇ'.ဇ*0ဇ\u00123ဇ-=ဇ.>ဇ/", new Object[]{"a", "r", "c", duoa.a, "d", "e", "f", duob.a, "h", "b", "i", "j", "k", "l", "m", "g", "n", "o", "p"});
            }
            if (i2 == 3) {
                return new duod();
            }
            if (i2 == 4) {
                return new dunz();
            }
            if (i2 == 5) {
                return q;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<duod> dssrVar = s;
            if (dssrVar == null) {
                synchronized (duod.class) {
                    dssrVar = s;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(q);
                        s = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
