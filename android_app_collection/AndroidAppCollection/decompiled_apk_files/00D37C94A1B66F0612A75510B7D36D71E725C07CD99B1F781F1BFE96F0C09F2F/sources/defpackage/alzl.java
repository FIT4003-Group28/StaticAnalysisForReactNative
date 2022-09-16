package defpackage;
/* compiled from: PG */
/* renamed from: alzl  reason: default package */
/* loaded from: classes.dex */
public final class alzl extends aopi implements aoqv {
    public static final alzl a;
    private static volatile aorb e;
    public aopu b = emptyProtobufList();
    public aopq c = emptyIntList();
    public boolean d;

    static {
        alzl alzlVar = new alzl();
        a = alzlVar;
        aopi.registerDefaultInstance(alzl.class, alzlVar);
    }

    private alzl() {
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
                return newMessageInfo(a, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u001b\u0002'\u0003\u0007", new Object[]{"b", alzk.class, "c", "d"});
            case 3:
                return new alzl();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (alzl.class) {
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
