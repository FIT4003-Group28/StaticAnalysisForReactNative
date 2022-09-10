package defpackage;
/* compiled from: PG */
/* renamed from: bbpu  reason: default package */
/* loaded from: classes3.dex */
public final class bbpu extends dsqw<bbpu, bbpt> implements dssk {
    public static final bbpu h;
    private static volatile dssr<bbpu> i;
    public int a;
    public long b;
    public int c;
    public int d;
    public int e;
    public long f;
    public String g = "";

    static {
        bbpu bbpuVar = new bbpu();
        h = bbpuVar;
        dsqw.cc(bbpu.class, bbpuVar);
    }

    private bbpu() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005ဂ\u0004\u0006ဈ\u0005", new Object[]{"a", "b", "c", "d", "e", "f", "g"});
            }
            if (i3 == 3) {
                return new bbpu();
            }
            if (i3 == 4) {
                return new bbpt();
            }
            if (i3 == 5) {
                return h;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<bbpu> dssrVar = i;
            if (dssrVar == null) {
                synchronized (bbpu.class) {
                    dssrVar = i;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(h);
                        i = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
