package defpackage;
/* compiled from: PG */
/* renamed from: auze  reason: default package */
/* loaded from: classes2.dex */
public final class auze extends aopi implements aoqv {
    public static final auze a;
    private static volatile aorb b;
    private int c;
    private arag d;
    private arag e;
    private apok f;
    private apok g;
    private apok h;
    private arag i;
    private apzg j;
    private aoux k;
    private byte l = 2;

    static {
        auze auzeVar = new auze();
        a = auzeVar;
        aopi.registerDefaultInstance(auze.class, auzeVar);
    }

    private auze() {
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
                return newMessageInfo(a, "\u0001\b\u0000\u0001\b\u0011\b\u0000\u0000\b\bᐉ\u0007\tᐉ\t\nᐉ\n\u000bᐉ\u000b\fᐉ\f\rᐉ\u000e\u000fᐉ\u0010\u0011ᐉ\r", new Object[]{"c", "d", "e", "f", "g", "h", "j", "k", "i"});
            case 3:
                return new auze();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (auze.class) {
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
