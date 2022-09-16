package defpackage;
/* compiled from: PG */
/* renamed from: angi  reason: default package */
/* loaded from: classes.dex */
public final class angi extends aopi implements aoqv {
    public static final angi a;
    private static volatile aorb b;
    private int c;
    private angh d;
    private int f;
    private angl g;
    private byte h = 2;
    private String e = "";

    static {
        angi angiVar = new angi();
        a = angiVar;
        aopi.registerDefaultInstance(angi.class, angiVar);
    }

    private angi() {
        aopi.emptyProtobufList();
        aopi.emptyProtobufList();
        emptyProtobufList();
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.h);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.h = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\b\u0004\u0000\u0000\u0004\u0001ᔉ\u0000\u0002ᔈ\u0001\u0003ᔄ\u0002\bᐉ\n", new Object[]{"c", "d", "e", "f", "g"});
            case 3:
                return new angi();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (angi.class) {
                        aorbVar = b;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            b = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
