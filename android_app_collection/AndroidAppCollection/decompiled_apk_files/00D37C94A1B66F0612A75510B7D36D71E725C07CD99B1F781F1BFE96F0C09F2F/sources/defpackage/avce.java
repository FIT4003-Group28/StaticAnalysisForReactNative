package defpackage;
/* compiled from: PG */
/* renamed from: avce  reason: default package */
/* loaded from: classes2.dex */
public final class avce extends aopi implements aoqv {
    public static final avce a;
    public static final aopg b;
    private static volatile aorb d;
    public boolean c;
    private int e;

    static {
        avce avceVar = new avce();
        a = avceVar;
        aopi.registerDefaultInstance(avce.class, avceVar);
        b = aopi.newSingularGeneratedExtension(avcj.a, avceVar, avceVar, null, 259636353, aosj.MESSAGE, avce.class);
    }

    private avce() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဇ\u0001", new Object[]{"e", "c"});
            case 3:
                return new avce();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (avce.class) {
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
