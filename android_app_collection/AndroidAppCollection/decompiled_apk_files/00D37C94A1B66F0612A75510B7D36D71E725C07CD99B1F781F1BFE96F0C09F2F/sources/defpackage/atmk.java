package defpackage;
/* compiled from: PG */
/* renamed from: atmk  reason: default package */
/* loaded from: classes2.dex */
public final class atmk extends aopi implements aoqv {
    public static final atmk a;
    private static volatile aorb b;
    private int c;
    private arag d;
    private arag e;
    private arag f;
    private arag g;
    private arag h;
    private aunb i;
    private aunb j;
    private apzg k;
    private apzg l;
    private aoux m;
    private aunb n;
    private byte o = 2;

    static {
        atmk atmkVar = new atmk();
        a = atmkVar;
        aopi.registerDefaultInstance(atmk.class, atmkVar);
    }

    private atmk() {
        aoob aoobVar = aoob.b;
        emptyProtobufList();
        emptyProtobufList();
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.o);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.o = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u000b\u0000\u0001\u0001\u0010\u000b\u0000\u0000\u000b\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0005\u0006ᐉ\t\u0007ᐉ\u000b\u000bᐉ\u000e\fᐉ\n\u000fᐉ\u0004\u0010ᐉ\u0007", new Object[]{"c", "d", "e", "f", "g", "i", "k", "m", "n", "l", "h", "j"});
            case 3:
                return new atmk();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (atmk.class) {
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
