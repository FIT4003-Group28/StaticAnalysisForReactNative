package defpackage;
/* compiled from: PG */
/* renamed from: aqnl  reason: default package */
/* loaded from: classes2.dex */
public final class aqnl extends aopi implements aoqv {
    public static final aqnl a;
    private static volatile aorb h;
    public int b;
    public int d;
    public int f;
    public boolean g;
    public String c = "";
    public String e = "";

    static {
        aqnl aqnlVar = new aqnl();
        a = aqnlVar;
        aopi.registerDefaultInstance(aqnl.class, aqnlVar);
    }

    private aqnl() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        switch (aophVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003ဈ\u0002\u0004ဌ\u0003\u0005ဇ\u0004", new Object[]{"b", "c", "d", attl.a(), "e", "f", attj.a(), "g"});
            case 3:
                return new aqnl();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (aqnl.class) {
                        aorbVar = h;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            h = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
