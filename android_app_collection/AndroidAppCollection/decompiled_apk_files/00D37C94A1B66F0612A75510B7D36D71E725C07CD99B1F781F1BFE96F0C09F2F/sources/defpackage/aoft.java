package defpackage;
/* compiled from: PG */
/* renamed from: aoft  reason: default package */
/* loaded from: classes.dex */
public final class aoft extends aopi implements aoqv {
    public static final aoft a;
    private static volatile aorb h;
    public aofq b;
    public aofo c;
    public aofn d;
    public aofp e;
    public aofk f;
    public aofl g;
    private aoqp i = aoqp.a;

    static {
        aoft aoftVar = new aoft();
        a = aoftVar;
        aopi.registerDefaultInstance(aoft.class, aoftVar);
    }

    private aoft() {
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
                return newMessageInfo(a, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0001\u0000\u0000\u0001\t\u0002\t\u0003\t\u0004\t\u00052\u0006\t\u0007\t", new Object[]{"b", "c", "d", "f", "i", aofs.a, "e", "g"});
            case 3:
                return new aoft();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (aoft.class) {
                        aorbVar = h;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            h = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
