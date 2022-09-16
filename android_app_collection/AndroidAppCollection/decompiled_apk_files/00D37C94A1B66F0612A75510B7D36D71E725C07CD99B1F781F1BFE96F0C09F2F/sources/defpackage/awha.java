package defpackage;
/* compiled from: PG */
/* renamed from: awha  reason: default package */
/* loaded from: classes2.dex */
public final class awha extends aopi implements aoqv {
    public static final awha a;
    private static volatile aorb e;
    public int b;
    public ascj c;
    public String d = "";

    static {
        awha awhaVar = new awha();
        a = awhaVar;
        aopi.registerDefaultInstance(awha.class, awhaVar);
    }

    private awha() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0007\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0007ဈ\u0007", new Object[]{"b", "c", "d"});
            case 3:
                return new awha();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (awha.class) {
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
