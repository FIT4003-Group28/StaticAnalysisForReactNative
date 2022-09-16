package defpackage;
/* compiled from: PG */
/* renamed from: auyh  reason: default package */
/* loaded from: classes2.dex */
public final class auyh extends aopi implements aoqv {
    public static final auyh a;
    private static volatile aorb i;
    public int b;
    public int c;
    public avhn d;
    public avhn e;
    public arag f;
    public arag g;
    public arag h;
    private apzg j;
    private arag k;
    private aunb l;
    private aunb m;
    private aunb n;
    private aunb o;
    private byte p = 2;

    static {
        auyh auyhVar = new auyh();
        a = auyhVar;
        aopi.registerDefaultInstance(auyh.class, auyhVar);
    }

    private auyh() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.p);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.p = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\f\u0000\u0001\u0001\u000f\f\u0000\u0000\u000b\u0001ဋ\u0000\u0002ᐉ\u0003\u0004ᐉ\u0007\u0005ᐉ\b\u0006ᐉ\n\u0007ᐉ\u0001\bᐉ\t\tᐉ\u000b\nᐉ\f\u000bᐉ\u0006\rᐉ\r\u000fᐉ\u0004", new Object[]{"b", "c", "e", "f", "g", "l", "d", "h", "m", "n", "k", "o", "j"});
            case 3:
                return new auyh();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = i;
                if (aorbVar == null) {
                    synchronized (auyh.class) {
                        aorbVar = i;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            i = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
