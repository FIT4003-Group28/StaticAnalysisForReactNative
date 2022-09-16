package defpackage;
/* compiled from: PG */
/* renamed from: awrs  reason: default package */
/* loaded from: classes2.dex */
public final class awrs extends aopi implements aoqv {
    public static final awrs a;
    private static volatile aorb f;
    public int b;
    public aopl c;
    public aopl d;
    public int e;

    static {
        awrs awrsVar = new awrs();
        a = awrsVar;
        aopi.registerDefaultInstance(awrs.class, awrsVar);
    }

    private awrs() {
        emptyDoubleList();
        this.c = emptyDoubleList();
        this.d = emptyDoubleList();
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0002\u0000\u0002\u0012\u0003\u0012\u0004ဋ\u0000", new Object[]{"b", "c", "d", "e"});
            case 3:
                return new awrs();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (awrs.class) {
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
