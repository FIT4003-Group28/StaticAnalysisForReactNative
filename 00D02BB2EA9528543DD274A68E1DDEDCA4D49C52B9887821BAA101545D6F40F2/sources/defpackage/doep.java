package defpackage;
/* compiled from: PG */
/* renamed from: doep  reason: default package */
/* loaded from: classes6.dex */
public final class doep extends dsqw<doep, doeo> implements dssk {
    public static final doep i;
    private static volatile dssr<doep> j;
    public int a;
    public String b = "";
    public dqyj c;
    public dnol d;
    public boolean e;
    public doek f;
    public dqyh g;
    public dqyd h;

    static {
        doep doepVar = new doep();
        i = doepVar;
        dsqw.cc(doep.class, doepVar);
    }

    private doep() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(i, "\u0001\u0007\u0000\u0001\u0002\u000e\u0007\u0000\u0000\u0000\u0002ဉ\u0003\u0005ဈ\u0000\u0007ဉ\u0002\bဇ\u0005\tဉ\u0006\nဉ\u0007\u000eဉ\n", new Object[]{"a", "d", "b", "c", "e", "f", "g", "h"});
            }
            if (i3 == 3) {
                return new doep();
            }
            if (i3 == 4) {
                return new doeo();
            }
            if (i3 == 5) {
                return i;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<doep> dssrVar = j;
            if (dssrVar == null) {
                synchronized (doep.class) {
                    dssrVar = j;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(i);
                        j = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
