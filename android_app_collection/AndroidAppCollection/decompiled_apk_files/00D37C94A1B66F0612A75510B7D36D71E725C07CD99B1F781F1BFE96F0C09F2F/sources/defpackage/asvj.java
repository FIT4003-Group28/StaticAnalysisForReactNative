package defpackage;
/* compiled from: PG */
/* renamed from: asvj  reason: default package */
/* loaded from: classes2.dex */
public final class asvj extends aopi implements aoqv {
    public static final asvj a;
    private static volatile aorb h;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public long g;

    static {
        asvj asvjVar = new asvj();
        a = asvjVar;
        aopi.registerDefaultInstance(asvj.class, asvjVar);
    }

    private asvj() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0003င\u0003\u0004င\u0004\u0005င\u0005\u0006ဂ\u0006", new Object[]{"b", "c", asut.f, "d", "e", "f", "g"});
            case 3:
                return new asvj();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (asvj.class) {
                        aorbVar = h;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            h = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
