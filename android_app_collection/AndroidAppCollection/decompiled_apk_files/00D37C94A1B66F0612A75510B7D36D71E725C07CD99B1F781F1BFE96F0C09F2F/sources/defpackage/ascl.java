package defpackage;
/* compiled from: PG */
/* renamed from: ascl  reason: default package */
/* loaded from: classes2.dex */
public final class ascl extends aopi implements aoqv {
    public static final ascl a;
    private static volatile aorb h;
    public int b;
    public Object d;
    public aroy e;
    public int c = 0;
    private byte i = 2;
    public aoob f = aoob.b;
    public String g = "";

    static {
        ascl asclVar = new ascl();
        a = asclVar;
        aopi.registerDefaultInstance(ascl.class, asclVar);
    }

    private ascl() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.i);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.i = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0005\u0001\u0001\u0001\u0006\u0005\u0000\u0000\u0001\u0001ᐉ\u0000\u0003ည\u0001\u0004ျ\u0000\u0005ဈ\u0004\u0006ြ\u0000", new Object[]{"d", "c", "b", "e", "f", "g", assu.class});
            case 3:
                return new ascl();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (ascl.class) {
                        aorbVar = h;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            h = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
