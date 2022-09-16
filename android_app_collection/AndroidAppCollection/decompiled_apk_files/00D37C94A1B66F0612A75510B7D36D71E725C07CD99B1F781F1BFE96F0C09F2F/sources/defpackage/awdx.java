package defpackage;
/* compiled from: PG */
/* renamed from: awdx  reason: default package */
/* loaded from: classes2.dex */
public final class awdx extends aopi implements aoqv {
    public static final awdx a;
    private static volatile aorb d;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        awdx awdxVar = new awdx();
        a = awdxVar;
        aopi.registerDefaultInstance(awdx.class, awdxVar);
    }

    private awdx() {
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
                return newMessageInfo(a, "\u0001\u0004\u0001\u0000\ue1b7㠂\uf676䙥\u0004\u0000\u0000\u0004\ue1b7㠂ᐼ\u0000\ue4d4㠍ᐼ\u0000\ue206㠠ᐼ\u0000\uf676䙥ᐼ\u0000", new Object[]{"c", "b", awdw.class, awdv.class, awdy.class, awdu.class});
            case 3:
                return new awdx();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (awdx.class) {
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
