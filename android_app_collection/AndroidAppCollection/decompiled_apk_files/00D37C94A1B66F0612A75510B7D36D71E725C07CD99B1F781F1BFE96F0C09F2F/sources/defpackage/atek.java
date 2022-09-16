package defpackage;
/* compiled from: PG */
/* renamed from: atek  reason: default package */
/* loaded from: classes2.dex */
public final class atek extends aopi implements aoqv {
    public static final atek a;
    private static volatile aorb h;
    public int b;
    public arag c;
    public arhs d;
    public apzg e;
    public int g;
    private aoux i;
    private byte j = 2;
    public aoob f = aoob.b;

    static {
        atek atekVar = new atek();
        a = atekVar;
        aopi.registerDefaultInstance(atek.class, atekVar);
    }

    private atek() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0004\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ည\u0004\u0007ဌ\u0006", new Object[]{"b", "c", "d", "e", "i", "f", "g", atdq.e});
            case 3:
                return new atek();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (atek.class) {
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
