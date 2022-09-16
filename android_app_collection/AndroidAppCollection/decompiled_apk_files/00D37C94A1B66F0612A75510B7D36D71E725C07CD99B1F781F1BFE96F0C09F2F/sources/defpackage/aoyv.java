package defpackage;
/* compiled from: PG */
/* renamed from: aoyv  reason: default package */
/* loaded from: classes.dex */
public final class aoyv extends aopi implements aoqv {
    public static final aoyv a;
    private static volatile aorb d;
    public int b;
    public aoyj c;

    static {
        aoyv aoyvVar = new aoyv();
        a = aoyvVar;
        aopi.registerDefaultInstance(aoyv.class, aoyvVar);
    }

    private aoyv() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\uea6f㋿\uea6f㋿\u0001\u0000\u0000\u0000\uea6f㋿ဉ\u0000", new Object[]{"b", "c"});
            case 3:
                return new aoyv();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (aoyv.class) {
                        aorbVar = d;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            d = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
