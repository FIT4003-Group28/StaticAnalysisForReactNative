package defpackage;
/* compiled from: PG */
/* renamed from: drki  reason: default package */
/* loaded from: classes6.dex */
public final class drki extends dsqw<drki, drkh> implements dssk {
    public static final drki h;
    private static volatile dssr<drki> i;
    public int a;
    public dpoj e;
    public dpoj f;
    public String b = "";
    public String c = "";
    public dsrj<drjb> d = dssu.b;
    public dsrj<drjp> g = dssu.b;

    static {
        drki drkiVar = new drki();
        h = drkiVar;
        dsqw.cc(drki.class, drkiVar);
    }

    private drki() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0002\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဉ\u0002\u0005ဉ\u0003\u0006\u001b", new Object[]{"a", "b", "c", "d", drjb.class, "e", "f", "g", drjp.class});
            }
            if (i3 == 3) {
                return new drki();
            }
            if (i3 == 4) {
                return new drkh();
            }
            if (i3 == 5) {
                return h;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<drki> dssrVar = i;
            if (dssrVar == null) {
                synchronized (drki.class) {
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
