package defpackage;
/* compiled from: PG */
/* renamed from: dwjz  reason: default package */
/* loaded from: classes.dex */
public final class dwjz extends dsqw<dwjz, dwjy> implements dssk {
    public static final dwjz a;
    private static volatile dssr<dwjz> b;

    static {
        dwjz dwjzVar = new dwjz();
        a = dwjzVar;
        dsqw.cc(dwjz.class, dwjzVar);
    }

    private dwjz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dwjz();
            }
            if (i2 == 4) {
                return new dwjy();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwjz> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dwjz.class) {
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
