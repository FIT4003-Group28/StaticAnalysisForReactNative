package defpackage;
/* compiled from: PG */
/* renamed from: aimw  reason: default package */
/* loaded from: classes2.dex */
public final class aimw extends dsqw<aimw, aimv> implements dssk {
    public static final aimw l;
    private static volatile dssr<aimw> m;
    public int a;
    public long b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i = true;
    public boolean j;
    public boolean k;

    static {
        aimw aimwVar = new aimw();
        l = aimwVar;
        dsqw.cc(aimw.class, aimwVar);
    }

    private aimw() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(l, "\u0001\n\u0000\u0001\u0001\u000e\n\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဇ\u0001\u0003ဇ\u0004\u0007ဇ\u0005\bဇ\u0006\tဇ\u0002\nဇ\u0003\fဇ\t\rဇ\u0007\u000eဇ\b", new Object[]{"a", "b", "c", "f", "g", "h", "d", "e", "k", "i", "j"});
            }
            if (i2 == 3) {
                return new aimw();
            }
            if (i2 == 4) {
                return new aimv();
            }
            if (i2 == 5) {
                return l;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<aimw> dssrVar = m;
            if (dssrVar == null) {
                synchronized (aimw.class) {
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
