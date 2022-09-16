package defpackage;
/* compiled from: PG */
/* renamed from: avgi  reason: default package */
/* loaded from: classes2.dex */
public final class avgi extends aopi implements aoqv {
    public static final avgi a;
    private static volatile aorb e;
    public int b;
    public aoqp d = aoqp.a;
    public String c = "";

    static {
        avgi avgiVar = new avgi();
        a = avgiVar;
        aopi.registerDefaultInstance(avgi.class, avgiVar);
    }

    private avgi() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0001\u0000\u0000\u00022\u0003ဈ\u0001", new Object[]{"b", "d", avgh.a, "c"});
            case 3:
                return new avgi();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (avgi.class) {
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
