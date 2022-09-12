package defpackage;
/* compiled from: PG */
/* renamed from: dtra  reason: default package */
/* loaded from: classes6.dex */
public final class dtra extends dsqw<dtra, dtqx> implements dssk {
    public static final dtra i;
    private static volatile dssr<dtra> k;
    public int a;
    public boolean c;
    public int d;
    public dvyw e;
    public dthb f;
    private byte j = 2;
    public dsrj<dhyo> b = dssu.b;
    public String g = "";
    public dsrj<dtqz> h = dssu.b;

    static {
        dtra dtraVar = new dtra();
        i = dtraVar;
        dsqw.cc(dtra.class, dtraVar);
    }

    private dtra() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            byte b = 1;
            if (i3 == 2) {
                return cd(i, "\u0001\u0007\u0000\u0001\u0001\n\u0007\u0000\u0002\u0002\u0001\u001b\u0002ဇ\u0000\u0003ဌ\u0001\u0005ᐉ\u0004\u0006ᐉ\u0005\u0007ဈ\u0006\n\u001b", new Object[]{"a", "b", dhyo.class, "c", "d", dhyq.c(), "e", "f", "g", "h", dtqz.class});
            }
            if (i3 == 3) {
                return new dtra();
            }
            if (i3 == 4) {
                return new dtqx();
            }
            if (i3 == 5) {
                return i;
            }
            if (i3 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.j = b;
                return null;
            }
            dssr<dtra> dssrVar = k;
            if (dssrVar == null) {
                synchronized (dtra.class) {
                    dssrVar = k;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(i);
                        k = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.j);
    }
}
