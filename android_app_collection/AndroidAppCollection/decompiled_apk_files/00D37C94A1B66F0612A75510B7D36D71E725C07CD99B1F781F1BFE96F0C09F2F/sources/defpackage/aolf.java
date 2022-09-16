package defpackage;
/* compiled from: PG */
/* renamed from: aolf  reason: default package */
/* loaded from: classes.dex */
public final class aolf extends aopi implements aoqv {
    public static final aolf a;
    private static volatile aorb e;
    public int b;
    public aoki c;
    public int d;

    static {
        aolf aolfVar = new aolf();
        a = aolfVar;
        aopi.registerDefaultInstance(aolf.class, aolfVar);
    }

    private aolf() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0001", new Object[]{"b", "c", "d", aoli.b});
            case 3:
                return new aolf();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (aolf.class) {
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
