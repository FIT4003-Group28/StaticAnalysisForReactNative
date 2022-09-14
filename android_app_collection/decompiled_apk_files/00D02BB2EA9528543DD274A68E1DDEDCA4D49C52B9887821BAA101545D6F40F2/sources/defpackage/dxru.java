package defpackage;
/* compiled from: PG */
/* renamed from: dxru  reason: default package */
/* loaded from: classes6.dex */
public final class dxru extends dsqw<dxru, dxrt> implements dssk {
    public static final dxru d;
    private static volatile dssr<dxru> e;
    public String a = "";
    public dugy b;
    public dugy c;

    static {
        dxru dxruVar = new dxru();
        d = dxruVar;
        dsqw.cc(dxru.class, dxruVar);
    }

    private dxru() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\t\u0003\t", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dxru();
            }
            if (i2 == 4) {
                return new dxrt();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dxru> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dxru.class) {
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
