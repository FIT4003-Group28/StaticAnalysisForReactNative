package defpackage;
/* compiled from: PG */
/* renamed from: awrb  reason: default package */
/* loaded from: classes2.dex */
public final class awrb extends aopi implements aoqv {
    private static final awrb a;
    private static volatile aorb b;
    private int c;
    private awrg d;

    static {
        awrb awrbVar = new awrb();
        a = awrbVar;
        aopi.registerDefaultInstance(awrb.class, awrbVar);
    }

    private awrb() {
    }

    public static awra a() {
        return (awra) a.createBuilder();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(awrg awrgVar) {
        this.d = awrgVar;
        this.c |= 1;
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"c", "d"});
            case 3:
                return new awrb();
            case 4:
                return new awra();
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (awrb.class) {
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
