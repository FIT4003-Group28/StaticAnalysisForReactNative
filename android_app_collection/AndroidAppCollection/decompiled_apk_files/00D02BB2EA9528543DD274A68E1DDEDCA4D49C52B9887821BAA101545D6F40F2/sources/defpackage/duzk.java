package defpackage;
/* compiled from: PG */
/* renamed from: duzk  reason: default package */
/* loaded from: classes6.dex */
public final class duzk extends dsqw<duzk, duzh> implements dssk {
    public static final duzk h;
    private static volatile dssr<duzk> k;
    public int a;
    public dvbb c;
    public duzo d;
    public dvbd e;
    public dsrj<duzg> f;
    public String g;
    private dulb i;
    private byte j = 2;
    public int b = 4;

    static {
        duzk duzkVar = new duzk();
        h = duzkVar;
        dsqw.cc(duzk.class, duzkVar);
    }

    private duzk() {
        dssu<Object> dssuVar = dssu.b;
        this.f = dssu.b;
        this.g = "";
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(h, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0001\u0002\u0001ᐉ\u0002\u0002ဉ\u0003\u0003ᐉ\u0001\u0005ဈ\u0005\u0006ဌ\u0000\u0007ဉ\u0004\b\u001b", new Object[]{"a", "c", "d", "i", "g", "b", duzi.a, "e", "f", duzg.class});
            }
            if (i2 == 3) {
                return new duzk();
            }
            if (i2 == 4) {
                return new duzh();
            }
            if (i2 == 5) {
                return h;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.j = b;
                return null;
            }
            dssr<duzk> dssrVar = k;
            if (dssrVar == null) {
                synchronized (duzk.class) {
                    dssrVar = k;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(h);
                        k = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.j);
    }
}
