package defpackage;
/* compiled from: PG */
/* renamed from: avfn  reason: default package */
/* loaded from: classes2.dex */
public final class avfn extends aopi implements aoqv {
    public static final avfn a;
    private static volatile aorb d;
    public int b;
    public argj c;
    private atnz e;
    private avsn f;
    private aqgp g;
    private byte h = 2;

    static {
        avfn avfnVar = new avfn();
        a = avfnVar;
        aopi.registerDefaultInstance(avfn.class, avfnVar);
    }

    private avfn() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\uf3e4\u2e6e羽偀\u0004\u0000\u0000\u0004\uf3e4\u2e6eᐉ\u0000\uf3fbヺᐉ\u0001祥䌤ᐉ\u0002羽偀ᐉ\u0003", new Object[]{"b", "e", "c", "f", "g"});
            case 3:
                return new avfn();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (avfn.class) {
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
