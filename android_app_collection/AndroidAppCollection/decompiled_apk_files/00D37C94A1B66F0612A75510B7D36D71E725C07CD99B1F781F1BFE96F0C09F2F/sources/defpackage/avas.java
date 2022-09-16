package defpackage;
/* compiled from: PG */
/* renamed from: avas  reason: default package */
/* loaded from: classes2.dex */
public final class avas extends aopi implements aoqv {
    public static final avas a;
    private static volatile aorb f;
    public int b;
    public avgj c;
    public avgj d;
    public boolean e;

    static {
        avas avasVar = new avas();
        a = avasVar;
        aopi.registerDefaultInstance(avas.class, avasVar);
    }

    private avas() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002", new Object[]{"b", "c", "d", "e"});
            case 3:
                return new avas();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (avas.class) {
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
