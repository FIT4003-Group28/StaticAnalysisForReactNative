package defpackage;
/* compiled from: PG */
/* renamed from: assh  reason: default package */
/* loaded from: classes2.dex */
public final class assh extends aopi implements aoqv {
    public static final assh a;
    private static volatile aorb j;
    public int b;
    public arag c;
    public arag d;
    public arhs e;
    public boolean f;
    public apzg g;
    private aoux k;
    private byte l = 2;
    public String h = "";
    public aoob i = aoob.b;

    static {
        assh asshVar = new assh();
        a = asshVar;
        aopi.registerDefaultInstance(assh.class, asshVar);
    }

    private assh() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.l);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.l = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\n\b\u0000\u0000\u0005\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0005ဇ\u0003\u0006ᐉ\u0004\bဈ\u0005\tᐉ\u0006\nည\u0007", new Object[]{"b", "c", "d", "e", "f", "g", "h", "k", "i"});
            case 3:
                return new assh();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = j;
                if (aorbVar == null) {
                    synchronized (assh.class) {
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
