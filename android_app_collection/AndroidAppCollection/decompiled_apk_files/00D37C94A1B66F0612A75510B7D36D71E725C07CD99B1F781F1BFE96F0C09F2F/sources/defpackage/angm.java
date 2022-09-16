package defpackage;
/* compiled from: PG */
/* renamed from: angm  reason: default package */
/* loaded from: classes.dex */
public final class angm extends aopi implements aoqv {
    public static final angm a;
    private static volatile aorb e;
    public int b;
    public int c = -1;
    public String d = "";

    static {
        angm angmVar = new angm();
        a = angmVar;
        aopi.registerDefaultInstance(angm.class, angmVar);
    }

    private angm() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001", new Object[]{"b", "c", "d"});
            case 3:
                return new angm();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (angm.class) {
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
