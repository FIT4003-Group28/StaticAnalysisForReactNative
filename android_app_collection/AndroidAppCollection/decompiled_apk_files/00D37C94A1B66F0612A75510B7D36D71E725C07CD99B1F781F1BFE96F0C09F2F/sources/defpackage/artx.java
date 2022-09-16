package defpackage;
/* compiled from: PG */
/* renamed from: artx  reason: default package */
/* loaded from: classes2.dex */
public final class artx extends aopi implements aoqv {
    public static final artx a;
    private static volatile aorb f;
    public int b;
    public Object d;
    public aroy e;
    public int c = 0;
    private byte g = 2;

    static {
        artx artxVar = new artx();
        a = artxVar;
        aopi.registerDefaultInstance(artx.class, artxVar);
    }

    private artx() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.g = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0003\u0001\u0001\u0001\u0004\u0003\u0000\u0000\u0001\u0001ᐉ\u0000\u0003ျ\u0000\u0004ျ\u0000", new Object[]{"d", "c", "b", "e"});
            case 3:
                return new artx();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (artx.class) {
                        aorbVar = f;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            f = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
