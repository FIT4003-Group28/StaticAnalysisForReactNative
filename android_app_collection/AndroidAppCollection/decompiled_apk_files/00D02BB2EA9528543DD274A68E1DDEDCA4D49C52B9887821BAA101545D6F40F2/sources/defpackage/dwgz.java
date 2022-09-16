package defpackage;
/* compiled from: PG */
/* renamed from: dwgz  reason: default package */
/* loaded from: classes6.dex */
public final class dwgz extends dsqw<dwgz, dwgy> implements dssk {
    public static final dwgz h;
    private static volatile dssr<dwgz> j;
    public int a;
    public doar b;
    public dnqe c;
    public dngm d;
    public djgw e;
    public dobt f;
    public dnqh g;
    private byte i = 2;

    static {
        dwgz dwgzVar = new dwgz();
        h = dwgzVar;
        dsqw.cc(dwgz.class, dwgzVar);
    }

    private dwgz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(h, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0006ဉ\u0005\u0007ᐉ\u0006", new Object[]{"a", "b", "c", "d", "e", "f", "g"});
            }
            if (i2 == 3) {
                return new dwgz();
            }
            if (i2 == 4) {
                return new dwgy();
            }
            if (i2 == 5) {
                return h;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.i = b;
                return null;
            }
            dssr<dwgz> dssrVar = j;
            if (dssrVar == null) {
                synchronized (dwgz.class) {
                    dssrVar = j;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(h);
                        j = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.i);
    }
}
