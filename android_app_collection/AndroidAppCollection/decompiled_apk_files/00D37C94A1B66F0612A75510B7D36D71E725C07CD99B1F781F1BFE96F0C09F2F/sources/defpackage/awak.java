package defpackage;
/* compiled from: PG */
/* renamed from: awak  reason: default package */
/* loaded from: classes2.dex */
public final class awak extends aopi implements aoqv {
    public static final awak a;
    private static volatile aorb d;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        awak awakVar = new awak();
        a = awakVar;
        aopi.registerDefaultInstance(awak.class, awakVar);
    }

    private awak() {
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
                return newMessageInfo(a, "\u0001\u0001\u0001\u0000ﮜ\u2dd7ﮜ\u2dd7\u0001\u0000\u0000\u0001ﮜ\u2dd7ᐼ\u0000", new Object[]{"c", "b", atoo.class});
            case 3:
                return new awak();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (awak.class) {
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
