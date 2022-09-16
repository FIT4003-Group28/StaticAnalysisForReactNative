package defpackage;
/* compiled from: PG */
/* renamed from: aqer  reason: default package */
/* loaded from: classes2.dex */
public final class aqer extends aopi implements aoqv {
    public static final aqer a;
    private static volatile aorb j;
    public int b;
    public long c;
    public float d;
    public int e;
    public int f;
    public int g;
    public long h;
    public long i;

    static {
        aqer aqerVar = new aqer();
        a = aqerVar;
        aopi.registerDefaultInstance(aqer.class, aqerVar);
    }

    private aqer() {
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
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဂ\u0000\u0002ခ\u0001\u0003င\u0002\u0004င\u0003\u0005ဌ\u0004\u0006ဂ\u0005\u0007ဂ\u0006", new Object[]{"b", "c", "d", "e", "f", "g", aqfh.o, "h", "i"});
            case 3:
                return new aqer();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = j;
                if (aorbVar == null) {
                    synchronized (aqer.class) {
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
