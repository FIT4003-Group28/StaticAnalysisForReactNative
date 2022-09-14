package defpackage;
/* compiled from: PG */
/* renamed from: dxms  reason: default package */
/* loaded from: classes6.dex */
public final class dxms extends dsqw<dxms, dxmr> implements dssk {
    public static final dxms c;
    private static volatile dssr<dxms> d;
    public int a;
    public dsok b;

    static {
        dxms dxmsVar = new dxms();
        c = dxmsVar;
        dsqw.cc(dxms.class, dxmsVar);
    }

    private dxms() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\t", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dxms();
            }
            if (i2 == 4) {
                return new dxmr();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dxms> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dxms.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
