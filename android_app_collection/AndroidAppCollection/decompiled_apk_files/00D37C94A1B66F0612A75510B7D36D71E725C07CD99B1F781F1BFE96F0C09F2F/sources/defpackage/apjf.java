package defpackage;
/* compiled from: PG */
/* renamed from: apjf  reason: default package */
/* loaded from: classes.dex */
public final class apjf extends aopi implements aoqv {
    public static final apjf a;
    private static volatile aorb e;
    public int b;
    public apzg c;
    private aoux f;
    private byte g = 2;
    public aoob d = aoob.b;

    static {
        apjf apjfVar = new apjf();
        a = apjfVar;
        aopi.registerDefaultInstance(apjf.class, apjfVar);
    }

    private apjf() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0002\u0001ᐉ\u0000\u0003ᐉ\u0002\u0004ည\u0003", new Object[]{"b", "c", "f", "d"});
            case 3:
                return new apjf();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (apjf.class) {
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
