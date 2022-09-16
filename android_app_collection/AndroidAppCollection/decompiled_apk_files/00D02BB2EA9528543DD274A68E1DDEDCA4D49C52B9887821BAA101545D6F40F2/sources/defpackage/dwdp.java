package defpackage;
/* compiled from: PG */
/* renamed from: dwdp  reason: default package */
/* loaded from: classes6.dex */
public final class dwdp extends dsqw<dwdp, dwdn> implements dssk {
    public static final dwdp d;
    private static volatile dssr<dwdp> e;
    public int a;
    public String b = "";
    public int c;

    static {
        dwdp dwdpVar = new dwdp();
        d = dwdpVar;
        dsqw.cc(dwdp.class, dwdpVar);
    }

    private dwdp() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", "c", dwdo.a});
            }
            if (i2 == 3) {
                return new dwdp();
            }
            if (i2 == 4) {
                return new dwdn();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwdp> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dwdp.class) {
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
