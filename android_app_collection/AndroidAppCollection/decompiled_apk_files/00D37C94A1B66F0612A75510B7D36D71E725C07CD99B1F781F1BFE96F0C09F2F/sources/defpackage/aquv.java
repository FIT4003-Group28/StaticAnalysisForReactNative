package defpackage;
/* compiled from: PG */
/* renamed from: aquv  reason: default package */
/* loaded from: classes2.dex */
public final class aquv extends aopi implements aoqv {
    public static final aquv a;
    private static volatile aorb j;
    public int b;
    public arag c;
    public avhn d;
    public apzg e;
    public arag f;
    public arag g;
    public arag h;
    private arag k;
    private aoux l;
    private byte m = 2;
    public aoob i = aoob.b;

    static {
        aquv aquvVar = new aquv();
        a = aquvVar;
        aopi.registerDefaultInstance(aquv.class, aquvVar);
    }

    private aquv() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.m);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.m = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0002\u000e\t\u0000\u0000\b\u0002ᐉ\u0001\u0003ᐉ\u0002\u0006ᐉ\u0005\u0007ᐉ\u0006\nᐉ\u0007\u000bᐉ\b\fᐉ\t\rᐉ\u0004\u000eည\n", new Object[]{"b", "c", "d", "k", "f", "g", "h", "l", "e", "i"});
            case 3:
                return new aquv();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = j;
                if (aorbVar == null) {
                    synchronized (aquv.class) {
                        aorbVar = j;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            j = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
