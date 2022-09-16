package defpackage;
/* compiled from: PG */
/* renamed from: atin  reason: default package */
/* loaded from: classes2.dex */
public final class atin extends aopi implements aoqv {
    public static final atin a;
    private static volatile aorb b;
    private int c;
    private arag d;
    private arag e;
    private apzg f;
    private arag g;
    private arag h;
    private arag i;
    private arag j;
    private apdy k;
    private ates l;
    private aoux m;
    private asow n;
    private arag o;
    private byte p = 2;

    static {
        atin atinVar = new atin();
        a = atinVar;
        aopi.registerDefaultInstance(atin.class, atinVar);
    }

    private atin() {
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        aoob aoobVar = aoob.b;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.p);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.p = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\f\u0000\u0001\u0002\u0013\f\u0000\u0000\f\u0002ᐉ\u0001\u0005ᐉ\u0004\u0006ᐉ\u0005\u0007ᐉ\u0006\bᐉ\u0007\tᐉ\b\nᐉ\t\fᐉ\n\u000fᐉ\r\u0011ᐉ\u000f\u0012ᐉ\u0010\u0013ᐉ\u000b", new Object[]{"c", "d", "e", "f", "g", "h", "i", "j", "k", "m", "n", "o", "l"});
            case 3:
                return new atin();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (atin.class) {
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
