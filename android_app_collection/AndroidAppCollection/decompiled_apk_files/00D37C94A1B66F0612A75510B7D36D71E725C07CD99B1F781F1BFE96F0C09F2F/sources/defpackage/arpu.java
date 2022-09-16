package defpackage;
/* compiled from: PG */
/* renamed from: arpu  reason: default package */
/* loaded from: classes2.dex */
public final class arpu extends aopi implements aoqv {
    public static final arpu a;
    private static volatile aorb f;
    public int b;
    public int c;
    public int d;
    public String e = "";

    static {
        arpu arpuVar = new arpu();
        a = arpuVar;
        aopi.registerDefaultInstance(arpu.class, arpuVar);
    }

    private arpu() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0000\u0001င\u0000\u0004ဌ\u0006\u0005ဈ\u0007", new Object[]{"b", "c", "d", arpt.a, "e"});
            case 3:
                return new arpu();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (arpu.class) {
                        aorbVar = f;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            f = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
