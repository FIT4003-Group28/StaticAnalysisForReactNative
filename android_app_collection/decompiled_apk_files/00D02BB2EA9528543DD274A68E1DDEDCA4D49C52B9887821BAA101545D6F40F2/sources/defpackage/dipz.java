package defpackage;
/* compiled from: PG */
/* renamed from: dipz  reason: default package */
/* loaded from: classes6.dex */
public final class dipz extends dsqw<dipz, dipy> implements dssk {
    public static final dipz a;
    private static volatile dssr<dipz> b;

    static {
        dipz dipzVar = new dipz();
        a = dipzVar;
        dsqw.cc(dipz.class, dipzVar);
    }

    private dipz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dipz();
            }
            if (i2 == 4) {
                return new dipy();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dipz> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dipz.class) {
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
