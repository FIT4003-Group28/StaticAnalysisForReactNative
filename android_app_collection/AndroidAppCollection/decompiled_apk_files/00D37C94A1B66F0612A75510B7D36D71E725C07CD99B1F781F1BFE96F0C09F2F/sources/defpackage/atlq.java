package defpackage;
/* compiled from: PG */
/* renamed from: atlq  reason: default package */
/* loaded from: classes2.dex */
public final class atlq extends aopi implements aoqv {
    public static final atlq a;
    private static volatile aorb d;
    public int b = 0;
    public Object c;

    static {
        atlq atlqVar = new atlq();
        a = atlqVar;
        aopi.registerDefaultInstance(atlq.class, atlqVar);
    }

    private atlq() {
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
                return newMessageInfo(a, "\u0001\u0001\u0001\u0000\uec16㡿\uec16㡿\u0001\u0000\u0000\u0000\uec16㡿ြ\u0000", new Object[]{"c", "b", apmy.class});
            case 3:
                return new atlq();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (atlq.class) {
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
