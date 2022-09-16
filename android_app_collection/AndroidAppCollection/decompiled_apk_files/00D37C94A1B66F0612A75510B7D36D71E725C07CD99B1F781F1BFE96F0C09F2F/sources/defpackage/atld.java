package defpackage;
/* compiled from: PG */
/* renamed from: atld  reason: default package */
/* loaded from: classes2.dex */
public final class atld extends aopi implements aoqv {
    public static final atld a;
    private static volatile aorb b;
    private int c;
    private atle d;
    private arag e;
    private arag f;
    private apzg g;
    private ates h;
    private aoux i;
    private atlc j;
    private byte k = 2;

    static {
        atld atldVar = new atld();
        a = atldVar;
        aopi.registerDefaultInstance(atld.class, atldVar);
    }

    private atld() {
        aoob aoobVar = aoob.b;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.k);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.k = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\t\u0007\u0000\u0000\u0007\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0005ᐉ\u0004\u0006ᐉ\u0005\u0007ᐉ\u0006\tᐉ\b", new Object[]{"c", "d", "e", "f", "g", "h", "i", "j"});
            case 3:
                return new atld();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (atld.class) {
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
