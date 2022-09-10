package defpackage;
/* compiled from: PG */
/* renamed from: bpct  reason: default package */
/* loaded from: classes3.dex */
public final class bpct extends dsqw<bpct, bpcs> implements dssk {
    public static final bpct d;
    private static volatile dssr<bpct> e;
    public int a;
    public dsrj<dikx> b = dssu.b;
    public dpum c;

    static {
        bpct bpctVar = new bpct();
        d = bpctVar;
        dsqw.cc(bpct.class, bpctVar);
    }

    private bpct() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"a", "b", dikx.class, "c"});
            }
            if (i2 == 3) {
                return new bpct();
            }
            if (i2 == 4) {
                return new bpcs();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<bpct> dssrVar = e;
            if (dssrVar == null) {
                synchronized (bpct.class) {
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
