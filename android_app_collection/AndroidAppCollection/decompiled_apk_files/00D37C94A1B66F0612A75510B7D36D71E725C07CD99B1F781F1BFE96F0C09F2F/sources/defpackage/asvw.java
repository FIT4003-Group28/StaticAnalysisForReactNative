package defpackage;
/* compiled from: PG */
/* renamed from: asvw  reason: default package */
/* loaded from: classes2.dex */
public final class asvw extends aopi implements aoqv {
    public static final asvw a;
    private static volatile aorb j;
    public int b;
    public boolean c;
    public int d;
    public int e;
    public boolean f;
    public boolean g;
    public int h;
    public boolean i;

    static {
        asvw asvwVar = new asvw();
        a = asvwVar;
        aopi.registerDefaultInstance(asvw.class, asvwVar);
    }

    private asvw() {
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
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001\u0003င\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006င\u0005\u0007ဇ\u0006", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i"});
            case 3:
                return new asvw();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = j;
                if (aorbVar == null) {
                    synchronized (asvw.class) {
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
