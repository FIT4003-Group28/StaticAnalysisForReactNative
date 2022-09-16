package defpackage;
/* compiled from: PG */
/* renamed from: asxd  reason: default package */
/* loaded from: classes2.dex */
public final class asxd extends aopi implements aoqv {
    public static final asxd a;
    private static volatile aorb b;
    private int c;
    private arag d;
    private arag e;
    private apzg f;
    private ates g;
    private aoux h;
    private aunb i;
    private apok j;
    private byte k = 2;

    static {
        asxd asxdVar = new asxd();
        a = asxdVar;
        aopi.registerDefaultInstance(asxd.class, asxdVar);
    }

    private asxd() {
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
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\f\u0007\u0000\u0000\u0007\u0001ᐉ\u0000\u0002ᐉ\u0001\u0006ᐉ\u0005\u0007ᐉ\u0006\bᐉ\b\nᐉ\n\fᐉ\u000b", new Object[]{"c", "d", "e", "f", "g", "h", "i", "j"});
            case 3:
                return new asxd();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (asxd.class) {
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
