package defpackage;
/* compiled from: PG */
/* renamed from: awtj  reason: default package */
/* loaded from: classes2.dex */
public final class awtj extends aopi implements aoqv {
    public static final awtj a;
    private static volatile aorb f;
    public String b = "";
    public boolean c;
    public boolean d;
    public boolean e;
    private int g;

    static {
        awtj awtjVar = new awtj();
        a = awtjVar;
        aopi.registerDefaultInstance(awtj.class, awtjVar);
    }

    private awtj() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0003\u0007\u0004\u0000\u0000\u0000\u0003ဈ\u0001\u0005ဇ\u0003\u0006ဇ\u0004\u0007ဇ\u0005", new Object[]{"g", "b", "c", "d", "e"});
            case 3:
                return new awtj();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (awtj.class) {
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
