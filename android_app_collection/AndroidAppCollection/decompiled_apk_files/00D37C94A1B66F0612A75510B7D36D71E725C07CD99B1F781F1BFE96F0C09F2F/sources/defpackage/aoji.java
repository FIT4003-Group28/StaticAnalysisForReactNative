package defpackage;
/* compiled from: PG */
/* renamed from: aoji  reason: default package */
/* loaded from: classes.dex */
public final class aoji extends aopi implements aoqv {
    public static final aoji a;
    private static volatile aorb j;
    public int b;
    public long c;
    public long d;
    public long e;
    public long f;
    public long g;
    public long h;
    public int i;

    static {
        aoji aojiVar = new aoji();
        a = aojiVar;
        aopi.registerDefaultInstance(aoji.class, aojiVar);
    }

    private aoji() {
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
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဌ\u0006", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", aojh.b()});
            case 3:
                return new aoji();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = j;
                if (aorbVar == null) {
                    synchronized (aoji.class) {
                        aorbVar = j;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            j = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
