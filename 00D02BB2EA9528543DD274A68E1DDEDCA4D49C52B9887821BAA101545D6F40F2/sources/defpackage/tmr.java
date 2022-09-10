package defpackage;
/* compiled from: PG */
/* renamed from: tmr  reason: default package */
/* loaded from: classes7.dex */
public final class tmr extends dsqw<tmr, tmj> implements dssk {
    public static final tmr h;
    private static volatile dssr<tmr> j;
    public int a;
    public dwbc b;
    public dwaw c;
    public long d;
    public boolean g;
    private byte i = 2;
    public dsrj<tmq> e = dssu.b;
    public String f = "";

    static {
        tmr tmrVar = new tmr();
        h = tmrVar;
        dsqw.cc(tmr.class, tmrVar);
    }

    private tmr() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0002\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ဂ\u0002\u0004\u001b\u0005ဈ\u0003\u0006ဇ\u0004", new Object[]{"a", "b", "c", "d", "e", tmq.class, "f", "g"});
            }
            if (i2 == 3) {
                return new tmr();
            }
            if (i2 == 4) {
                return new tmj();
            }
            if (i2 == 5) {
                return h;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.i = b;
                return null;
            }
            dssr<tmr> dssrVar = j;
            if (dssrVar == null) {
                synchronized (tmr.class) {
                    dssrVar = j;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(h);
                        j = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.i);
    }
}
