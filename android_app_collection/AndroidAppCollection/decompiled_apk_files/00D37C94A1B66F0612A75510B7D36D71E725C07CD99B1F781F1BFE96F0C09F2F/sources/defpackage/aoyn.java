package defpackage;
/* compiled from: PG */
/* renamed from: aoyn  reason: default package */
/* loaded from: classes.dex */
public final class aoyn extends aopi implements aoqv {
    public static final aoyn a;
    private static volatile aorb b;
    private int c;
    private arag d;
    private arag e;
    private arag f;
    private arag g;
    private arag h;
    private arag i;
    private arag j;
    private apzg k;
    private aoux l;
    private byte m = 2;

    static {
        aoyn aoynVar = new aoyn();
        a = aoynVar;
        aopi.registerDefaultInstance(aoyn.class, aoynVar);
    }

    private aoyn() {
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
                return Byte.valueOf(this.m);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.m = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0005\u000f\t\u0000\u0000\t\u0005ᐉ\u0003\u0006ᐉ\u0004\u0007ᐉ\u0005\bᐉ\u0006\nᐉ\b\u000bᐉ\t\fᐉ\n\u000eᐉ\u000b\u000fᐉ\f", new Object[]{"c", "d", "e", "f", "g", "h", "i", "j", "k", "l"});
            case 3:
                return new aoyn();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (aoyn.class) {
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
