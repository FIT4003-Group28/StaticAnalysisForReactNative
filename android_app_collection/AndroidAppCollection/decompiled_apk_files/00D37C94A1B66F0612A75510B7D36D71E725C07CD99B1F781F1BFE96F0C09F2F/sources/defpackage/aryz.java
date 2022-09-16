package defpackage;
/* compiled from: PG */
/* renamed from: aryz  reason: default package */
/* loaded from: classes2.dex */
public final class aryz extends aopi implements aoqv {
    public static final aryz a;
    private static volatile aorb j;
    public int b;
    public aroy c;
    public boolean h;
    private byte k = 2;
    public aoob d = aoob.b;
    public aoob e = aoob.b;
    public aoob f = aoob.b;
    public aoob g = aoob.b;
    public String i = "";

    static {
        aryz aryzVar = new aryz();
        a = aryzVar;
        aopi.registerDefaultInstance(aryz.class, aryzVar);
    }

    private aryz() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.k);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.k = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\t\u0007\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ည\u0001\u0005ည\u0004\u0006ည\u0002\u0007ည\u0003\bဇ\u0005\tဈ\u0006", new Object[]{"b", "c", "d", "g", "e", "f", "h", "i"});
            case 3:
                return new aryz();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = j;
                if (aorbVar == null) {
                    synchronized (aryz.class) {
                        aorbVar = j;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            j = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
