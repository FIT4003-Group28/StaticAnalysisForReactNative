package defpackage;
/* compiled from: PG */
/* renamed from: atda  reason: default package */
/* loaded from: classes2.dex */
public final class atda extends aopi implements aoqv {
    public static final atda a;
    private static volatile aorb f;
    public int b;
    public int c;
    public aopu d = emptyProtobufList();
    public aopu e = emptyProtobufList();

    static {
        atda atdaVar = new atda();
        a = atdaVar;
        aopi.registerDefaultInstance(atda.class, atdaVar);
    }

    private atda() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001ဌ\u0000\u0002\u001b\u0003\u001b", new Object[]{"b", "c", atck.s, "d", atcz.class, "e", atcz.class});
            case 3:
                return new atda();
            case 4:
                return new aopa((float[]) null, (char[]) null);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (atda.class) {
                        aorbVar = f;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            f = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
