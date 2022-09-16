package defpackage;
/* compiled from: PG */
/* renamed from: aoma  reason: default package */
/* loaded from: classes.dex */
public final class aoma extends aopi implements aoqv {
    public static final aoma a;
    private static volatile aorb e;
    public int b;
    public aome c;
    public float d;

    static {
        aoma aomaVar = new aoma();
        a = aomaVar;
        aopi.registerDefaultInstance(aoma.class, aomaVar);
    }

    private aoma() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ခ\u0001", new Object[]{"b", "c", "d"});
            case 3:
                return new aoma();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (aoma.class) {
                        aorbVar = e;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            e = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
