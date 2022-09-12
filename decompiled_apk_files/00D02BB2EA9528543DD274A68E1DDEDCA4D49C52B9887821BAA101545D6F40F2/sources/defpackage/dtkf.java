package defpackage;
/* compiled from: PG */
/* renamed from: dtkf  reason: default package */
/* loaded from: classes6.dex */
public final class dtkf extends dsqs<dtkf, dtke> implements dsqt {
    public static final dtkf n;
    private static volatile dssr<dtkf> p;
    public int a;
    public dtkq f;
    public dthb h;
    public dthb i;
    public dthb j;
    public long m;
    private byte o = 2;
    public dsrj<String> b = dssu.b;
    public dsrj<String> c = dssu.b;
    public dsrj<String> d = dssu.b;
    public dsrj<dtkq> e = dssu.b;
    public dsrj<dtkq> g = dssu.b;
    public String k = "";
    public int l = -1;

    static {
        dtkf dtkfVar = new dtkf();
        n = dtkfVar;
        dsqw.cc(dtkf.class, dtkfVar);
    }

    private dtkf() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(n, "\u0001\f\u0000\u0001\u0001\r\f\u0000\u0005\u0003\u0001\u001a\u0002\u001a\u0003\u001a\u0004\u001b\u0005ဉ\u0000\u0006\u001b\u0007ᐉ\u0001\bᐉ\u0003\tဈ\u0004\nᐉ\u0002\u000bင\u0005\rဂ\u0007", new Object[]{"a", "b", "c", "d", "e", dtkq.class, "f", "g", dtkq.class, "h", "j", "k", "i", "l", "m"});
            }
            if (i2 == 3) {
                return new dtkf();
            }
            if (i2 == 4) {
                return new dtke();
            }
            if (i2 == 5) {
                return n;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.o = b;
                return null;
            }
            dssr<dtkf> dssrVar = p;
            if (dssrVar == null) {
                synchronized (dtkf.class) {
                    dssrVar = p;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(n);
                        p = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.o);
    }
}
