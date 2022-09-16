package defpackage;
/* compiled from: PG */
/* renamed from: aqox  reason: default package */
/* loaded from: classes2.dex */
public final class aqox extends aopi implements aoqv {
    public static final aqox a;
    private static volatile aorb d;
    public int b;
    public int c;

    static {
        aqox aqoxVar = new aqox();
        a = aqoxVar;
        aopi.registerDefaultInstance(aqox.class, aqoxVar);
    }

    private aqox() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"b", "c", aqow.a()});
            case 3:
                return new aqox();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (aqox.class) {
                        aorbVar = d;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            d = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
