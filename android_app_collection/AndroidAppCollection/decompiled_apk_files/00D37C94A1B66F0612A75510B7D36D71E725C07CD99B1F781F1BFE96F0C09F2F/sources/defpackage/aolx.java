package defpackage;
/* compiled from: PG */
/* renamed from: aolx  reason: default package */
/* loaded from: classes.dex */
public final class aolx extends aopi implements aoqv {
    public static final aolx a;
    private static volatile aorb g;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    private int h;

    static {
        aolx aolxVar = new aolx();
        a = aolxVar;
        aopi.registerDefaultInstance(aolx.class, aolxVar);
    }

    private aolx() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004", new Object[]{"h", "b", "c", "d", "e", "f"});
            case 3:
                return new aolx();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (aolx.class) {
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
