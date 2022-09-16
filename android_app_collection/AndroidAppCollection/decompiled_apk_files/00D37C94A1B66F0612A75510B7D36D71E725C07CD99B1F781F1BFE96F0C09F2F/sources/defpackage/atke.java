package defpackage;
/* compiled from: PG */
/* renamed from: atke  reason: default package */
/* loaded from: classes2.dex */
public final class atke extends aopi implements aoqv {
    public static final atke a;
    private static volatile aorb b;
    private int c;
    private arag d;
    private arag e;
    private arag f;
    private arag g;
    private arag h;
    private aunb i;
    private aunb j;
    private aunb k;
    private aunb l;
    private aunb m;
    private aunb n;
    private aoux o;
    private apzg p;
    private byte q = 2;

    static {
        atke atkeVar = new atke();
        a = atkeVar;
        aopi.registerDefaultInstance(atke.class, atkeVar);
    }

    private atke() {
        emptyProtobufList();
        aoob aoobVar = aoob.b;
        emptyProtobufList();
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.q);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.q = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\r\u0000\u0001\u0001\u0010\r\u0000\u0000\r\u0001ᐉ\u0000\u0002ᐉ\u0002\u0003ᐉ\u0006\u0004ᐉ\b\u0005ᐉ\t\u0006ᐉ\n\u0007ᐉ\u000b\tᐉ\u0004\nᐉ\u0005\rᐉ\u0001\u000eᐉ\r\u000fᐉ\u0003\u0010ᐉ\u0007", new Object[]{"c", "d", "f", "j", "l", "m", "n", "o", "h", "i", "e", "p", "g", "k"});
            case 3:
                return new atke();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (atke.class) {
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
