package defpackage;
/* compiled from: PG */
/* renamed from: auxo  reason: default package */
/* loaded from: classes2.dex */
public final class auxo extends aopi implements aoqv {
    public static final auxo a;
    private static volatile aorb f;
    public int b;
    public auxa d;
    public auxa e;
    private aoux g;
    private byte h = 2;
    public aopu c = emptyProtobufList();

    static {
        auxo auxoVar = new auxo();
        a = auxoVar;
        aopi.registerDefaultInstance(auxo.class, auxoVar);
    }

    private auxo() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0004\u0001Л\u0002ᐉ\u0000\u0003ᐉ\u0001\u0004ᐉ\u0002", new Object[]{"b", "c", auwz.class, "d", "e", "g"});
            case 3:
                return new auxo();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (auxo.class) {
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
