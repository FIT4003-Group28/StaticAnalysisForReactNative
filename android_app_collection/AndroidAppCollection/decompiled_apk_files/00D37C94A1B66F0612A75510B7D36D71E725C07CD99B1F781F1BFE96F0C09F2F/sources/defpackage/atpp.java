package defpackage;
/* compiled from: PG */
/* renamed from: atpp  reason: default package */
/* loaded from: classes2.dex */
public final class atpp extends aopi implements aoqv {
    public static final atpp a;
    private static volatile aorb d;
    public int b;
    public aqxl c;

    static {
        atpp atppVar = new atpp();
        a = atppVar;
        aopi.registerDefaultInstance(atpp.class, atppVar);
    }

    private atpp() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0000\u0004ဉ\u0003", new Object[]{"b", "c"});
            case 3:
                return new atpp();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (atpp.class) {
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
