package defpackage;
/* compiled from: PG */
/* renamed from: awzq  reason: default package */
/* loaded from: classes2.dex */
public final class awzq extends aopi implements aoqv {
    private static final awzq a;
    private static volatile aorb b;
    private int c;
    private String d = "";

    static {
        awzq awzqVar = new awzq();
        a = awzqVar;
        aopi.registerDefaultInstance(awzq.class, awzqVar);
    }

    private awzq() {
    }

    public static awzp a() {
        return (awzp) a.createBuilder();
    }

    public static /* synthetic */ void c(awzq awzqVar, String str) {
        awzqVar.d(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(String str) {
        str.getClass();
        this.c |= 1;
        this.d = str;
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"c", "d"});
            case 3:
                return new awzq();
            case 4:
                return new awzp();
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (awzq.class) {
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
