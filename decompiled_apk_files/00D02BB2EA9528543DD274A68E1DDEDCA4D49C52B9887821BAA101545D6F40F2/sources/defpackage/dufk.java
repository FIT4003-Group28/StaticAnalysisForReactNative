package defpackage;
/* compiled from: PG */
/* renamed from: dufk  reason: default package */
/* loaded from: classes6.dex */
public final class dufk extends dsqw<dufk, dufj> implements dssk {
    public static final dufk i;
    private static volatile dssr<dufk> k;
    public dufu b;
    public dayr g;
    private int j;
    public String a = "";
    public dsrj<dufi> c = dssu.b;
    public dsrj<duga> d = dssu.b;
    public dsrj<duet> e = dssu.b;
    public dsrj<dufy> f = dssu.b;
    public dsrj<dufg> h = dssu.b;

    static {
        dufk dufkVar = new dufk();
        i = dufkVar;
        dsqw.cc(dufk.class, dufkVar);
    }

    private dufk() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(i, "\u0001\b\u0000\u0001\u0001.\b\u0000\u0005\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003\u001b\u0004\u001b\n\u001b\f\u001b&ဉ\u0002.\u001b", new Object[]{"j", "a", "b", "c", dufi.class, "d", duga.class, "e", duet.class, "f", dufy.class, "g", "h", dufg.class});
            }
            if (i3 == 3) {
                return new dufk();
            }
            if (i3 == 4) {
                return new dufj();
            }
            if (i3 == 5) {
                return i;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<dufk> dssrVar = k;
            if (dssrVar == null) {
                synchronized (dufk.class) {
                    dssrVar = k;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(i);
                        k = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
