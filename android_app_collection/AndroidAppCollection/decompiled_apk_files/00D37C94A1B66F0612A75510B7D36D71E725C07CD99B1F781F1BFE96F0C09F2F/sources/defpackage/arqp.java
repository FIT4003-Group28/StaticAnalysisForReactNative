package defpackage;
/* compiled from: PG */
/* renamed from: arqp  reason: default package */
/* loaded from: classes2.dex */
public final class arqp extends aopi implements aoqv {
    public static final arqp a;
    private static volatile aorb e;
    public int b;
    public int c;
    public int d;

    static {
        arqp arqpVar = new arqp();
        a = arqpVar;
        aopi.registerDefaultInstance(arqp.class, arqpVar);
    }

    private arqp() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"b", "c", "d"});
            case 3:
                return new arqp();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (arqp.class) {
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
