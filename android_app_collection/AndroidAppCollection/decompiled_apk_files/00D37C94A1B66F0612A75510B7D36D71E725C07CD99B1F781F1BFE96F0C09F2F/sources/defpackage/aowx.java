package defpackage;
/* compiled from: PG */
/* renamed from: aowx  reason: default package */
/* loaded from: classes.dex */
public final class aowx extends aopi implements aoqv {
    public static final aowx a;
    private static volatile aorb f;
    public int b;
    public arag c;
    public apzg d;
    private aoux g;
    private byte h = 2;
    public aoob e = aoob.b;

    static {
        aowx aowxVar = new aowx();
        a = aowxVar;
        aopi.registerDefaultInstance(aowx.class, aowxVar);
    }

    private aowx() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.h = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0003\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ည\u0003", new Object[]{"b", "c", "d", "g", "e"});
            case 3:
                return new aowx();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (aowx.class) {
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
