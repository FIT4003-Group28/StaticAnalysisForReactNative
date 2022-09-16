package defpackage;
/* compiled from: PG */
/* renamed from: apes  reason: default package */
/* loaded from: classes.dex */
public final class apes extends aopi implements aoqv {
    public static final apes a;
    private static volatile aorb e;
    public boolean b;
    public boolean c;
    public boolean d;
    private int f;

    static {
        apes apesVar = new apes();
        a = apesVar;
        aopi.registerDefaultInstance(apes.class, apesVar);
    }

    private apes() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0003\u0005\u0003\u0000\u0000\u0000\u0003ဇ\u0000\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"f", "b", "c", "d"});
            case 3:
                return new apes();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (apes.class) {
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
