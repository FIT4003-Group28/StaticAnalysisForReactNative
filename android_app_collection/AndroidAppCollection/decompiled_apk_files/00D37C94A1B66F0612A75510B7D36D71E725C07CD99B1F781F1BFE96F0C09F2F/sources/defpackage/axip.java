package defpackage;
/* compiled from: PG */
/* renamed from: axip  reason: default package */
/* loaded from: classes2.dex */
public final class axip extends aopi implements aoqv {
    public static final axip a;
    private static volatile aorb e;
    public boolean b;
    public int c;
    public String d = "";
    private int f;

    static {
        axip axipVar = new axip();
        a = axipVar;
        aopi.registerDefaultInstance(axip.class, axipVar);
    }

    private axip() {
        emptyProtobufList();
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001\u0003ဈ\u0002", new Object[]{"f", "b", "c", "d"});
            case 3:
                return new axip();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (axip.class) {
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
