package defpackage;
/* compiled from: PG */
/* renamed from: drze  reason: default package */
/* loaded from: classes6.dex */
public final class drze extends dsqw<drze, drzc> implements dssk {
    public static final drze i;
    private static volatile dssr<drze> j;
    public int a;
    public dsba c;
    public long d;
    public int e;
    public dsau f;
    public int g;
    public String b = "";
    public dsrj<dsbc> h = dssu.b;

    static {
        drze drzeVar = new drze();
        i = drzeVar;
        dsqw.cc(drze.class, drzeVar);
    }

    private drze() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(i, "\u0001\u0007\u0000\u0001\u0001\u000b\u0007\u0000\u0001\u0000\u0001ဈ\u0000\u0005ဌ\u0004\u0007ဂ\u0002\bဉ\u0001\tဉ\u0005\n\u001b\u000bဌ\u0006", new Object[]{"a", "b", "e", drzd.a, "d", "c", "f", "h", dsbc.class, "g", dscm.a});
            }
            if (i3 == 3) {
                return new drze();
            }
            if (i3 == 4) {
                return new drzc();
            }
            if (i3 == 5) {
                return i;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<drze> dssrVar = j;
            if (dssrVar == null) {
                synchronized (drze.class) {
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
