package defpackage;
/* compiled from: PG */
/* renamed from: atmq  reason: default package */
/* loaded from: classes2.dex */
public final class atmq extends aopi implements aoqv {
    public static final atmq a;
    private static volatile aorb b;
    private int c;
    private arag d;
    private aunb e;
    private aunb f;
    private aunb g;
    private aunb h;
    private aunb i;
    private aunb j;
    private aunb k;
    private aunb l;
    private aoux m;
    private byte n = 2;

    static {
        atmq atmqVar = new atmq();
        a = atmqVar;
        aopi.registerDefaultInstance(atmq.class, atmqVar);
    }

    private atmq() {
        aoob aoobVar = aoob.b;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.n);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.n = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\n\u0000\u0001\u0001\u000b\n\u0000\u0000\n\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005\u0007ᐉ\u0006\bᐉ\u0007\tᐉ\b\u000bᐉ\n", new Object[]{"c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m"});
            case 3:
                return new atmq();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (atmq.class) {
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
