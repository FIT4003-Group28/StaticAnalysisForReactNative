package defpackage;
/* compiled from: PG */
/* renamed from: asab  reason: default package */
/* loaded from: classes2.dex */
public final class asab extends aopi implements aoqv {
    public static final asab a;
    private static volatile aorb r;
    public int b;
    public aswi c;
    public aswi d;
    public aswi e;
    public aopq f = emptyIntList();
    public int g;
    public aswi h;
    public aswi i;
    public aswi j;
    public aswi k;
    public aswi l;
    public aswi m;
    public aswi n;
    public aswg o;
    public aopu p;
    public awcg q;

    static {
        asab asabVar = new asab();
        a = asabVar;
        aopi.registerDefaultInstance(asab.class, asabVar);
    }

    private asab() {
        emptyProtobufList();
        this.p = emptyProtobufList();
        aoob aoobVar = aoob.b;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        switch (aophVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u000f\u0000\u0001\u0001\u0019\u000f\u0000\u0002\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0004\u0005ဉ\u0005\u0006ဉ\u0006\rဉ\u000e\u000eဉ\t\u000fဉ\u000f\u0010\u0016\u0011င\u0003\u0012ဉ\u0007\u0013ဉ\b\u0014\u001b\u0019ဉ\u0012", new Object[]{"b", "c", "d", "e", "h", "i", "j", "n", "m", "o", "f", "g", "k", "l", "p", auam.class, "q"});
            case 3:
                return new asab();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = r;
                if (aorbVar == null) {
                    synchronized (asab.class) {
                        aorbVar = r;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            r = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
