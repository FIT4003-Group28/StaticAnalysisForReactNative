package defpackage;
/* compiled from: PG */
/* renamed from: apjl  reason: default package */
/* loaded from: classes.dex */
public final class apjl extends aopi implements aoqv {
    public static final apjl a;
    private static volatile aorb k;
    public arhs b;
    public arhs c;
    public apzg d;
    public apzg e;
    public apzg f;
    public apzg g;
    public aovs h;
    public aovs i;
    private int l;
    private aoux m;
    private byte n = 2;
    public aoob j = aoob.b;

    static {
        apjl apjlVar = new apjl();
        a = apjlVar;
        aopi.registerDefaultInstance(apjl.class, apjlVar);
    }

    private apjl() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.n);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.n = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0007\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005\u0007ဉ\u0006\bဉ\u0007\tᐉ\b\nည\t", new Object[]{"l", "b", "c", "d", "e", "f", "g", "h", "i", "m", "j"});
            case 3:
                return new apjl();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = k;
                if (aorbVar == null) {
                    synchronized (apjl.class) {
                        aorbVar = k;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            k = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
