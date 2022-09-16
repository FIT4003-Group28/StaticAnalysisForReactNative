package defpackage;
/* compiled from: PG */
/* renamed from: benb  reason: default package */
/* loaded from: classes3.dex */
public final class benb extends dsqw<benb, bena> implements dssk {
    public static final benb b;
    private static volatile dssr<benb> c;
    public dsrj<dqob> a = dssu.b;

    static {
        benb benbVar = new benb();
        b = benbVar;
        dsqw.cc(benb.class, benbVar);
    }

    private benb() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", dqob.class});
            }
            if (i2 == 3) {
                return new benb();
            }
            if (i2 == 4) {
                return new bena();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<benb> dssrVar = c;
            if (dssrVar == null) {
                synchronized (benb.class) {
                    dssrVar = c;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        c = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
