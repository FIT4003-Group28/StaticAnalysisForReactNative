package defpackage;
/* compiled from: PG */
/* renamed from: aofq  reason: default package */
/* loaded from: classes.dex */
public final class aofq extends aopi implements aoqv {
    public static final aofq a;
    private static volatile aorb d;
    public String b = "";
    public boolean c;

    static {
        aofq aofqVar = new aofq();
        a = aofqVar;
        aopi.registerDefaultInstance(aofq.class, aofqVar);
    }

    private aofq() {
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
                return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\u0007", new Object[]{"b", "c"});
            case 3:
                return new aofq();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (aofq.class) {
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
