package defpackage;
/* compiled from: PG */
/* renamed from: dttd  reason: default package */
/* loaded from: classes6.dex */
public final class dttd extends dsqw<dttd, dtta> implements dssk {
    public static final dttd d;
    private static volatile dssr<dttd> e;
    public dttc a;
    public int b;
    public dsrf c = dsqz.b;

    static {
        dttd dttdVar = new dttd();
        d = dttdVar;
        dsqw.cc(dttd.class, dttdVar);
    }

    private dttd() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0000\u0003\u0000\u0000\u0001\u0004\u0003\u0000\u0001\u0000\u0001\t\u0003\f\u0004,", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dttd();
            }
            if (i2 == 4) {
                return new dtta();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dttd> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dttd.class) {
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
