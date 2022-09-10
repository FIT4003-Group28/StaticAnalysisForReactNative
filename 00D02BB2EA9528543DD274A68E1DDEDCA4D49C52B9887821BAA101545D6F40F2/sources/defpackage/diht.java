package defpackage;
/* compiled from: PG */
/* renamed from: diht  reason: default package */
/* loaded from: classes6.dex */
public final class diht extends dsqw<diht, dihs> implements dssk {
    public static final diht a;
    private static volatile dssr<diht> b;

    static {
        diht dihtVar = new diht();
        a = dihtVar;
        dsqw.cc(diht.class, dihtVar);
    }

    private diht() {
        dssu<Object> dssuVar = dssu.b;
        dspd dspdVar = dspd.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new diht();
            }
            if (i2 == 4) {
                return new dihs();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<diht> dssrVar = b;
            if (dssrVar == null) {
                synchronized (diht.class) {
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
