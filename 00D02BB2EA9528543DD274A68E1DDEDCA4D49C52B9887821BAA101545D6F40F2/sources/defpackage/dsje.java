package defpackage;
/* compiled from: PG */
/* renamed from: dsje  reason: default package */
/* loaded from: classes6.dex */
public final class dsje extends dsqs<dsje, dsjd> implements dsqt {
    public static final dsje a;
    private static volatile dssr<dsje> c;
    private byte b = 2;

    static {
        dsje dsjeVar = new dsje();
        a = dsjeVar;
        dsqw.cc(dsje.class, dsjeVar);
    }

    private dsje() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dsje();
            }
            if (i2 == 4) {
                return new dsjd();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                this.b = obj == null ? (byte) 0 : (byte) 1;
                return null;
            }
            dssr<dsje> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dsje.class) {
                    dssrVar = c;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        c = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.b);
    }
}
