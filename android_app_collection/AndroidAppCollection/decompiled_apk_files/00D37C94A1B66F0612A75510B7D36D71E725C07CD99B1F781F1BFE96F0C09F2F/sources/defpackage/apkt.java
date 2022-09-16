package defpackage;
/* compiled from: PG */
/* renamed from: apkt  reason: default package */
/* loaded from: classes.dex */
public final class apkt extends aopi implements aoqv {
    public static final apkt a;
    private static volatile aorb d;
    public avhn b;
    private int e;
    private apzg f;
    private aoux g;
    private byte h = 2;
    public aoob c = aoob.b;

    static {
        apkt apktVar = new apkt();
        a = apktVar;
        aopi.registerDefaultInstance(apkt.class, apktVar);
    }

    private apkt() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0003\u0001ᐉ\u0000\u0002ᐉ\u0004\u0003ည\u0005\u0004ᐉ\u0002", new Object[]{"e", "b", "g", "c", "f"});
            case 3:
                return new apkt();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (apkt.class) {
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
