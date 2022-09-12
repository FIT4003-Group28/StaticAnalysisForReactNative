package defpackage;
/* compiled from: PG */
/* renamed from: ajnz  reason: default package */
/* loaded from: classes2.dex */
public final class ajnz extends dsqw<ajnz, ajny> implements dssk {
    public static final ajnz g;
    private static volatile dssr<ajnz> h;
    public int a;
    public long b;
    public long c;
    public long d;
    public dsrj<String> e = dssu.b;
    public boolean f;

    static {
        ajnz ajnzVar = new ajnz();
        g = ajnzVar;
        dsqw.cc(ajnz.class, ajnzVar);
    }

    private ajnz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0001\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004\u001a\u0007ဇ\u0003", new Object[]{"a", "b", "c", "d", "e", "f"});
            }
            if (i2 == 3) {
                return new ajnz();
            }
            if (i2 == 4) {
                return new ajny();
            }
            if (i2 == 5) {
                return g;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ajnz> dssrVar = h;
            if (dssrVar == null) {
                synchronized (ajnz.class) {
                    dssrVar = h;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(g);
                        h = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
