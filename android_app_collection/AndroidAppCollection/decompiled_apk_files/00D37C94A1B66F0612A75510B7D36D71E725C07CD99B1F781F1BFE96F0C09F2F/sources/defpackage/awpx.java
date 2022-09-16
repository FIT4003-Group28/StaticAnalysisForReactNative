package defpackage;
/* compiled from: PG */
/* renamed from: awpx  reason: default package */
/* loaded from: classes2.dex */
public final class awpx extends aopi implements aoqv {
    public static final awpx a;
    private static volatile aorb c;
    public awpz b;
    private int d;
    private awpo e;
    private awpb f;
    private awpg g;
    private awpq h;
    private awpc i;
    private byte j = 2;

    static {
        awpx awpxVar = new awpx();
        a = awpxVar;
        aopi.registerDefaultInstance(awpx.class, awpxVar);
    }

    private awpx() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.j);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.j = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u000f\u0006\u0000\u0000\u0006\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\nᐉ\t\u000eᐉ\n\u000fᐉ\u000b", new Object[]{"d", "b", "e", "f", "g", "h", "i"});
            case 3:
                return new awpx();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = c;
                if (aorbVar == null) {
                    synchronized (awpx.class) {
                        aorbVar = c;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            c = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
