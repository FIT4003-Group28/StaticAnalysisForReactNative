package defpackage;
/* compiled from: PG */
/* renamed from: ihr  reason: default package */
/* loaded from: classes3.dex */
public final class ihr extends aopi implements aoqv {
    public static final ihr a;
    private static volatile aorb f;
    public boolean b;
    public int c;
    public int d;
    public String e = "";

    static {
        ihr ihrVar = new ihr();
        a = ihrVar;
        aopi.registerDefaultInstance(ihr.class, ihrVar);
    }

    private ihr() {
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
                return newMessageInfo(a, "\u0000\u0004\u0000\u0000\u0001\u0005\u0004\u0000\u0000\u0000\u0001\u0007\u0002\u0004\u0003\u0004\u0005Ȉ", new Object[]{"b", "c", "d", "e"});
            case 3:
                return new ihr();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (ihr.class) {
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
