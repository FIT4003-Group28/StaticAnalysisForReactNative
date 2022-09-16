package defpackage;
/* compiled from: PG */
/* renamed from: dulh  reason: default package */
/* loaded from: classes6.dex */
public final class dulh extends dsqw<dulh, dulg> implements dssk {
    public static final dulh b;
    private static volatile dssr<dulh> c;
    public dsrf a = dsqz.b;

    static {
        dulh dulhVar = new dulh();
        b = dulhVar;
        dsqw.cc(dulh.class, dulhVar);
    }

    private dulh() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001e", new Object[]{"a", dulf.c()});
            }
            if (i2 == 3) {
                return new dulh();
            }
            if (i2 == 4) {
                return new dulg();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dulh> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dulh.class) {
                    dssrVar = c;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        c = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
