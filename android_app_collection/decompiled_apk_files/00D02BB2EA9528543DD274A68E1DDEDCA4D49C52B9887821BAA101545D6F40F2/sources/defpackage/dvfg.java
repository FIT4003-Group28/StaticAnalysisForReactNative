package defpackage;
/* compiled from: PG */
/* renamed from: dvfg  reason: default package */
/* loaded from: classes6.dex */
public final class dvfg extends dsqw<dvfg, dvff> implements dssk {
    public static final dvfg e;
    private static volatile dssr<dvfg> g;
    public int a;
    public dvfe c;
    public dlug d;
    private byte f = 2;
    public dspd b = dspd.b;

    static {
        dvfg dvfgVar = new dvfg();
        e = dvfgVar;
        dsqw.cc(dvfg.class, dvfgVar);
    }

    private dvfg() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0002\u0001ည\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new dvfg();
            }
            if (i2 == 4) {
                return new dvff();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.f = b;
                return null;
            }
            dssr<dvfg> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dvfg.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.f);
    }
}
