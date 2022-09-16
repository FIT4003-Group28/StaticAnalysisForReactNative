package defpackage;
/* compiled from: PG */
/* renamed from: bxxn  reason: default package */
/* loaded from: classes4.dex */
public final class bxxn extends dsqw<bxxn, bxxm> implements dssk {
    public static final bxxn d;
    private static volatile dssr<bxxn> e;
    public int a;
    public dsrj<dpte> b = dssu.b;
    public String c = "";

    static {
        bxxn bxxnVar = new bxxn();
        d = bxxnVar;
        dsqw.cc(bxxn.class, bxxnVar);
    }

    private bxxn() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000", new Object[]{"a", "b", dpte.class, "c"});
            }
            if (i2 == 3) {
                return new bxxn();
            }
            if (i2 == 4) {
                return new bxxm();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<bxxn> dssrVar = e;
            if (dssrVar == null) {
                synchronized (bxxn.class) {
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
