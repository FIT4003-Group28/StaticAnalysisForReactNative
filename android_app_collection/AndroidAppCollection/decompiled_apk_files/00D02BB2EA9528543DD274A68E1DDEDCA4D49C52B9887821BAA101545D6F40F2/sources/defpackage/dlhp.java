package defpackage;
/* compiled from: PG */
/* renamed from: dlhp  reason: default package */
/* loaded from: classes6.dex */
public final class dlhp extends dsqw<dlhp, dlho> implements dssk {
    public static final dlhp i;
    private static volatile dssr<dlhp> j;
    public int a;
    public dqzl b;
    public boolean c;
    public dqza d;
    public dqyy e;
    public dqzg f;
    public String g = "";
    public long h;

    static {
        dlhp dlhpVar = new dlhp();
        i = dlhpVar;
        dsqw.cc(dlhp.class, dlhpVar);
    }

    private dlhp() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(i, "\u0001\u0007\u0000\u0001\u0001\t\u0007\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဇ\u0001\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\bဈ\u0006\tဂ\u0007", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h"});
            }
            if (i3 == 3) {
                return new dlhp();
            }
            if (i3 == 4) {
                return new dlho();
            }
            if (i3 == 5) {
                return i;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<dlhp> dssrVar = j;
            if (dssrVar == null) {
                synchronized (dlhp.class) {
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
