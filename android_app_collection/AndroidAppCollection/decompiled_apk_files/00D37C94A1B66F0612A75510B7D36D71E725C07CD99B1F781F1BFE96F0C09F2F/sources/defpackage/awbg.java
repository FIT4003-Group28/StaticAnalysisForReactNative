package defpackage;
/* compiled from: PG */
/* renamed from: awbg  reason: default package */
/* loaded from: classes2.dex */
public final class awbg extends aopi implements aoqv {
    public static final awbg a;
    private static volatile aorb c;
    public attp b;
    private int d;
    private byte e = 2;

    static {
        awbg awbgVar = new awbg();
        a = awbgVar;
        aopi.registerDefaultInstance(awbg.class, awbgVar);
    }

    private awbg() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.e = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\ue528᳢\ue528᳢\u0001\u0000\u0000\u0001\ue528᳢ᐉ\u0000", new Object[]{"d", "b"});
            case 3:
                return new awbg();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = c;
                if (aorbVar == null) {
                    synchronized (awbg.class) {
                        aorbVar = c;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            c = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
