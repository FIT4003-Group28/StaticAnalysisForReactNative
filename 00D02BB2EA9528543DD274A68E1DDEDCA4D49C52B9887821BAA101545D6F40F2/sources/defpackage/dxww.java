package defpackage;
/* compiled from: PG */
/* renamed from: dxww  reason: default package */
/* loaded from: classes6.dex */
public final class dxww extends dsqw<dxww, dxwv> implements dssk {
    public static final dxww d;
    private static volatile dssr<dxww> e;
    public dxvs a;
    public dxwc b;
    public dsrj<dxwy> c;

    static {
        dxww dxwwVar = new dxww();
        d = dxwwVar;
        dsqw.cc(dxww.class, dxwwVar);
    }

    private dxww() {
        dssu<Object> dssuVar = dssu.b;
        this.c = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0000\u0003\u0000\u0000\u0001\u0006\u0003\u0000\u0001\u0000\u0001\t\u0002\t\u0006\u001b", new Object[]{"a", "b", "c", dxwy.class});
            }
            if (i2 == 3) {
                return new dxww();
            }
            if (i2 == 4) {
                return new dxwv();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dxww> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dxww.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
