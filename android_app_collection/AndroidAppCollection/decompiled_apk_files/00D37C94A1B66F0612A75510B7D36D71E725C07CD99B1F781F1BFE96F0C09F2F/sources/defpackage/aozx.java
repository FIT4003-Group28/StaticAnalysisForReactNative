package defpackage;
/* compiled from: PG */
/* renamed from: aozx  reason: default package */
/* loaded from: classes.dex */
public final class aozx extends aopi implements aoqv {
    public static final aozx a;
    private static volatile aorb c;
    public aoyj b;
    private int d;

    static {
        aozx aozxVar = new aozx();
        a = aozxVar;
        aopi.registerDefaultInstance(aozx.class, aozxVar);
    }

    private aozx() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\uea6f㋿\uea6f㋿\u0001\u0000\u0000\u0000\uea6f㋿ဉ\u0000", new Object[]{"d", "b"});
            case 3:
                return new aozx();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = c;
                if (aorbVar == null) {
                    synchronized (aozx.class) {
                        aorbVar = c;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            c = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
