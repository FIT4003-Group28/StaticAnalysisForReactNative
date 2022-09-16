package defpackage;
/* compiled from: PG */
/* renamed from: aokt  reason: default package */
/* loaded from: classes.dex */
public final class aokt extends aopi implements aoqv {
    public static final aokt a;
    private static volatile aorb i;
    public int b;
    public String c = "";
    public aolp d;
    public long e;
    public aolm f;
    public int g;
    public aomk h;

    static {
        aokt aoktVar = new aokt();
        a = aoktVar;
        aopi.registerDefaultInstance(aokt.class, aoktVar);
    }

    private aokt() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\n\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0005ဂ\u0002\u0007ဉ\u0001\bဉ\u0004\tဌ\u0005\nဉ\u0006", new Object[]{"b", "c", "e", "d", "f", "g", aomb.b(), "h"});
            case 3:
                return new aokt();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = i;
                if (aorbVar == null) {
                    synchronized (aokt.class) {
                        aorbVar = i;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            i = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
