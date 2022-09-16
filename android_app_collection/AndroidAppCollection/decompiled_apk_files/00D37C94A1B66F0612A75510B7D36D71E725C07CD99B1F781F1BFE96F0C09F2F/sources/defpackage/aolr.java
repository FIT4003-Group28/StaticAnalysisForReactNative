package defpackage;
/* compiled from: PG */
/* renamed from: aolr  reason: default package */
/* loaded from: classes.dex */
public final class aolr extends aopi implements aoqv {
    public static final aolr a;
    private static volatile aorb b;

    static {
        aolr aolrVar = new aolr();
        a = aolrVar;
        aopi.registerDefaultInstance(aolr.class, aolrVar);
    }

    private aolr() {
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
                return new aolr();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (aolr.class) {
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
