package defpackage;
/* compiled from: PG */
/* renamed from: dujz  reason: default package */
/* loaded from: classes.dex */
public final class dujz extends dsqw<dujz, dujw> implements dssk {
    public static final dujz q;
    private static volatile dssr<dujz> s;
    public int a;
    public int b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean k;
    public boolean l;
    public int m;
    public dujy n;
    public boolean o;
    public boolean p;
    private byte r = 2;
    public int i = 3;
    public int j = 3;

    static {
        dujz dujzVar = new dujz();
        q = dujzVar;
        dsqw.cc(dujz.class, dujzVar);
    }

    private dujz() {
        dssu<Object> dssuVar = dssu.b;
        this.m = 1000;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(q, "\u0001\u000f\u0000\u0001\u0005#\u000f\u0000\u0000\u0000\u0005ဌ\u0004\u0006ဇ\u0005\u0007ဇ\u0006\bဇ\u0007\tဇ\t\nဇ\u000b\u000bဇ\f\rင\u000f\u000eင\u0010\u001aဇ\u0016\u001bဇ\u0017\u001fင\u0019 ဉ\u001b!ဇ\u001c#ဇ\u001e", new Object[]{"a", "b", duju.a, "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p"});
            }
            if (i2 == 3) {
                return new dujz();
            }
            if (i2 == 4) {
                return new dujw();
            }
            if (i2 == 5) {
                return q;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.r = b;
                return null;
            }
            dssr<dujz> dssrVar = s;
            if (dssrVar == null) {
                synchronized (dujz.class) {
                    dssrVar = s;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(q);
                        s = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.r);
    }
}
