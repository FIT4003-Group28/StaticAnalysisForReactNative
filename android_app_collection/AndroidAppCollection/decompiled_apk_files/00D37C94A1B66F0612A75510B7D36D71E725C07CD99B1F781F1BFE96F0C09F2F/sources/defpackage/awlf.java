package defpackage;
/* compiled from: PG */
/* renamed from: awlf  reason: default package */
/* loaded from: classes2.dex */
public final class awlf extends aopi implements aoqv {
    public static final awlf a;
    private static volatile aorb f;
    public int b;
    public apzg d;
    public apzg e;
    private byte g = 2;
    public String c = "";

    static {
        awlf awlfVar = new awlf();
        a = awlfVar;
        aopi.registerDefaultInstance(awlf.class, awlfVar);
    }

    private awlf() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0002\u0001ဈ\u0000\u0004ᐉ\u0003\u0005ᐉ\u0004", new Object[]{"b", "c", "d", "e"});
            case 3:
                return new awlf();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (awlf.class) {
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
