package defpackage;
/* compiled from: PG */
/* renamed from: dqvy  reason: default package */
/* loaded from: classes6.dex */
public final class dqvy extends dsqw<dqvy, dqvv> implements dssk {
    public static final dqvy h;
    private static volatile dssr<dqvy> i;
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;

    static {
        dqvy dqvyVar = new dqvy();
        h = dqvyVar;
        dsqw.cc(dqvy.class, dqvyVar);
    }

    private dqvy() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(h, "\u0001\u0006\u0000\u0001\u0001\u000b\u0006\u0000\u0000\u0000\u0001င\u0000\u0005င\u0004\u0006င\u0005\u0007င\u0006\nင\u0002\u000bဌ\b", new Object[]{"a", "b", "d", "e", "f", "c", "g", dqvw.a});
            }
            if (i3 == 3) {
                return new dqvy();
            }
            if (i3 == 4) {
                return new dqvv();
            }
            if (i3 == 5) {
                return h;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<dqvy> dssrVar = i;
            if (dssrVar == null) {
                synchronized (dqvy.class) {
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
