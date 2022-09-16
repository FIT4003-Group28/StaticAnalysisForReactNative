package defpackage;
/* compiled from: PG */
/* renamed from: awag  reason: default package */
/* loaded from: classes2.dex */
public final class awag extends aopi implements aoqv {
    public static final awag a;
    private static volatile aorb b;
    private int c;
    private awbf d;
    private byte e = 2;

    static {
        awag awagVar = new awag();
        a = awagVar;
        aopi.registerDefaultInstance(awag.class, awagVar);
    }

    private awag() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.e);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.e = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\ueaf2Ⅶ\ueaf2Ⅶ\u0001\u0000\u0000\u0001\ueaf2Ⅶᐉ\u0000", new Object[]{"c", "d"});
            case 3:
                return new awag();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (awag.class) {
                        aorbVar = b;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            b = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
