package defpackage;
/* compiled from: PG */
/* renamed from: aokn  reason: default package */
/* loaded from: classes.dex */
public final class aokn extends aopi implements aoqv {
    public static final aokn a;
    private static volatile aorb f;
    public int b;
    public String c = "";
    public aopu d = emptyProtobufList();
    public aomk e;

    static {
        aokn aoknVar = new aokn();
        a = aoknVar;
        aopi.registerDefaultInstance(aokn.class, aoknVar);
    }

    private aokn() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0004ဉ\u0002", new Object[]{"b", "c", "d", aokm.class, "e"});
            case 3:
                return new aokn();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (aokn.class) {
                        aorbVar = f;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            f = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
