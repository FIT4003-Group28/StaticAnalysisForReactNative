package defpackage;
/* compiled from: PG */
/* renamed from: dutm  reason: default package */
/* loaded from: classes6.dex */
public final class dutm extends dsqw<dutm, dutl> implements dssk {
    public static final dutm k;
    private static volatile dssr<dutm> l;
    public int a;
    public int c;
    public float d;
    public dutq g;
    public dlgp h;
    public boolean i;
    public boolean j;
    public String b = "";
    public String e = "";
    public String f = "";

    static {
        dutm dutmVar = new dutm();
        k = dutmVar;
        dsqw.cc(dutm.class, dutmVar);
    }

    private dutm() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(k, "\u0001\t\u0000\u0001\u0001\f\t\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003ဈ\u0004\u0004ဉ\u0005\u0005ဉ\u0006\u0007ဇ\b\bဈ\u0003\tခ\u0002\fဇ\u000b", new Object[]{"a", "b", "c", dawo.c(), "f", "g", "h", "i", "e", "d", "j"});
            }
            if (i2 == 3) {
                return new dutm();
            }
            if (i2 == 4) {
                return new dutl();
            }
            if (i2 == 5) {
                return k;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dutm> dssrVar = l;
            if (dssrVar == null) {
                synchronized (dutm.class) {
                    dssrVar = l;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(k);
                        l = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
