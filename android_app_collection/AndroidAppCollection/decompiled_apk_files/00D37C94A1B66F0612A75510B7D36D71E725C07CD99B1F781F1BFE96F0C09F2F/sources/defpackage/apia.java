package defpackage;
/* compiled from: PG */
/* renamed from: apia  reason: default package */
/* loaded from: classes.dex */
public final class apia extends aopi implements aoqv {
    public static final apia a;
    private static volatile aorb d;
    public String b = "";
    public apic c;
    private int e;

    static {
        apia apiaVar = new apia();
        a = apiaVar;
        aopi.registerDefaultInstance(apia.class, apiaVar);
    }

    private apia() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001", new Object[]{"e", "b", "c"});
            case 3:
                return new apia();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (apia.class) {
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
