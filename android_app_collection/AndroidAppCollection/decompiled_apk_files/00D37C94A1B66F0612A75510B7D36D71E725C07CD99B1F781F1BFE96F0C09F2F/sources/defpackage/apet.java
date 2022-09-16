package defpackage;
/* compiled from: PG */
/* renamed from: apet  reason: default package */
/* loaded from: classes.dex */
public final class apet extends aopi implements aoqv {
    public static final apet a;
    private static volatile aorb e;
    public boolean b;
    public int c;
    public int d;
    private int f;

    static {
        apet apetVar = new apet();
        a = apetVar;
        aopi.registerDefaultInstance(apet.class, apetVar);
    }

    private apet() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"f", "b", "c", "d"});
            case 3:
                return new apet();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (apet.class) {
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
