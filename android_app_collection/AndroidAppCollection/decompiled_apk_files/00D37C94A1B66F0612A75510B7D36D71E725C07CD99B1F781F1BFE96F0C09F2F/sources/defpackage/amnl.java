package defpackage;
/* compiled from: PG */
/* renamed from: amnl  reason: default package */
/* loaded from: classes.dex */
public final class amnl extends aopi implements aoqv {
    public static final amnl a;
    private static volatile aorb f;
    public int b;
    public amnn c;
    public aopu d = emptyProtobufList();
    public amnv e;

    static {
        amnl amnlVar = new amnl();
        a = amnlVar;
        aopi.registerDefaultInstance(amnl.class, amnlVar);
    }

    private amnl() {
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
                return newMessageInfo(a, "\u0000\u0004\u0000\u0000\u0001\u0007\u0004\u0000\u0001\u0000\u0001\t\u0002\u001b\u0004\f\u0007\t", new Object[]{"c", "d", amnw.class, "b", "e"});
            case 3:
                return new amnl();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (amnl.class) {
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
