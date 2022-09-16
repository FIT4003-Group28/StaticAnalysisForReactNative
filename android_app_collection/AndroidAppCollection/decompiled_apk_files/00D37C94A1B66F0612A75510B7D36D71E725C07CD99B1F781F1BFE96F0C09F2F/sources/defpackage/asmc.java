package defpackage;
/* compiled from: PG */
/* renamed from: asmc  reason: default package */
/* loaded from: classes2.dex */
public final class asmc extends aopi implements aoqv {
    public static final asmc a;
    private static volatile aorb f;
    public int b;
    public Object d;
    public int c = 0;
    private byte g = 2;
    public String e = "";

    static {
        asmc asmcVar = new asmc();
        a = asmcVar;
        aopi.registerDefaultInstance(asmc.class, asmcVar);
    }

    private asmc() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.g = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0000\u0001\u0001ဈ\u0000\u0002ျ\u0000\u0003ᐼ\u0000\u0004့\u0000\u0005်\u0000\u0006ဳ\u0000", new Object[]{"d", "c", "b", "e", arag.class});
            case 3:
                return new asmc();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (asmc.class) {
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
