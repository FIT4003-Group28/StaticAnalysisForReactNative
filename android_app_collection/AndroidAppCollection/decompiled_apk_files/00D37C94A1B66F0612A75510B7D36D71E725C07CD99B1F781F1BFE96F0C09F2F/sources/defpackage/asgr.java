package defpackage;
/* compiled from: PG */
/* renamed from: asgr  reason: default package */
/* loaded from: classes2.dex */
public final class asgr extends aopi implements aoqv {
    public static final asgr a;
    private static volatile aorb d;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        asgr asgrVar = new asgr();
        a = asgrVar;
        aopi.registerDefaultInstance(asgr.class, asgrVar);
    }

    private asgr() {
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
                return newMessageInfo(a, "\u0001\u0005\u0001\u0000\uefcf⸵\ue1c0ꉹ\u0005\u0000\u0000\u0005\uefcf⸵ᐼ\u0000突ハᐼ\u0000ﭴ㨬ᐼ\u0000\ueb41䣥ᐼ\u0000\ue1c0ꉹᐼ\u0000", new Object[]{"c", "b", atds.class, aqmt.class, arcd.class, avjf.class, aqge.class});
            case 3:
                return new asgr();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (asgr.class) {
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
