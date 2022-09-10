package defpackage;
/* compiled from: PG */
/* renamed from: dlzg  reason: default package */
/* loaded from: classes6.dex */
public final class dlzg extends dsqw<dlzg, dlzf> implements dssk {
    public static final dlzg d;
    private static volatile dssr<dlzg> e;
    public int a;
    public int b;
    public int c;

    static {
        dlzg dlzgVar = new dlzg();
        d = dlzgVar;
        dsqw.cc(dlzg.class, dlzgVar);
    }

    private dlzg() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dlzg();
            }
            if (i2 == 4) {
                return new dlzf();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dlzg> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dlzg.class) {
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
