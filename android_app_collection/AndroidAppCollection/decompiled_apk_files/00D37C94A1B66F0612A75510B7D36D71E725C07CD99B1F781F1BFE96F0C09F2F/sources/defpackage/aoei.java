package defpackage;
/* compiled from: PG */
/* renamed from: aoei  reason: default package */
/* loaded from: classes.dex */
public final class aoei extends aopi implements aoqv {
    public static final aoei a;
    private static volatile aorb d;
    public int b = 0;
    public Object c;

    static {
        aoei aoeiVar = new aoei();
        a = aoeiVar;
        aopi.registerDefaultInstance(aoei.class, aoeiVar);
    }

    private aoei() {
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
                return newMessageInfo(a, "\u0001\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001ျ\u0000\u0002့\u0000\u0003်\u0000", new Object[]{"c", "b"});
            case 3:
                return new aoei();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (aoei.class) {
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
