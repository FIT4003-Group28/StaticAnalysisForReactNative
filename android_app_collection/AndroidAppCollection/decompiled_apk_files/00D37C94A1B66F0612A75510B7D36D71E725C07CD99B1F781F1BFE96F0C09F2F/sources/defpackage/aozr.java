package defpackage;
/* compiled from: PG */
/* renamed from: aozr  reason: default package */
/* loaded from: classes.dex */
public final class aozr extends aopi implements aoqv {
    public static final aozr a;
    private static volatile aorb e;
    public int b;
    public String c = "";
    public boolean d;

    static {
        aozr aozrVar = new aozr();
        a = aozrVar;
        aopi.registerDefaultInstance(aozr.class, aozrVar);
    }

    private aozr() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001", new Object[]{"b", "c", "d"});
            case 3:
                return new aozr();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (aozr.class) {
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
