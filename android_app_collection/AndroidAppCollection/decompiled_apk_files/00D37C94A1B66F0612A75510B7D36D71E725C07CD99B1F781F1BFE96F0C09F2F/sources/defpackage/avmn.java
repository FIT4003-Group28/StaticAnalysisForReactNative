package defpackage;
/* compiled from: PG */
/* renamed from: avmn  reason: default package */
/* loaded from: classes2.dex */
public final class avmn extends aopi implements aoqv {
    public static final avmn a;
    private static volatile aorb c;
    public int b;
    private int d;

    static {
        avmn avmnVar = new avmn();
        a = avmnVar;
        aopi.registerDefaultInstance(avmn.class, avmnVar);
    }

    private avmn() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"d", "b"});
            case 3:
                return new avmn();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = c;
                if (aorbVar == null) {
                    synchronized (avmn.class) {
                        aorbVar = c;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            c = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
