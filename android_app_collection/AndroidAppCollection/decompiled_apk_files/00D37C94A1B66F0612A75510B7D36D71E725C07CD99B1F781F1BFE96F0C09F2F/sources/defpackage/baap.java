package defpackage;
/* compiled from: PG */
/* renamed from: baap  reason: default package */
/* loaded from: classes2.dex */
public final class baap extends aopi implements aoqv {
    public static final baap a;
    private static volatile aorb e;
    public int b;
    public String c = "";
    public aopt d = emptyLongList();

    static {
        baap baapVar = new baap();
        a = baapVar;
        aopi.registerDefaultInstance(baap.class, baapVar);
    }

    private baap() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0003(", new Object[]{"b", "c", "d"});
            case 3:
                return new baap();
            case 4:
                return new aopa((float[][][]) null, (short[][]) null);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (baap.class) {
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
