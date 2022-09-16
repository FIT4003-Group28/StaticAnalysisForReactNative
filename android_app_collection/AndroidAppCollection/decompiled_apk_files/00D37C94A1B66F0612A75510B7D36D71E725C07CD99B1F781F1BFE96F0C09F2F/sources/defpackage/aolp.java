package defpackage;
/* compiled from: PG */
/* renamed from: aolp  reason: default package */
/* loaded from: classes.dex */
public final class aolp extends aopi implements aoqv {
    public static final aolp a;
    private static volatile aorb f;
    public int b;
    public Object d;
    public int c = 0;
    public String e = "";

    static {
        aolp aolpVar = new aolp();
        a = aolpVar;
        aopi.registerDefaultInstance(aolp.class, aolpVar);
    }

    private aolp() {
        aopi.emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0003\u0001\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ြ\u0000\u0002ဿ\u0000\u0004ဈ\u0002", new Object[]{"d", "c", "b", aolo.class, aoix.t, "e"});
            case 3:
                return new aolp();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (aolp.class) {
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
