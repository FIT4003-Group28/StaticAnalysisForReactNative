package defpackage;
/* compiled from: PG */
/* renamed from: awbf  reason: default package */
/* loaded from: classes2.dex */
public final class awbf extends aopi implements aoqv {
    public static final awbf a;
    private static volatile aorb e;
    public int b;
    public arag c;
    public arag d;
    private arag f;
    private arag g;
    private byte h = 2;

    static {
        awbf awbfVar = new awbf();
        a = awbfVar;
        aopi.registerDefaultInstance(awbf.class, awbfVar);
    }

    private awbf() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0004\u0001ᐉ\u0000\u0002ᐉ\u0003\u0004ᐉ\u0001\u0005ᐉ\u0002", new Object[]{"b", "c", "g", "f", "d"});
            case 3:
                return new awbf();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (awbf.class) {
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
