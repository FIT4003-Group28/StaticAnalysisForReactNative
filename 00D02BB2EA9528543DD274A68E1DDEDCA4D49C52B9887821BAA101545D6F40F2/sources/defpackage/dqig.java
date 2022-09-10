package defpackage;
/* compiled from: PG */
/* renamed from: dqig  reason: default package */
/* loaded from: classes6.dex */
public final class dqig extends dsqw<dqig, dqif> implements dssk {
    public static final dqig i;
    private static volatile dssr<dqig> j;
    public int a;
    public Object c;
    public dpll f;
    public dqmr g;
    public int b = 0;
    public String d = "";
    public String e = "";
    public String h = "";

    static {
        dqig dqigVar = new dqig();
        i = dqigVar;
        dsqw.cc(dqig.class, dqigVar);
    }

    private dqig() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(i, "\u0001\u0007\u0001\u0001\u0001\b\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ျ\u0000\u0003ျ\u0000\u0004ဈ\u0003\u0006ဉ\u0004\u0007ဉ\u0005\bဈ\u0006", new Object[]{"c", "b", "a", "d", "e", "f", "g", "h"});
            }
            if (i3 == 3) {
                return new dqig();
            }
            if (i3 == 4) {
                return new dqif();
            }
            if (i3 == 5) {
                return i;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<dqig> dssrVar = j;
            if (dssrVar == null) {
                synchronized (dqig.class) {
                    dssrVar = j;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(i);
                        j = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
