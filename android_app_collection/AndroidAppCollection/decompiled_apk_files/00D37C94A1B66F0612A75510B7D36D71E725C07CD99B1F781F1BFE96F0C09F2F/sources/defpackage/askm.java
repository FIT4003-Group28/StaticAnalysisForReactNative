package defpackage;
/* compiled from: PG */
/* renamed from: askm  reason: default package */
/* loaded from: classes2.dex */
public final class askm extends aopi implements aoqv {
    public static final askm a;
    private static volatile aorb b;
    private int c;
    private apok d;
    private apok e;
    private asko f;
    private atpw g;
    private aoux h;
    private arag i;
    private arag j;
    private arag k;
    private arag l;
    private byte m = 2;

    static {
        askm askmVar = new askm();
        a = askmVar;
        aopi.registerDefaultInstance(askm.class, askmVar);
    }

    private askm() {
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
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0002\u0016\t\u0000\u0000\t\u0002ᐉ\u0002\u0003ᐉ\u0003\u0006ᐉ\u0007\bᐉ\b\nᐉ\u000b\u0011ᐉ\r\u0012ᐉ\u000e\u0015ᐉ\u0011\u0016ᐉ\u0012", new Object[]{"c", "d", "e", "f", "g", "h", "i", "j", "k", "l"});
            case 3:
                return new askm();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (askm.class) {
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
