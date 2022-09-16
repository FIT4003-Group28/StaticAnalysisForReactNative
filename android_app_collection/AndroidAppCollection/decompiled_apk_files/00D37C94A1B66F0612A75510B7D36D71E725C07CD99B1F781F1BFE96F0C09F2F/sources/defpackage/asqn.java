package defpackage;
/* compiled from: PG */
/* renamed from: asqn  reason: default package */
/* loaded from: classes2.dex */
public final class asqn extends aopi implements aoqv {
    public static final asqn a;
    private static volatile aorb f;
    public int b;
    public arag c;
    public asqm e;
    private aoux g;
    private byte h = 2;
    public aopu d = emptyProtobufList();

    static {
        asqn asqnVar = new asqn();
        a = asqnVar;
        aopi.registerDefaultInstance(asqn.class, asqnVar);
    }

    private asqn() {
        aoob aoobVar = aoob.b;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.h = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0001\u0004\u0001ᐉ\u0002\u0003ᐉ\u0000\u0004Л\u0005ᐉ\u0001", new Object[]{"b", "g", "c", "d", arag.class, "e"});
            case 3:
                return new asqn();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (asqn.class) {
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
