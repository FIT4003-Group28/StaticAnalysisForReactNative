package defpackage;
/* compiled from: PG */
/* renamed from: dmwz  reason: default package */
/* loaded from: classes6.dex */
public final class dmwz extends dsqw<dmwz, dmwy> implements dssk {
    public static final dmwz b;
    public static final dsqv<dtro, dmwz> c;
    private static volatile dssr<dmwz> d;
    public dsrj<dmwr> a;

    static {
        dmwz dmwzVar = new dmwz();
        b = dmwzVar;
        dsqw.cc(dmwz.class, dmwzVar);
        c = dsqw.newSingularGeneratedExtension(dtro.a, dmwzVar, dmwzVar, null, 12145669, dsur.MESSAGE, dmwz.class);
    }

    private dmwz() {
        dssu<Object> dssuVar = dssu.b;
        this.a = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001b", new Object[]{"a", dmwr.class});
            }
            if (i2 == 3) {
                return new dmwz();
            }
            if (i2 == 4) {
                return new dmwy();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dmwz> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dmwz.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
