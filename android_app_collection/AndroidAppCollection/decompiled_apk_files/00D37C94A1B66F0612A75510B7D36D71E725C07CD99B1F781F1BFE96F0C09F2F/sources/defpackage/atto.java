package defpackage;
/* compiled from: PG */
/* renamed from: atto  reason: default package */
/* loaded from: classes2.dex */
public final class atto extends aopi implements aoqv {
    public static final atto a;
    private static volatile aorb e;
    public int b;
    public aqmu c;
    public avvh d;
    private aqft f;
    private byte g = 2;

    static {
        atto attoVar = new atto();
        a = attoVar;
        aopi.registerDefaultInstance(atto.class, attoVar);
    }

    private atto() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001ﱃ\u196f\ue607⨅\u0003\u0000\u0000\u0003ﱃ\u196fᐉ\u0000\uf321Ẑᐉ\u0002\ue607⨅ᐉ\u0001", new Object[]{"b", "c", "f", "d"});
            case 3:
                return new atto();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (atto.class) {
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
