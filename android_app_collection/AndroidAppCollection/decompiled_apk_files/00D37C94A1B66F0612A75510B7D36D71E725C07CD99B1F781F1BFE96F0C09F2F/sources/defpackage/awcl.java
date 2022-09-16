package defpackage;
/* compiled from: PG */
/* renamed from: awcl  reason: default package */
/* loaded from: classes2.dex */
public final class awcl extends aopi implements aoqv {
    private static final awcl a;
    private static volatile aorb b;
    private int c;
    private int d;

    static {
        awcl awclVar = new awcl();
        a = awclVar;
        aopi.registerDefaultInstance(awcl.class, awclVar);
    }

    private awcl() {
    }

    public static awck a() {
        return (awck) a.createBuilder();
    }

    public static /* synthetic */ void c(awcl awclVar, int i) {
        awclVar.d(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i) {
        this.c |= 1;
        this.d = i;
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"c", "d"});
            case 3:
                return new awcl();
            case 4:
                return new awck();
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (awcl.class) {
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
