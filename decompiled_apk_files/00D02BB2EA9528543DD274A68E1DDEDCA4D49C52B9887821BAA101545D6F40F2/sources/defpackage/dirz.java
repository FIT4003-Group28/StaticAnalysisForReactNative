package defpackage;
/* compiled from: PG */
/* renamed from: dirz  reason: default package */
/* loaded from: classes6.dex */
public final class dirz extends dsqw<dirz, dirw> implements dssk {
    public static final dirz b;
    private static volatile dssr<dirz> c;
    public dsrj<diry> a = dssu.b;

    static {
        dirz dirzVar = new dirz();
        b = dirzVar;
        dsqw.cc(dirz.class, dirzVar);
    }

    private dirz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dirz();
            }
            if (i2 == 4) {
                return new dirw();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dirz> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dirz.class) {
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
