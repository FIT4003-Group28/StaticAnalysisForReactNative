package defpackage;
/* compiled from: PG */
/* renamed from: dgrz  reason: default package */
/* loaded from: classes6.dex */
public final class dgrz extends dsqw<dgrz, dgrw> implements dssk {
    public static final dgrz c;
    private static volatile dssr<dgrz> e;
    public dsrj<dgsj> a = dssu.b;
    public int b;
    private int d;

    static {
        dgrz dgrzVar = new dgrz();
        c = dgrzVar;
        dsqw.cc(dgrz.class, dgrzVar);
    }

    private dgrz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဌ\u0000", new Object[]{"d", "a", dgsj.class, "b", dgrx.a});
            }
            if (i2 == 3) {
                return new dgrz();
            }
            if (i2 == 4) {
                return new dgrw();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dgrz> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dgrz.class) {
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
