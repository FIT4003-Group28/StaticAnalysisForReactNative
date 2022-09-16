package defpackage;
/* compiled from: PG */
/* renamed from: apcg  reason: default package */
/* loaded from: classes.dex */
public final class apcg extends aopi implements aoqv {
    public static final apcg a;
    private static volatile aorb i;
    public int b;
    public apdb c;
    public apdh d;
    public apcy e;
    public apdi f;
    public apde g;
    public apcv h;

    static {
        apcg apcgVar = new apcg();
        a = apcgVar;
        aopi.registerDefaultInstance(apcg.class, apcgVar);
    }

    private apcg() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0005\u0006ဉ\u0004", new Object[]{"b", "c", "d", "e", "f", "h", "g"});
            case 3:
                return new apcg();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = i;
                if (aorbVar == null) {
                    synchronized (apcg.class) {
                        aorbVar = i;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            i = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
