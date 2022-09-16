package defpackage;
/* compiled from: PG */
/* renamed from: apbu  reason: default package */
/* loaded from: classes.dex */
public final class apbu extends aopi implements aoqv {
    public static final apbu a;
    private static volatile aorb d;
    public int b;
    public ateu c;
    private apoj e;
    private apbt f;
    private byte g = 2;

    static {
        apbu apbuVar = new apbu();
        a = apbuVar;
        aopi.registerDefaultInstance(apbu.class, apbuVar);
    }

    private apbu() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\ueb11ἑ\uf543㭚\u0003\u0000\u0000\u0003\ueb11ἑᐉ\u0000\ue97d✹ᐉ\u0002\uf543㭚ᐉ\u0001", new Object[]{"b", "e", "c", "f"});
            case 3:
                return new apbu();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (apbu.class) {
                        aorbVar = d;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            d = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
