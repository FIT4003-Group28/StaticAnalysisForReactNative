package defpackage;
/* compiled from: PG */
/* renamed from: awsu  reason: default package */
/* loaded from: classes2.dex */
public final class awsu extends aopi implements aoqv {
    public static final awsu a;
    private static volatile aorb d;
    public awmd c;
    private int e;
    private byte f = 2;
    public String b = "";

    static {
        awsu awsuVar = new awsu();
        a = awsuVar;
        aopi.registerDefaultInstance(awsu.class, awsuVar);
    }

    private awsu() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ဈ\u0000\u0002ᐉ\u0001", new Object[]{"e", "b", "c"});
            case 3:
                return new awsu();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (awsu.class) {
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
