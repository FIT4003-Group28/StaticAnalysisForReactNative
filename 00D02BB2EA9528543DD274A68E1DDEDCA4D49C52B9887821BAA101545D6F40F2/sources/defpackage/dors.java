package defpackage;
/* compiled from: PG */
/* renamed from: dors  reason: default package */
/* loaded from: classes.dex */
public final class dors extends dsqw<dors, dorr> implements dssk {
    public static final dors b;
    private static volatile dssr<dors> c;
    public dsrj<doft> a;

    static {
        dors dorsVar = new dors();
        b = dorsVar;
        dsqw.cc(dors.class, dorsVar);
    }

    private dors() {
        dssu<Object> dssuVar = dssu.b;
        this.a = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001b", new Object[]{"a", doft.class});
            }
            if (i2 == 3) {
                return new dors();
            }
            if (i2 == 4) {
                return new dorr();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dors> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dors.class) {
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
