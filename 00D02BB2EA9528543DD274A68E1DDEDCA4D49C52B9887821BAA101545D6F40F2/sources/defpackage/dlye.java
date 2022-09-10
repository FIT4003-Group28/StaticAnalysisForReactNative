package defpackage;
/* compiled from: PG */
/* renamed from: dlye  reason: default package */
/* loaded from: classes6.dex */
public final class dlye extends dsqw<dlye, dlyd> implements dssk {
    public static final dlye m;
    private static volatile dssr<dlye> n;
    public int a;
    public long b;
    public float c;
    public float d;
    public float e;
    public boolean f;
    public dlzb g;
    public dsrj<dlyo> h = dssu.b;
    public float i;
    public float j;
    public float k;
    public float l;

    static {
        dlye dlyeVar = new dlye();
        m = dlyeVar;
        dsqw.cc(dlye.class, dlyeVar);
    }

    private dlye() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(m, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0001\u0000\u0001ဂ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ခ\u0003\u0005ဇ\u0004\u0006ဉ\u0005\u0007\u001b\bခ\u0006\tခ\u0007\nခ\b\u000bခ\t", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", dlyo.class, "i", "j", "k", "l"});
            }
            if (i2 == 3) {
                return new dlye();
            }
            if (i2 == 4) {
                return new dlyd();
            }
            if (i2 == 5) {
                return m;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dlye> dssrVar = n;
            if (dssrVar == null) {
                synchronized (dlye.class) {
                    dssrVar = n;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(m);
                        n = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
