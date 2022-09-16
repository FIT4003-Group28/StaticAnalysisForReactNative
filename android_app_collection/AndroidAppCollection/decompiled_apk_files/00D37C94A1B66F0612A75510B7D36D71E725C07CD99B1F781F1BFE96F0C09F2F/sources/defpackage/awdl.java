package defpackage;
/* compiled from: PG */
@Deprecated
/* renamed from: awdl  reason: default package */
/* loaded from: classes2.dex */
public final class awdl extends aopi implements aoqv {
    public static final awdl a;
    private static volatile aorb d;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        awdl awdlVar = new awdl();
        a = awdlVar;
        aopi.registerDefaultInstance(awdl.class, awdlVar);
    }

    private awdl() {
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
                return newMessageInfo(a, "\u0001\u0003\u0001\u0000\uf395ḫ\uf185ḳ\u0003\u0000\u0000\u0003\uf395ḫᐼ\u0000\ue4e1ḭᐼ\u0000\uf185ḳᐼ\u0000", new Object[]{"c", "b", awdp.class, awde.class, awdo.class});
            case 3:
                return new awdl();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (awdl.class) {
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
