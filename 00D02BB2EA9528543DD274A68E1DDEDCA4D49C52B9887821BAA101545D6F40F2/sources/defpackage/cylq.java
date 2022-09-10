package defpackage;
/* compiled from: PG */
/* renamed from: cylq  reason: default package */
/* loaded from: classes5.dex */
public final class cylq extends dsqw<cylq, cylp> implements dssk {
    public static final cylq d;
    private static volatile dssr<cylq> e;
    public String a = "";
    public String b = "";
    public cyjt c;

    static {
        cylq cylqVar = new cylq();
        d = cylqVar;
        dsqw.cc(cylq.class, cylqVar);
    }

    private cylq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\t", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new cylq();
            }
            if (i2 == 4) {
                return new cylp();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<cylq> dssrVar = e;
            if (dssrVar == null) {
                synchronized (cylq.class) {
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
