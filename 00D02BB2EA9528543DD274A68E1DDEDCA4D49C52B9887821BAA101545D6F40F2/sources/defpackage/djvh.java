package defpackage;
/* compiled from: PG */
/* renamed from: djvh  reason: default package */
/* loaded from: classes6.dex */
public final class djvh extends dsqw<djvh, djvg> implements dssk {
    public static final djvh a;
    private static volatile dssr<djvh> b;

    static {
        djvh djvhVar = new djvh();
        a = djvhVar;
        dsqw.cc(djvh.class, djvhVar);
    }

    private djvh() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new djvh();
            }
            if (i2 == 4) {
                return new djvg();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djvh> dssrVar = b;
            if (dssrVar == null) {
                synchronized (djvh.class) {
                    dssrVar = b;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        b = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
