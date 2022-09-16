package defpackage;
/* compiled from: PG */
/* renamed from: awgz  reason: default package */
/* loaded from: classes2.dex */
public final class awgz extends aopi implements aoqv {
    public static final awgz a;
    private static volatile aorb d;
    public int b;
    public String c;

    static {
        awgz awgzVar = new awgz();
        a = awgzVar;
        aopi.registerDefaultInstance(awgz.class, awgzVar);
    }

    private awgz() {
        emptyIntList();
        this.c = "";
        emptyIntList();
        emptyIntList();
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u000b\u000b\u0001\u0000\u0000\u0000\u000bဈ\u000b", new Object[]{"b", "c"});
            case 3:
                return new awgz();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (awgz.class) {
                        aorbVar = d;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            d = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
