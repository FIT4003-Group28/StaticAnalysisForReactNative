package defpackage;
/* compiled from: PG */
/* renamed from: dtvi  reason: default package */
/* loaded from: classes6.dex */
public final class dtvi extends dsqw<dtvi, dtvh> implements dssk {
    public static final dtvi i;
    private static volatile dssr<dtvi> j;
    public Object b;
    public int c;
    public int g;
    public boolean h;
    public int a = 0;
    public String d = "";
    public String e = "";
    public dsrj<dtwn> f = dssu.b;

    static {
        dtvi dtviVar = new dtvi();
        i = dtviVar;
        dsqw.cc(dtvi.class, dtviVar);
    }

    private dtvi() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(i, "\u0000\n\u0001\u0000\u0001\n\n\u0000\u0001\u0000\u0001\u000b\u0002Ȉ\u0003\f\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b\u0007\tȈ\n\u001b", new Object[]{"b", "a", "c", "d", "g", dtwa.class, dtuw.class, dtvk.class, dtuy.class, "h", "e", "f", dtwn.class});
            }
            if (i3 == 3) {
                return new dtvi();
            }
            if (i3 == 4) {
                return new dtvh();
            }
            if (i3 == 5) {
                return i;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<dtvi> dssrVar = j;
            if (dssrVar == null) {
                synchronized (dtvi.class) {
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
