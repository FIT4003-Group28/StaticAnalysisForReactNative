package defpackage;
/* compiled from: PG */
/* renamed from: anhd  reason: default package */
/* loaded from: classes.dex */
public final class anhd extends aopi implements aoqv {
    public static final anhd a;
    private static volatile aorb b;
    private int c;
    private int d;
    private aoui e;
    private aouj f;
    private aouh g;
    private byte h = 2;

    static {
        anhd anhdVar = new anhd();
        a = anhdVar;
        aopi.registerDefaultInstance(anhd.class, anhdVar);
    }

    private anhd() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0002!S\u0003\u0000\u0000\u0003!ᐉ\u0007Mᐉ/Sᐉ4", new Object[]{"c", "d", "e", "f", "g"});
            case 3:
                return new anhd();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (anhd.class) {
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
