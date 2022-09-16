package defpackage;
/* compiled from: PG */
/* renamed from: apdd  reason: default package */
/* loaded from: classes.dex */
public final class apdd extends aopi implements aoqv {
    public static final apdd a;
    private static volatile aorb e;
    public int b;
    public aopq c = emptyIntList();
    public boolean d;

    static {
        apdd apddVar = new apdd();
        a = apddVar;
        aopi.registerDefaultInstance(apdd.class, apddVar);
    }

    private apdd() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001,\u0002ဇ\u0000", new Object[]{"b", "c", apcc.a(), "d"});
            case 3:
                return new apdd();
            case 4:
                return new aopa((short[][]) null, (boolean[]) null);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (apdd.class) {
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
