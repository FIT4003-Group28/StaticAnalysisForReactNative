package defpackage;
/* compiled from: PG */
/* renamed from: apfq  reason: default package */
/* loaded from: classes.dex */
public final class apfq extends aopi implements aoqv {
    public static final apfq a;
    private static volatile aorb d;
    public int b;
    public apfz c;

    static {
        apfq apfqVar = new apfq();
        a = apfqVar;
        aopi.registerDefaultInstance(apfq.class, apfqVar);
    }

    private apfq() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\ue0e9™\ue0e9™\u0001\u0000\u0000\u0000\ue0e9™ဉ\u0000", new Object[]{"b", "c"});
            case 3:
                return new apfq();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (apfq.class) {
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
