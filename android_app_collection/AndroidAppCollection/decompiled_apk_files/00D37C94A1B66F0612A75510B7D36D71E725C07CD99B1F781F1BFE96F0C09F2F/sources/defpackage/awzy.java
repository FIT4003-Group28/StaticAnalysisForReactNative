package defpackage;
/* compiled from: PG */
/* renamed from: awzy  reason: default package */
/* loaded from: classes2.dex */
public final class awzy extends aopi implements aoqv {
    public static final awzy a;
    private static volatile aorb i;
    public int b;
    public awzs c;
    public String d = "";
    public String e = "";
    public String f = "";
    public awzx g;
    public int h;

    static {
        awzy awzyVar = new awzy();
        a = awzyVar;
        aopi.registerDefaultInstance(awzy.class, awzyVar);
    }

    private awzy() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဈ\u0003\u0006ဉ\u0004\u0007ဌ\u0005", new Object[]{"b", "c", "d", "e", "f", "g", "h", awzz.a()});
            case 3:
                return new awzy();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = i;
                if (aorbVar == null) {
                    synchronized (awzy.class) {
                        aorbVar = i;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            i = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
