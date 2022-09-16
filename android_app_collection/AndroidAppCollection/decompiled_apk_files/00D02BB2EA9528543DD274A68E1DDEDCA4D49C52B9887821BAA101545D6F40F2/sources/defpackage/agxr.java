package defpackage;
/* compiled from: PG */
/* renamed from: agxr  reason: default package */
/* loaded from: classes2.dex */
public final class agxr extends dsqw<agxr, agxq> implements dssk {
    public static final agxr i;
    private static volatile dssr<agxr> k;
    public int a;
    public agyj b;
    public agyp c;
    public agxp d;
    public boolean f;
    public long g;
    public boolean h;
    private byte j = 2;
    public String e = "";

    static {
        agxr agxrVar = new agxr();
        i = agxrVar;
        dsqw.cc(agxr.class, agxrVar);
    }

    private agxr() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            byte b = 1;
            if (i3 == 2) {
                return cd(i, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0000\u0001\u0001ဉ\u0000\u0002ᐉ\u0001\u0003ဈ\u0003\u0005ဉ\u0002\u0006ဂ\u0005\u0007ဇ\u0006\bဇ\u0004", new Object[]{"a", "b", "c", "e", "d", "g", "h", "f"});
            }
            if (i3 == 3) {
                return new agxr();
            }
            if (i3 == 4) {
                return new agxq();
            }
            if (i3 == 5) {
                return i;
            }
            if (i3 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.j = b;
                return null;
            }
            dssr<agxr> dssrVar = k;
            if (dssrVar == null) {
                synchronized (agxr.class) {
                    dssrVar = k;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(i);
                        k = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.j);
    }
}
