package defpackage;
/* compiled from: PG */
/* renamed from: awnt  reason: default package */
/* loaded from: classes2.dex */
public final class awnt extends aopi implements aoqv {
    public static final awnt a;
    private static volatile aorb f;
    public int d;
    private int g;
    public String b = "";
    public aoob c = aoob.b;
    public String e = "";

    static {
        awnt awntVar = new awnt();
        a = awntVar;
        aopi.registerDefaultInstance(awnt.class, awntVar);
    }

    private awnt() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003ဌ\u0002\u0004ဈ\u0003", new Object[]{"g", "b", "c", "d", awkk.o, "e"});
            case 3:
                return new awnt();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (awnt.class) {
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
