package defpackage;
/* compiled from: PG */
/* renamed from: awqa  reason: default package */
/* loaded from: classes2.dex */
public final class awqa extends aopi implements aoqv {
    public static final awqa a;
    private static volatile aorb c;
    public awpx b;
    private int d;
    private awmt e;
    private awmt f;
    private awpm g;
    private awmt h;
    private aoxw i;
    private byte j = 2;

    static {
        awqa awqaVar = new awqa();
        a = awqaVar;
        aopi.registerDefaultInstance(awqa.class, awqaVar);
    }

    private awqa() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.j);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.j = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\t\u0006\u0000\u0000\u0006\u0001ᐉ\u0000\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005\bᐉ\u0007\tᐉ\b", new Object[]{"d", "b", "e", "f", "g", "h", "i"});
            case 3:
                return new awqa();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = c;
                if (aorbVar == null) {
                    synchronized (awqa.class) {
                        aorbVar = c;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            c = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
