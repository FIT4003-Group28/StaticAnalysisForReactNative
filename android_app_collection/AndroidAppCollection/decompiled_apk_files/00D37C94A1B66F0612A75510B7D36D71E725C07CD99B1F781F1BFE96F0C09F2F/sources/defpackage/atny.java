package defpackage;
/* compiled from: PG */
/* renamed from: atny  reason: default package */
/* loaded from: classes2.dex */
public final class atny extends aopi implements aoqv {
    private static final atny a;
    private static volatile aorb b;
    private int c;
    private long d;
    private int e;

    static {
        atny atnyVar = new atny();
        a = atnyVar;
        aopi.registerDefaultInstance(atny.class, atnyVar);
    }

    private atny() {
    }

    public static atnx a() {
        return (atnx) a.createBuilder();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(long j) {
        this.c |= 1;
        this.d = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(int i) {
        this.c |= 2;
        this.e = i;
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002င\u0001", new Object[]{"c", "d", "e"});
            case 3:
                return new atny();
            case 4:
                return new atnx();
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (atny.class) {
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
