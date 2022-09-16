package defpackage;
/* compiled from: PG */
/* renamed from: aqfx  reason: default package */
/* loaded from: classes2.dex */
public final class aqfx extends aopi implements aoqv {
    public static final aqfx a;
    private static volatile aorb f;
    public int b;
    public aqfy c;
    public aqfw d;
    public aqfz e;
    private byte g = 2;

    static {
        aqfx aqfxVar = new aqfx();
        a = aqfxVar;
        aopi.registerDefaultInstance(aqfx.class, aqfxVar);
    }

    private aqfx() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\ue5ee\u2bbc\ue4e4\u2bbf\u0003\u0000\u0000\u0003\ue5ee\u2bbcᐉ\u0002︣\u2bbcᐉ\u0001\ue4e4\u2bbfᐉ\u0000", new Object[]{"b", "e", "d", "c"});
            case 3:
                return new aqfx();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (aqfx.class) {
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
