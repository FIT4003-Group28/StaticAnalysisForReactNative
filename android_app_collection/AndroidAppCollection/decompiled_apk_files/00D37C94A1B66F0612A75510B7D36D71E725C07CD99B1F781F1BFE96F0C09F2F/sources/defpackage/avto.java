package defpackage;
/* compiled from: PG */
/* renamed from: avto  reason: default package */
/* loaded from: classes2.dex */
public final class avto extends aopi implements aoqv {
    public static final avto a;
    private static volatile aorb d;
    public int b;
    public String c = "";

    static {
        avto avtoVar = new avto();
        a = avtoVar;
        aopi.registerDefaultInstance(avto.class, avtoVar);
    }

    private avto() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဈ\u0001", new Object[]{"b", "c"});
            case 3:
                return new avto();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (avto.class) {
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
