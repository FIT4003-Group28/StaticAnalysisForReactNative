package defpackage;
/* compiled from: PG */
/* renamed from: dxob  reason: default package */
/* loaded from: classes6.dex */
public final class dxob extends dsqw<dxob, dxoa> implements dssk {
    public static final dxob b;
    private static volatile dssr<dxob> c;
    public String a = "";

    static {
        dxob dxobVar = new dxob();
        b = dxobVar;
        dsqw.cc(dxob.class, dxobVar);
    }

    private dxob() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"a"});
            }
            if (i2 == 3) {
                return new dxob();
            }
            if (i2 == 4) {
                return new dxoa();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dxob> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dxob.class) {
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
