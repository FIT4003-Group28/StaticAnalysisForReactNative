package defpackage;
/* compiled from: PG */
/* renamed from: atwa  reason: default package */
/* loaded from: classes2.dex */
public final class atwa extends aopi implements aoqv {
    public static final atwa a;
    private static volatile aorb c;
    public atwe b;
    private int d;
    private byte e = 2;

    static {
        atwa atwaVar = new atwa();
        a = atwaVar;
        aopi.registerDefaultInstance(atwa.class, atwaVar);
    }

    private atwa() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.e = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001ﰡ㺪ﰡ㺪\u0001\u0000\u0000\u0001ﰡ㺪ᐉ\u0000", new Object[]{"d", "b"});
            case 3:
                return new atwa();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = c;
                if (aorbVar == null) {
                    synchronized (atwa.class) {
                        aorbVar = c;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            c = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
