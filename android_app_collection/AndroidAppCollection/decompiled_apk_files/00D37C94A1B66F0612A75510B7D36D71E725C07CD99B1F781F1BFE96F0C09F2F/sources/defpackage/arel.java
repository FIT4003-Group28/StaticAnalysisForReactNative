package defpackage;
/* compiled from: PG */
/* renamed from: arel  reason: default package */
/* loaded from: classes2.dex */
public final class arel extends aopi implements aoqv {
    public static final arel a;
    private static volatile aorb b;
    private int c;
    private arag d;
    private arag e;
    private arag f;
    private arag g;
    private arag h;
    private apzg i;
    private arag j;
    private ates k;
    private aoux l;
    private arag m;
    private byte n = 2;

    static {
        arel arelVar = new arel();
        a = arelVar;
        aopi.registerDefaultInstance(arel.class, arelVar);
    }

    private arel() {
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
                return Byte.valueOf(this.n);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.n = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\n\u0000\u0001\u0003\u0010\n\u0000\u0000\n\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0005\u0006ᐉ\u0006\u0007ᐉ\u0007\bᐉ\b\fᐉ\u000b\u000eᐉ\r\u000fᐉ\u0004\u0010ᐉ\t", new Object[]{"c", "d", "e", "g", "h", "i", "j", "l", "m", "f", "k"});
            case 3:
                return new arel();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (arel.class) {
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
