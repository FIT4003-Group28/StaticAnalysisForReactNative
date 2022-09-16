package defpackage;
/* compiled from: PG */
/* renamed from: apuc  reason: default package */
/* loaded from: classes2.dex */
public final class apuc extends aopi implements aoqv {
    public static final apuc a;
    private static volatile aorb b;
    private int c;
    private arag d;
    private arag e;
    private arag f;
    private arag g;
    private apud h;
    private arag i;
    private arag j;
    private apok k;
    private byte l = 2;

    static {
        apuc apucVar = new apuc();
        a = apucVar;
        aopi.registerDefaultInstance(apuc.class, apucVar);
    }

    private apuc() {
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\u000b\b\u0000\u0000\b\u0001ᐉ\u0000\u0002ᐉ\u0001\u0004ᐉ\u0002\u0006ᐉ\t\u0007ᐉ\u0004\tᐉ\u0006\nᐉ\u0007\u000bᐉ\b", new Object[]{"c", "d", "e", "f", "k", "g", "h", "i", "j"});
            case 3:
                return new apuc();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (apuc.class) {
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
