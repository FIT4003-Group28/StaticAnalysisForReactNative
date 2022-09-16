package defpackage;
/* compiled from: PG */
/* renamed from: atub  reason: default package */
/* loaded from: classes2.dex */
public final class atub extends aopi implements aoqv {
    public static final atub a;
    private static volatile aorb e;
    public int b;
    public atty c;
    public attz d;

    static {
        atub atubVar = new atub();
        a = atubVar;
        aopi.registerDefaultInstance(atub.class, atubVar);
    }

    private atub() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001ﯟ☇\ue627☔\u0002\u0000\u0000\u0000ﯟ☇ဉ\u0001\ue627☔ဉ\u0000", new Object[]{"b", "d", "c"});
            case 3:
                return new atub();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (atub.class) {
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
