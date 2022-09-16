package defpackage;
/* compiled from: PG */
/* renamed from: asjz  reason: default package */
/* loaded from: classes2.dex */
public final class asjz extends aopi implements aoqv {
    public static final asjz a;
    private static volatile aorb g;
    public int b;
    public asjy c;
    public asju d;
    public asjw e;
    public asjv f;

    static {
        asjz asjzVar = new asjz();
        a = asjzVar;
        aopi.registerDefaultInstance(asjz.class, asjzVar);
    }

    private asjz() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0002\u0005\u0004\u0000\u0000\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004", new Object[]{"b", "c", "d", "e", "f"});
            case 3:
                return new asjz();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (asjz.class) {
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
