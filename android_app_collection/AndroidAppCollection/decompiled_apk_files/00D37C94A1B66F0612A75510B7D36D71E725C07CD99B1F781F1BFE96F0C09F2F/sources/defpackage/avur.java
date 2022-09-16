package defpackage;
/* compiled from: PG */
/* renamed from: avur  reason: default package */
/* loaded from: classes2.dex */
public final class avur extends aopi implements aoqv {
    public static final avur a;
    private static volatile aorb d;
    public int b;
    public avia c;

    static {
        avur avurVar = new avur();
        a = avurVar;
        aopi.registerDefaultInstance(avur.class, avurVar);
    }

    private avur() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\uec98\u218a\uec98\u218a\u0001\u0000\u0000\u0000\uec98\u218aဉ\u0001", new Object[]{"b", "c"});
            case 3:
                return new avur();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (avur.class) {
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
