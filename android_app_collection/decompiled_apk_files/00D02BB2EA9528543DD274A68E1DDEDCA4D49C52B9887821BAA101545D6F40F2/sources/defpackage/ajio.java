package defpackage;
/* compiled from: PG */
/* renamed from: ajio  reason: default package */
/* loaded from: classes2.dex */
public final class ajio extends dsqw<ajio, ajin> implements dssk {
    public static final ajio h;
    private static volatile dssr<ajio> i;
    public int a;
    public dsrj<ajjg> b = dssu.b;
    public dsrj<ajja> c = dssu.b;
    public dsrj<ajis> d = dssu.b;
    public int e;
    public long f;
    public ajiw g;

    static {
        ajio ajioVar = new ajio();
        h = ajioVar;
        dsqw.cc(ajio.class, ajioVar);
    }

    private ajio() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0003\u0000\u0001\u001b\u0002\u001b\u0003င\u0000\u0004ဂ\u0001\u0005ဉ\u0002\u0006\u001b", new Object[]{"a", "b", ajjg.class, "c", ajja.class, "e", "f", "g", "d", ajis.class});
            }
            if (i3 == 3) {
                return new ajio();
            }
            if (i3 == 4) {
                return new ajin();
            }
            if (i3 == 5) {
                return h;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<ajio> dssrVar = i;
            if (dssrVar == null) {
                synchronized (ajio.class) {
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
