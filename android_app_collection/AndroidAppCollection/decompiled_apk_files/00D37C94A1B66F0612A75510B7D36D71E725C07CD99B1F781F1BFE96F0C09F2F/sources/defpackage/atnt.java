package defpackage;
/* compiled from: PG */
/* renamed from: atnt  reason: default package */
/* loaded from: classes2.dex */
public final class atnt extends aopi implements aoqv {
    public static final atnt a;
    private static volatile aorb d;
    public int b;
    public int c;
    private int e;

    static {
        atnt atntVar = new atnt();
        a = atntVar;
        aopi.registerDefaultInstance(atnt.class, atntVar);
    }

    private atnt() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"e", "b", "c"});
            case 3:
                return new atnt();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (atnt.class) {
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
