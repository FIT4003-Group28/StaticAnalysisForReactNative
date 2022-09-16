package defpackage;
/* compiled from: PG */
/* renamed from: asjy  reason: default package */
/* loaded from: classes2.dex */
public final class asjy extends aopi implements aoqv {
    public static final asjy a;
    private static volatile aorb f;
    public int b;
    public boolean c;
    public boolean d;
    public long e;

    static {
        asjy asjyVar = new asjy();
        a = asjyVar;
        aopi.registerDefaultInstance(asjy.class, asjyVar);
    }

    private asjy() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\n\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0003ဇ\u0002\nဂ\t", new Object[]{"b", "c", "d", "e"});
            case 3:
                return new asjy();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (asjy.class) {
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
