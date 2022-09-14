package defpackage;
/* compiled from: PG */
/* renamed from: dqcf  reason: default package */
/* loaded from: classes6.dex */
public final class dqcf extends dsqw<dqcf, dqce> implements dssk {
    public static final dqcf f;
    private static volatile dssr<dqcf> i;
    public int a;
    public String b = "";
    public String c = "";
    public boolean d;
    public dqch e;
    private int g;
    private boolean h;

    static {
        dqcf dqcfVar = new dqcf();
        f = dqcfVar;
        dsqw.cc(dqcf.class, dqcfVar);
    }

    private dqcf() {
    }

    public static /* synthetic */ void b(dqcf dqcfVar) {
        dqcfVar.a |= 32;
        dqcfVar.h = true;
    }

    public static /* synthetic */ void c(dqcf dqcfVar) {
        dqcfVar.a |= 4;
        dqcfVar.g = 10;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(f, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004ဇ\u0003\u0005ဉ\u0004\u0006ဇ\u0005", new Object[]{"a", "b", "c", "g", "d", "e", "h"});
            }
            if (i3 == 3) {
                return new dqcf();
            }
            if (i3 == 4) {
                return new dqce();
            }
            if (i3 == 5) {
                return f;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<dqcf> dssrVar = i;
            if (dssrVar == null) {
                synchronized (dqcf.class) {
                    dssrVar = i;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        i = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
