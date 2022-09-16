package defpackage;
/* compiled from: PG */
/* renamed from: asli  reason: default package */
/* loaded from: classes2.dex */
public final class asli extends aopi implements aoqv {
    public static final asli a;
    private static volatile aorb j;
    public int b;
    public aqfa c;
    public aqei d;
    public aqek e;
    public aqel f;
    public aqen g;
    public aqeo h;
    public aqdi i;
    private byte k = 2;

    static {
        asli asliVar = new asli();
        a = asliVar;
        aopi.registerDefaultInstance(asli.class, asliVar);
    }

    private asli() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.k);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.k = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\uf143ᠤﭮⰜ\u0007\u0000\u0000\u0007\uf143ᠤᐉ\u0000\ue567ᠲᐉ\u0001\uef41ᠸᐉ\u0006\uf2b9ᥚᐉ\u0005\uef78⌿ᐉ\u0004\uf20bⰌᐉ\u0002ﭮⰜᐉ\u0003", new Object[]{"b", "c", "d", "i", "h", "g", "e", "f"});
            case 3:
                return new asli();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = j;
                if (aorbVar == null) {
                    synchronized (asli.class) {
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
