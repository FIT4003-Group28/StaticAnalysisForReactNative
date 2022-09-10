package defpackage;
/* compiled from: PG */
/* renamed from: dipf  reason: default package */
/* loaded from: classes6.dex */
public final class dipf extends dsqw<dipf, dipa> implements dssk {
    public static final dipf b;
    private static volatile dssr<dipf> c;
    public dsrj<dipe> a = dssu.b;

    static {
        dipf dipfVar = new dipf();
        b = dipfVar;
        dsqw.cc(dipf.class, dipfVar);
    }

    private dipf() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", dipe.class});
            }
            if (i2 == 3) {
                return new dipf();
            }
            if (i2 == 4) {
                return new dipa();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dipf> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dipf.class) {
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
