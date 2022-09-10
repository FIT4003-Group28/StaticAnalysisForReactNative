package defpackage;
/* compiled from: PG */
/* renamed from: bzig  reason: default package */
/* loaded from: classes4.dex */
public final class bzig extends dsqw<bzig, bzib> implements dssk {
    public static final bzig i;
    private static volatile dssr<bzig> j;
    public int a;
    public String b = "";
    public dpum c;
    public float d;
    public bzii e;
    public bzif f;
    public boolean g;
    public long h;

    static {
        bzig bzigVar = new bzig();
        i = bzigVar;
        dsqw.cc(bzig.class, bzigVar);
    }

    private bzig() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(i, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0003ဉ\u0002\u0004ခ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဇ\u0006\bဂ\u0007", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h"});
            }
            if (i3 == 3) {
                return new bzig();
            }
            if (i3 == 4) {
                return new bzib();
            }
            if (i3 == 5) {
                return i;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<bzig> dssrVar = j;
            if (dssrVar == null) {
                synchronized (bzig.class) {
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
