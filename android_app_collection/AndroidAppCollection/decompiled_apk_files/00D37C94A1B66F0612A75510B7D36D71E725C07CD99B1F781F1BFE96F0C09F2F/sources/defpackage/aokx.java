package defpackage;
/* compiled from: PG */
/* renamed from: aokx  reason: default package */
/* loaded from: classes.dex */
public final class aokx extends aopi implements aoqv {
    public static final aokx a;
    private static volatile aorb g;
    public int b;
    public String c = "";
    public aolo d;
    public aolh e;
    public aomk f;

    static {
        aokx aokxVar = new aokx();
        a = aokxVar;
        aopi.registerDefaultInstance(aokx.class, aokxVar);
    }

    private aokx() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0003ဉ\u0001\u0004ဉ\u0002\u0005ဉ\u0003", new Object[]{"b", "c", "d", "e", "f"});
            case 3:
                return new aokx();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (aokx.class) {
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
