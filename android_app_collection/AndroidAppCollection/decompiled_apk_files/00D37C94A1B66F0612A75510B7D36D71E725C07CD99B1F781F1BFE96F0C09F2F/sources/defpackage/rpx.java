package defpackage;
/* compiled from: PG */
/* renamed from: rpx  reason: default package */
/* loaded from: classes4.dex */
public final class rpx extends aopi implements aoqv {
    public static final rpx a;
    private static volatile aorb i;
    public int b;
    public int c;
    public String d = "";
    public rpv e;
    public boolean f;
    public boolean g;
    public boolean h;

    static {
        rpx rpxVar = new rpx();
        a = rpxVar;
        aopi.registerDefaultInstance(rpx.class, rpxVar);
    }

    private rpx() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        switch (aophVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"b", "c", "d", "e", "f", "g", "h"});
            case 3:
                return new rpx();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = i;
                if (aorbVar == null) {
                    synchronized (rpx.class) {
                        aorbVar = i;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            i = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
