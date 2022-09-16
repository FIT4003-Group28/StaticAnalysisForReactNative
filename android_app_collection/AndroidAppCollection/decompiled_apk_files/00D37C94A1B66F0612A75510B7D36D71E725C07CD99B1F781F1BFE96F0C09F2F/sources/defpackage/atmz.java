package defpackage;
/* compiled from: PG */
/* renamed from: atmz  reason: default package */
/* loaded from: classes2.dex */
public final class atmz extends aopi implements aoqv {
    public static final atmz a;
    private static volatile aorb b;
    private int c;
    private atna d;
    private arag e;
    private arag f;
    private arag g;
    private apzg h;
    private ates i;
    private aoux j;
    private atmy k;
    private byte l = 2;

    static {
        atmz atmzVar = new atmz();
        a = atmzVar;
        aopi.registerDefaultInstance(atmz.class, atmzVar);
    }

    private atmz() {
        aoob aoobVar = aoob.b;
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
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\n\b\u0000\u0000\b\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0005ᐉ\u0005\u0006ᐉ\u0006\u0007ᐉ\u0007\tᐉ\t\nᐉ\u0003", new Object[]{"c", "d", "e", "f", "h", "i", "j", "k", "g"});
            case 3:
                return new atmz();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (atmz.class) {
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
