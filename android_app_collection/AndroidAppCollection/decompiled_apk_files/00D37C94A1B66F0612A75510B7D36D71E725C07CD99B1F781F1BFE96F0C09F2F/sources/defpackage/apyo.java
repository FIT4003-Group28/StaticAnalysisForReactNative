package defpackage;
/* compiled from: PG */
/* renamed from: apyo  reason: default package */
/* loaded from: classes2.dex */
public final class apyo extends aopi implements aoqv {
    public static final apyo a;
    private static volatile aorb h;
    public int b;
    public int c;
    public long e;
    public long f;
    public apzg g;
    private byte i = 2;
    public String d = "";

    static {
        apyo apyoVar = new apyo();
        a = apyoVar;
        aopi.registerDefaultInstance(apyo.class, apyoVar);
    }

    private apyo() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0001\u0001ဈ\u0001\u0002ဂ\u0002\u0003ဂ\u0003\u0004ᐉ\u0004\u0005ဌ\u0000", new Object[]{"b", "d", "e", "f", "g", "c", asut.j});
            case 3:
                return new apyo();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (apyo.class) {
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
