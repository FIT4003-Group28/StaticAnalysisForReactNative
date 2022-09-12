package defpackage;
/* compiled from: PG */
/* renamed from: dwsk  reason: default package */
/* loaded from: classes6.dex */
public final class dwsk extends dsqw<dwsk, dwsj> implements dssk {
    public static final dwsk a;
    private static volatile dssr<dwsk> b;

    static {
        dwsk dwskVar = new dwsk();
        a = dwskVar;
        dsqw.cc(dwsk.class, dwskVar);
    }

    private dwsk() {
        dssu<Object> dssuVar = dssu.b;
        dspd dspdVar = dspd.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dwsk();
            }
            if (i2 == 4) {
                return new dwsj();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwsk> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dwsk.class) {
                    dssrVar = b;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        b = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
