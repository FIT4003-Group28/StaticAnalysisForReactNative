package defpackage;
/* compiled from: PG */
/* renamed from: dmem  reason: default package */
/* loaded from: classes6.dex */
public final class dmem extends dsqw<dmem, dmel> implements dssk {
    public static final dmem b;
    public static final dsqv<dmfu, dmem> c;
    private static volatile dssr<dmem> d;
    public dsrj<dmek> a = dssu.b;

    static {
        dmem dmemVar = new dmem();
        b = dmemVar;
        dsqw.cc(dmem.class, dmemVar);
        c = dsqw.newSingularGeneratedExtension(dmfu.e, dmemVar, dmemVar, null, 1004, dsur.MESSAGE, dmem.class);
    }

    private dmem() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", dmek.class});
            }
            if (i2 == 3) {
                return new dmem();
            }
            if (i2 == 4) {
                return new dmel();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dmem> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dmem.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
