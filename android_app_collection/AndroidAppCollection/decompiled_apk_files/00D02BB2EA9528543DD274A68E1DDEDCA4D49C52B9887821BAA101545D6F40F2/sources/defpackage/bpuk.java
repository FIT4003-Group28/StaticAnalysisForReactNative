package defpackage;
/* compiled from: PG */
/* renamed from: bpuk  reason: default package */
/* loaded from: classes4.dex */
public final class bpuk extends dsqw<bpuk, bpuj> implements dssk {
    public static final bpuk c;
    private static volatile dssr<bpuk> e;
    public dsrj<digh> a = dssu.b;
    public boolean b;
    private int d;

    static {
        bpuk bpukVar = new bpuk();
        c = bpukVar;
        dsqw.cc(bpuk.class, bpukVar);
    }

    private bpuk() {
    }

    public static /* synthetic */ void c(bpuk bpukVar) {
        bpukVar.d |= 1;
        bpukVar.b = true;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဇ\u0000", new Object[]{"d", "a", digh.class, "b"});
            }
            if (i2 == 3) {
                return new bpuk();
            }
            if (i2 == 4) {
                return new bpuj();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<bpuk> dssrVar = e;
            if (dssrVar == null) {
                synchronized (bpuk.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }

    public final void b() {
        dsrj<digh> dsrjVar = this.a;
        if (!dsrjVar.a()) {
            this.a = dsqw.cl(dsrjVar);
        }
    }
}
