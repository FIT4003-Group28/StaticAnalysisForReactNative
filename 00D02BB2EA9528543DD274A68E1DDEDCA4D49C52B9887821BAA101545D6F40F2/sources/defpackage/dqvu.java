package defpackage;
/* compiled from: PG */
/* renamed from: dqvu  reason: default package */
/* loaded from: classes6.dex */
public final class dqvu extends dsqw<dqvu, dqvr> implements dssk {
    public static final dqvu h;
    private static volatile dssr<dqvu> i;
    public int a;
    public int b;
    public int e;
    public int f;
    public String c = "";
    public String d = "";
    public String g = "";

    static {
        dqvu dqvuVar = new dqvu();
        h = dqvuVar;
        dsqw.cc(dqvu.class, dqvuVar);
    }

    private dqvu() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(h, "\u0001\u0006\u0000\u0001\u0001\u000b\u0006\u0000\u0000\u0000\u0001ဌ\u0000\u0007ဈ\u0002\bင\u0003\tဈ\u0001\nင\u0004\u000bဈ\u0005", new Object[]{"a", "b", dqvs.a, "d", "e", "c", "f", "g"});
            }
            if (i3 == 3) {
                return new dqvu();
            }
            if (i3 == 4) {
                return new dqvr();
            }
            if (i3 == 5) {
                return h;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<dqvu> dssrVar = i;
            if (dssrVar == null) {
                synchronized (dqvu.class) {
                    dssrVar = i;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(h);
                        i = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
