package defpackage;
/* compiled from: PG */
/* renamed from: aqlf  reason: default package */
/* loaded from: classes2.dex */
public final class aqlf extends aopi implements aoqv {
    public static final aqlf a;
    private static volatile aorb f;
    public int b;
    public int c;
    public int d;
    public aqlg e;

    static {
        aqlf aqlfVar = new aqlf();
        a = aqlfVar;
        aopi.registerDefaultInstance(aqlf.class, aqlfVar);
    }

    private aqlf() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0000\u0000\u0002င\u0000\u0003င\u0001\u0004ဉ\u0002", new Object[]{"b", "c", "d", "e"});
            case 3:
                return new aqlf();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (aqlf.class) {
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
