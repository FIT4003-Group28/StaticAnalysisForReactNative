package defpackage;
/* compiled from: PG */
/* renamed from: arwv  reason: default package */
/* loaded from: classes2.dex */
public final class arwv extends aopi implements aoqv {
    public static final arwv a;
    private static volatile aorb f;
    public int b;
    public boolean c;
    public assw d;
    public assx e;

    static {
        arwv arwvVar = new arwv();
        a = arwvVar;
        aopi.registerDefaultInstance(arwv.class, arwvVar);
    }

    private arwv() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"b", "c", "d", "e"});
            case 3:
                return new arwv();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (arwv.class) {
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
