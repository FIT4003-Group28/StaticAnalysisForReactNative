package defpackage;
/* compiled from: PG */
/* renamed from: dviq  reason: default package */
/* loaded from: classes.dex */
public final class dviq extends dsqw<dviq, dvhx> implements dssk {
    public static final dviq D;
    private static volatile dssr<dviq> F;
    public dqcm A;
    public dntw B;
    public dvij C;
    public int a;
    public int b;
    public drbo c;
    public dvhz e;
    public dwao f;
    public dnqh g;
    public dnwb h;
    public doqb i;
    public djyq j;
    public dnuc k;
    public drbj l;
    public dwfv m;
    public dvif n;
    public dnty o;
    public dvih p;
    public dhyb q;
    public dqex r;
    public dpsh s;
    public dqpg t;
    public int u;
    public dqgy v;
    public dvin w;
    public dvil x;
    public dvip y;
    public dvib z;
    private byte E = 2;
    public dsrj<drbx> d = dssu.b;

    static {
        dviq dviqVar = new dviq();
        D = dviqVar;
        dsqw.cc(dviq.class, dviqVar);
    }

    private dviq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(D, "\u0001\u001b\u0000\u0002\u0001$\u001b\u0000\u0001\u0001\u0001ဉ\u0001\u0002ဉ\u0002\u0003ᐉ\u0004\u0004ဉ\u0006\u0005ဉ\u0007\u0006ဉ\b\u0007ဉ\t\bဉ\n\tဉ\u000b\nဉ\r\u000bဉ\u0011\rင\u0012\u000fဉ\u0005\u0010ဉ\f\u0013ဉ\u0016\u0014\u001b\u0015ဉ\u0000\u0017ဉ\u0013\u0018ဉ\u000e\u0019ဉ\u0010\u001bဉ\u0019\u001cဉ\u001c\u001dဉ\u000f\u001eဉ\u001d\"ဉ\u001f#ဉ $ဉ\u0018", new Object[]{"a", "b", "e", "f", "g", "i", "j", "k", "l", "m", "n", "p", "t", "u", "h", "o", "w", "d", drbx.class, "c", "v", "q", "s", "y", "z", "r", "A", "B", "C", "x"});
            }
            if (i2 == 3) {
                return new dviq();
            }
            if (i2 == 4) {
                return new dvhx();
            }
            if (i2 == 5) {
                return D;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.E = b;
                return null;
            }
            dssr<dviq> dssrVar = F;
            if (dssrVar == null) {
                synchronized (dviq.class) {
                    dssrVar = F;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(D);
                        F = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.E);
    }
}
