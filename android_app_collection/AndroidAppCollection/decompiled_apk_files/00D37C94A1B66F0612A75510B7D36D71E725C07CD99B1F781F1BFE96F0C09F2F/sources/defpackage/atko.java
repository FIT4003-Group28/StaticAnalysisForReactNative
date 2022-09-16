package defpackage;
/* compiled from: PG */
/* renamed from: atko  reason: default package */
/* loaded from: classes2.dex */
public final class atko extends aopi implements aoqv {
    public static final atko a;
    private static volatile aorb b;
    private int c;
    private aunb d;
    private aunb e;
    private aunb f;
    private aunb g;
    private aunb h;
    private aunb i;
    private aunb j;
    private aunb k;
    private byte l = 2;

    static {
        atko atkoVar = new atko();
        a = atkoVar;
        aopi.registerDefaultInstance(atko.class, atkoVar);
    }

    private atko() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.l);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.l = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\n\b\u0000\u0000\b\u0001ᐉ\u0000\u0002ᐉ\u0002\u0003ᐉ\u0001\u0004ᐉ\u0003\u0005ᐉ\u0004\bᐉ\u0005\tᐉ\u0006\nᐉ\u0007", new Object[]{"c", "d", "f", "e", "g", "h", "i", "j", "k"});
            case 3:
                return new atko();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (atko.class) {
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
