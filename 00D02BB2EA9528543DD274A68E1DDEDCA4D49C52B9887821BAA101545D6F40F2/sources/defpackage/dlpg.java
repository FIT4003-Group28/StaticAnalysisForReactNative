package defpackage;
/* compiled from: PG */
/* renamed from: dlpg  reason: default package */
/* loaded from: classes6.dex */
public final class dlpg extends dsqw<dlpg, dlpf> implements dssk {
    public static final dlpg d;
    private static volatile dssr<dlpg> e;
    public int a;
    public int b;
    public dsrj<dspd> c = dssu.b;

    static {
        dlpg dlpgVar = new dlpg();
        d = dlpgVar;
        dsqw.cc(dlpg.class, dlpgVar);
    }

    private dlpg() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001c", new Object[]{"a", "b", dluy.c(), "c"});
            }
            if (i2 == 3) {
                return new dlpg();
            }
            if (i2 == 4) {
                return new dlpf();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dlpg> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dlpg.class) {
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
