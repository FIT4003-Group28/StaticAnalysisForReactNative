package defpackage;
/* compiled from: PG */
/* renamed from: aokc  reason: default package */
/* loaded from: classes.dex */
public final class aokc extends aopi implements aoqv {
    public static final aokc a;
    private static volatile aorb f;
    public Object c;
    public Object e;
    public int b = 0;
    public int d = 0;

    static {
        aokc aokcVar = new aokc();
        a = aokcVar;
        aopi.registerDefaultInstance(aokc.class, aokcVar);
    }

    private aokc() {
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
                return newMessageInfo(a, "\u0001\u0004\u0002\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001ျ\u0000\u0002ြ\u0000\u0003ြ\u0001\u0004ြ\u0001", new Object[]{"c", "b", "e", "d", aolo.class, aoka.class, aokb.class});
            case 3:
                return new aokc();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (aokc.class) {
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
