package defpackage;
/* compiled from: PG */
/* renamed from: atop  reason: default package */
/* loaded from: classes2.dex */
public final class atop extends aopi implements aoqv {
    public static final atop a;
    private static volatile aorb f;
    public int b;
    public boolean c;
    public long d;
    public boolean e;

    static {
        atop atopVar = new atop();
        a = atopVar;
        aopi.registerDefaultInstance(atop.class, atopVar);
    }

    private atop() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0002\u0005\u0003\u0000\u0000\u0000\u0002ဇ\u0001\u0004ဇ\u0003\u0005ဂ\u0002", new Object[]{"b", "c", "e", "d"});
            case 3:
                return new atop();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (atop.class) {
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
