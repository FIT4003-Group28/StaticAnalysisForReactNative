package defpackage;
/* compiled from: PG */
/* renamed from: apwq  reason: default package */
/* loaded from: classes2.dex */
public final class apwq extends aopi implements aoqv {
    public static final apwq a;
    private static volatile aorb f;
    public int b;
    public apzg c;
    public arag d;
    private arag g;
    private aoux h;
    private byte i = 2;
    public aoob e = aoob.b;

    static {
        apwq apwqVar = new apwq();
        a = apwqVar;
        aopi.registerDefaultInstance(apwq.class, apwqVar);
    }

    private apwq() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.i);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.i = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0004\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0003\u0004ည\u0004\u0005ᐉ\u0002", new Object[]{"b", "c", "d", "h", "e", "g"});
            case 3:
                return new apwq();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (apwq.class) {
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
