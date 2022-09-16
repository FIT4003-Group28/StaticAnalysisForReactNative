package defpackage;
/* compiled from: PG */
/* renamed from: bapy  reason: default package */
/* loaded from: classes2.dex */
public final class bapy extends aopi implements aoqv {
    public static final aopr a = new asvu(16);
    public static final bapy b;
    private static volatile aorb f;
    public int c;
    public aopq d = emptyIntList();
    public int e;

    static {
        bapy bapyVar = new bapy();
        b = bapyVar;
        aopi.registerDefaultInstance(bapy.class, bapyVar);
    }

    private bapy() {
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
                return newMessageInfo(b, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0001\u0000\u0002,\u0003င\u0001", new Object[]{"c", "d", aotd.a(), "e"});
            case 3:
                return new bapy();
            case 4:
                return new aopa(b);
            case 5:
                return b;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (bapy.class) {
                        aorbVar = f;
                        if (aorbVar == null) {
                            aorbVar = new aopb(b);
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
