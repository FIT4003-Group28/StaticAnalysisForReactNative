package defpackage;
/* compiled from: PG */
/* renamed from: apdz  reason: default package */
/* loaded from: classes.dex */
public final class apdz extends aopi implements aoqv {
    public static final apdz a;
    private static volatile aorb f;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    private int g;

    static {
        apdz apdzVar = new apdz();
        a = apdzVar;
        aopi.registerDefaultInstance(apdz.class, apdzVar);
    }

    private apdz() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003", new Object[]{"g", "b", "c", "d", "e"});
            case 3:
                return new apdz();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (apdz.class) {
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
