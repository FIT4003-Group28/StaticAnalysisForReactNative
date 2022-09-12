package defpackage;
/* compiled from: PG */
/* renamed from: dgjs  reason: default package */
/* loaded from: classes6.dex */
public final class dgjs extends dsqw<dgjs, dgjr> implements dssk {
    public static final dgjs a;
    private static volatile dssr<dgjs> b;

    static {
        dgjs dgjsVar = new dgjs();
        a = dgjsVar;
        dsqw.cc(dgjs.class, dgjsVar);
    }

    private dgjs() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dgjs();
            }
            if (i2 == 4) {
                return new dgjr();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dgjs> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dgjs.class) {
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
