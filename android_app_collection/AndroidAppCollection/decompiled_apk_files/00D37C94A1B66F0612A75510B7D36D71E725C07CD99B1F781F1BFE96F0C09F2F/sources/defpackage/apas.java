package defpackage;
/* compiled from: PG */
/* renamed from: apas  reason: default package */
/* loaded from: classes.dex */
public final class apas extends aopi implements aoqv {
    public static final apas a;
    private static volatile aorb e;
    public int b;
    public apar c;
    public aoyj d;

    static {
        apas apasVar = new apas();
        a = apasVar;
        aopi.registerDefaultInstance(apas.class, apasVar);
    }

    private apas() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\uea6f㋿\uea7e㋿\u0002\u0000\u0000\u0000\uea6f㋿ဉ\u0001\uea7e㋿ဉ\u0000", new Object[]{"b", "d", "c"});
            case 3:
                return new apas();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (apas.class) {
                        aorbVar = e;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            e = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
