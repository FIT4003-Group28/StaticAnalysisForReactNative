package defpackage;
/* compiled from: PG */
/* renamed from: dlyx  reason: default package */
/* loaded from: classes6.dex */
public final class dlyx extends dsqw<dlyx, dlyv> implements dssk {
    public static final dlyx l;
    private static volatile dssr<dlyx> m;
    public int a;
    public dlyz b;
    public float d;
    public float e;
    public float f;
    public float g;
    public boolean i;
    public int j;
    public int k;
    public dssd<Long, dlzg> h = dssd.b;
    public dsre c = dsqk.b;

    static {
        dlyx dlyxVar = new dlyx();
        l = dlyxVar;
        dsqw.cc(dlyx.class, dlyxVar);
    }

    private dlyx() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(l, "\u0001\n\u0000\u0001\u0001\n\n\u0001\u0001\u0000\u0001ဉ\u0000\u0002\u0013\u0003ခ\u0001\u0004ခ\u0002\u0005ခ\u0003\u0006ခ\u0004\u00072\bဇ\u0005\tင\u0006\nင\u0007", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", dlyw.a, "i", "j", "k"});
            }
            if (i2 == 3) {
                return new dlyx();
            }
            if (i2 == 4) {
                return new dlyv();
            }
            if (i2 == 5) {
                return l;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dlyx> dssrVar = m;
            if (dssrVar == null) {
                synchronized (dlyx.class) {
                    dssrVar = m;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(l);
                        m = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
