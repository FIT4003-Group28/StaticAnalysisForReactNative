package defpackage;
/* compiled from: PG */
/* renamed from: adzr  reason: default package */
/* loaded from: classes.dex */
public final class adzr extends aopi implements aoqv {
    public static final adzr a;
    private static volatile aorb b;

    static {
        adzr adzrVar = new adzr();
        a = adzrVar;
        aopi.registerDefaultInstance(adzr.class, adzrVar);
    }

    private adzr() {
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
                return newMessageInfo(a, "\u0001\u0000", null);
            case 3:
                return new adzr();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (adzr.class) {
                        aorbVar = b;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            b = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
