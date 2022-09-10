package defpackage;
/* compiled from: PG */
/* renamed from: dlbu  reason: default package */
/* loaded from: classes6.dex */
public final class dlbu extends dsqw<dlbu, dlbr> implements dssk {
    public static final dlbu c;
    private static volatile dssr<dlbu> e;
    public dsrj<dkzo> a = dssu.b;
    public int b;
    private int d;

    static {
        dlbu dlbuVar = new dlbu();
        c = dlbuVar;
        dsqw.cc(dlbu.class, dlbuVar);
    }

    private dlbu() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0002\u0005\u0002\u0000\u0001\u0000\u0002ဌ\u0001\u0005\u001b", new Object[]{"d", "b", dlbs.a, "a", dkzo.class});
            }
            if (i2 == 3) {
                return new dlbu();
            }
            if (i2 == 4) {
                return new dlbr();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dlbu> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dlbu.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
