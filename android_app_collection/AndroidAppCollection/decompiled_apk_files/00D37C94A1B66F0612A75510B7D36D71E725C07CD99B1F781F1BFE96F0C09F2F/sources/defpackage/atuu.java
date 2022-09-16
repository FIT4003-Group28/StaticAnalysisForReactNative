package defpackage;
/* compiled from: PG */
/* renamed from: atuu  reason: default package */
/* loaded from: classes2.dex */
public final class atuu extends aopi implements aoqv {
    public static final atuu a;
    private static volatile aorb d;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        atuu atuuVar = new atuu();
        a = atuuVar;
        aopi.registerDefaultInstance(atuu.class, atuuVar);
    }

    private atuu() {
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
                return newMessageInfo(a, "\u0001\u0001\u0001\u0000\ufaea䈠\ufaea䈠\u0001\u0000\u0000\u0001\ufaea䈠ᐼ\u0000", new Object[]{"c", "b", aqvq.class});
            case 3:
                return new atuu();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (atuu.class) {
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
