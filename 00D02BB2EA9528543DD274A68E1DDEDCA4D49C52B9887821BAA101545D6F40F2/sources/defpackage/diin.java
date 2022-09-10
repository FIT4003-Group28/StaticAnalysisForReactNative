package defpackage;
/* compiled from: PG */
/* renamed from: diin  reason: default package */
/* loaded from: classes.dex */
public final class diin extends dsqw<diin, diig> implements dssk {
    public static final diin h;
    private static volatile dssr<diin> i;
    public int a;
    public diik d;
    public int f;
    public dpsf g;
    public String b = "";
    public String c = "";
    public dsrj<dhxu> e = dssu.b;

    static {
        diin diinVar = new diin();
        h = diinVar;
        dsqw.cc(diin.class, diinVar);
    }

    private diin() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(h, "\u0001\u0006\u0000\u0001\u0001\t\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0004\u001b\u0006ဌ\u0004\bဉ\u0002\tဉ\u0005", new Object[]{"a", "b", "c", "e", dhxu.class, "f", diil.a, "d", "g"});
            }
            if (i3 == 3) {
                return new diin();
            }
            if (i3 == 4) {
                return new diig();
            }
            if (i3 == 5) {
                return h;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<diin> dssrVar = i;
            if (dssrVar == null) {
                synchronized (diin.class) {
                    dssrVar = i;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(h);
                        i = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
