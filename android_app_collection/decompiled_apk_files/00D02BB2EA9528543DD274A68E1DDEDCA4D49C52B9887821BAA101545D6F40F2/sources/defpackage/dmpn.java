package defpackage;
/* compiled from: PG */
/* renamed from: dmpn  reason: default package */
/* loaded from: classes.dex */
public final class dmpn extends dsqs<dmpn, dmpk> implements dsqt {
    public static final dmpn r;
    private static volatile dssr<dmpn> t;
    public int a;
    public dmph b;
    public dmph c;
    public dmlq d;
    public dmrf e;
    public int g;
    public int h;
    public int i;
    public int j;
    public int m;
    public int n;
    public int q;
    private byte s = 2;
    public int f = 9;
    public int k = -1;
    public long l = -1;
    public dsrf o = dsqz.b;
    public dsrj<dmma> p = dssu.b;

    static {
        dmpn dmpnVar = new dmpn();
        r = dmpnVar;
        dsqw.cc(dmpn.class, dmpnVar);
    }

    private dmpn() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(r, "\u0001\u0010\u0000\u0001\u0001Ϩ\u0010\u0000\u0002\u0004\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ဂ\f\u0007ဌ\u0004\bင\u000b\tင\r\nဆ\u000e\u000bင\u0006\fင\u0007\rင\b\u000eင\u0005\u0010'\u0011\u001bϨင\u000f", new Object[]{"a", "b", "c", "d", "e", "l", "f", dmpm.c(), "k", "m", "n", "h", "i", "j", "g", "o", "p", dmma.class, "q"});
            }
            if (i2 == 3) {
                return new dmpn();
            }
            if (i2 == 4) {
                return new dmpk();
            }
            if (i2 == 5) {
                return r;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.s = b;
                return null;
            }
            dssr<dmpn> dssrVar = t;
            if (dssrVar == null) {
                synchronized (dmpn.class) {
                    dssrVar = t;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(r);
                        t = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.s);
    }
}
