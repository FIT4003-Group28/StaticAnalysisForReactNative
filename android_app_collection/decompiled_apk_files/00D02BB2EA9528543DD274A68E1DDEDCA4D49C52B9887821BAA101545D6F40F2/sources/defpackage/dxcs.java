package defpackage;
/* compiled from: PG */
/* renamed from: dxcs  reason: default package */
/* loaded from: classes6.dex */
public final class dxcs extends dsqw<dxcs, dxcr> implements dssk {
    public static final dxcs e;
    private static volatile dssr<dxcs> f;
    public int a;
    public dsrj<String> b = dssu.b;
    public dsrj<String> c = dssu.b;
    public int d;

    static {
        dxcs dxcsVar = new dxcs();
        e = dxcsVar;
        dsqw.cc(dxcs.class, dxcsVar);
    }

    private dxcs() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u001a\u0002\u001a\u0003င\u0000", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new dxcs();
            }
            if (i2 == 4) {
                return new dxcr();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dxcs> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dxcs.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
