package defpackage;
/* compiled from: PG */
/* renamed from: aofx  reason: default package */
/* loaded from: classes.dex */
public final class aofx extends aopi implements aoqv {
    public static final aofx a;
    private static volatile aorb e;
    public String b = "";
    public int c;
    public int d;

    static {
        aofx aofxVar = new aofx();
        a = aofxVar;
        aopi.registerDefaultInstance(aofx.class, aofxVar);
    }

    private aofx() {
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
                return newMessageInfo(a, "\u0000\u0003\u0000\u0000\u0001\u0005\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\u0004\u0005\f", new Object[]{"b", "c", "d"});
            case 3:
                return new aofx();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (aofx.class) {
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
