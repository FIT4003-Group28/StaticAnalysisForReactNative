package defpackage;
/* compiled from: PG */
/* renamed from: djgz  reason: default package */
/* loaded from: classes6.dex */
public final class djgz extends dsqw<djgz, djgy> implements dssk {
    public static final djgz i;
    private static volatile dssr<djgz> j;
    public int a;
    public int b;
    public int c;
    public int d;
    public djhh e;
    public djhp f;
    public int g;
    public int h;

    static {
        djgz djgzVar = new djgz();
        i = djgzVar;
        dsqw.cc(djgz.class, djgzVar);
    }

    private djgz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(i, "\u0001\u0007\u0000\u0001\u0002\u000b\u0007\u0000\u0000\u0000\u0002င\u0001\u0004င\u0002\u0006ဉ\u0003\u0007ဉ\u0004\bင\u0000\nဌ\u0005\u000bဌ\u0006", new Object[]{"a", "c", "d", "e", "f", "b", "g", dgfd.a, "h", dgfb.c()});
            }
            if (i3 == 3) {
                return new djgz();
            }
            if (i3 == 4) {
                return new djgy();
            }
            if (i3 == 5) {
                return i;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<djgz> dssrVar = j;
            if (dssrVar == null) {
                synchronized (djgz.class) {
                    dssrVar = j;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(i);
                        j = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
