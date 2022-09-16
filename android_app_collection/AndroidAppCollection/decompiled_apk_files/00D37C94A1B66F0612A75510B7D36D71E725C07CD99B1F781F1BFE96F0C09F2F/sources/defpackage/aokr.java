package defpackage;
/* compiled from: PG */
/* renamed from: aokr  reason: default package */
/* loaded from: classes.dex */
public final class aokr extends aopi implements aoqv {
    public static final aokr a;
    private static volatile aorb g;
    public int b;
    public String c = "";
    public aopu d = aopi.emptyProtobufList();
    public aopu e = emptyProtobufList();
    public aomk f;

    static {
        aokr aokrVar = new aokr();
        a = aokrVar;
        aopi.registerDefaultInstance(aokr.class, aokrVar);
    }

    private aokr() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဈ\u0000\u0002\u001a\u0003\u001b\u0004ဉ\u0001", new Object[]{"b", "c", "d", "e", aolo.class, "f"});
            case 3:
                return new aokr();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (aokr.class) {
                        aorbVar = g;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            g = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
