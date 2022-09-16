package defpackage;
/* compiled from: PG */
/* renamed from: avnr  reason: default package */
/* loaded from: classes2.dex */
public final class avnr extends aopi implements aoqv {
    public static final avnr a;
    private static volatile aorb d;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        avnr avnrVar = new avnr();
        a = avnrVar;
        aopi.registerDefaultInstance(avnr.class, avnrVar);
    }

    private avnr() {
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
                return newMessageInfo(a, "\u0001\u0004\u0001\u0000\uf321Ẑ\ue91b㲾\u0004\u0000\u0000\u0004\uf321Ẑᐼ\u0000\uf26a⤒ᐼ\u0000\uf49e㲔ᐼ\u0000\ue91b㲾ᐼ\u0000", new Object[]{"c", "b", aqft.class, asku.class, avnt.class, avns.class});
            case 3:
                return new avnr();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (avnr.class) {
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
