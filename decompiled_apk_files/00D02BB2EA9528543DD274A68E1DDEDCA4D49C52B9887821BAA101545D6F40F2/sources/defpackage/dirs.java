package defpackage;
/* compiled from: PG */
/* renamed from: dirs  reason: default package */
/* loaded from: classes6.dex */
public final class dirs extends dsqw<dirs, dirr> implements dssk {
    public static final dirs c;
    private static volatile dssr<dirs> e;
    public Object b;
    public int a = 0;
    private byte d = 2;

    static {
        dirs dirsVar = new dirs();
        c = dirsVar;
        dsqw.cc(dirs.class, dirsVar);
    }

    private dirs() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(c, "\u0001\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0001\u0001ြ\u0000\u0002ြ\u0000\u0003ᐼ\u0000", new Object[]{"b", "a", dirn.class, dirq.class, disc.class});
            }
            if (i2 == 3) {
                return new dirs();
            }
            if (i2 == 4) {
                return new dirr();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.d = b;
                return null;
            }
            dssr<dirs> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dirs.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.d);
    }
}
