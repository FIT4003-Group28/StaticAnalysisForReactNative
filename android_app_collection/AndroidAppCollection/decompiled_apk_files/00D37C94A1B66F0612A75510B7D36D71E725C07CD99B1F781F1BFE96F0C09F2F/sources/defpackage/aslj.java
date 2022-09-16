package defpackage;
/* compiled from: PG */
/* renamed from: aslj  reason: default package */
/* loaded from: classes2.dex */
public final class aslj extends aopi implements aoqv {
    public static final aslj a;
    private static volatile aorb e;
    public int b;
    public arag d;
    private arag f;
    private aoux g;
    private byte h = 2;
    public aopu c = emptyProtobufList();

    static {
        aslj asljVar = new aslj();
        a = asljVar;
        aopi.registerDefaultInstance(aslj.class, asljVar);
    }

    private aslj() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0001\u0004\u0001Л\u0002ᐉ\u0000\u0004ᐉ\u0002\u0005ᐉ\u0004", new Object[]{"b", "c", asli.class, "f", "g", "d"});
            case 3:
                return new aslj();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (aslj.class) {
                        aorbVar = e;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            e = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
