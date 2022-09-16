package defpackage;
/* compiled from: PG */
/* renamed from: awcn  reason: default package */
/* loaded from: classes2.dex */
public final class awcn extends aopi implements aoqv {
    public static final awcn a;
    private static volatile aorb i;
    public int b;
    public arag c;
    public arag d;
    public aunb e;
    public aunb f;
    public int g;
    private aoux j;
    private byte k = 2;
    public aoob h = aoob.b;

    static {
        awcn awcnVar = new awcn();
        a = awcnVar;
        aopi.registerDefaultInstance(awcn.class, awcnVar);
    }

    private awcn() {
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
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0005\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0005\u0006ည\u0006\u0007ဌ\u0004", new Object[]{"b", "c", "d", "e", "f", "j", "h", "g", awbk.c});
            case 3:
                return new awcn();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = i;
                if (aorbVar == null) {
                    synchronized (awcn.class) {
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
