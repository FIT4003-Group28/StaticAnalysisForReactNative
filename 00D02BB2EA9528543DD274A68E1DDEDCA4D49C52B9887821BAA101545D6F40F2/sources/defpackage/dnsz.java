package defpackage;
/* compiled from: PG */
/* renamed from: dnsz  reason: default package */
/* loaded from: classes6.dex */
public final class dnsz extends dsqw<dnsz, dnsy> implements dssk {
    public static final dnsz h;
    private static volatile dssr<dnsz> i;
    public int a;
    public dnsr b;
    public doud c;
    public int d;
    public long e;
    public dnsr f;
    public dnsr g;

    static {
        dnsz dnszVar = new dnsz();
        h = dnszVar;
        dsqw.cc(dnsz.class, dnszVar);
    }

    private dnsz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(h, "\u0001\u0006\u0000\u0001\u0001\u0012\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003စ\u0003\u0004ဉ\u0004\u0005ဉ\u0005\u0012ဌ\u0002", new Object[]{"a", "b", "c", "e", "f", "g", "d", dnez.a});
            }
            if (i3 == 3) {
                return new dnsz();
            }
            if (i3 == 4) {
                return new dnsy();
            }
            if (i3 == 5) {
                return h;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<dnsz> dssrVar = i;
            if (dssrVar == null) {
                synchronized (dnsz.class) {
                    dssrVar = i;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(h);
                        i = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
