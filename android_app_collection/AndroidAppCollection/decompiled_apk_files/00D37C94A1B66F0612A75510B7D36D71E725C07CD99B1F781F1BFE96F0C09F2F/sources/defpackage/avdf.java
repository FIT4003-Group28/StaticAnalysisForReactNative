package defpackage;
/* compiled from: PG */
/* renamed from: avdf  reason: default package */
/* loaded from: classes2.dex */
public final class avdf extends aopi implements aoqv {
    public static final avdf a;
    private static volatile aorb d;
    public int b;
    public avde c;
    private byte e = 2;

    static {
        avdf avdfVar = new avdf();
        a = avdfVar;
        aopi.registerDefaultInstance(avdf.class, avdfVar);
    }

    private avdf() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\ue545㙻\ue545㙻\u0001\u0000\u0000\u0001\ue545㙻ᐉ\u0000", new Object[]{"b", "c"});
            case 3:
                return new avdf();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (avdf.class) {
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
