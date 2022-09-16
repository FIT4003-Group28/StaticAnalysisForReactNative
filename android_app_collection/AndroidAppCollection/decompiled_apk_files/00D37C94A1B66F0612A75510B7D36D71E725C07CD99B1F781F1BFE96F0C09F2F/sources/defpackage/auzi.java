package defpackage;
/* compiled from: PG */
/* renamed from: auzi  reason: default package */
/* loaded from: classes2.dex */
public final class auzi extends aopi implements aoqv {
    public static final auzi a;
    private static volatile aorb e;
    public int b;
    public avhn c;
    public aopu d;
    private aoux f;
    private byte g = 2;

    static {
        auzi auziVar = new auzi();
        a = auziVar;
        aopi.registerDefaultInstance(auzi.class, auziVar);
    }

    private auzi() {
        aoob aoobVar = aoob.b;
        this.d = emptyProtobufList();
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.g = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0003\u0001ᐉ\u0000\u0003ᐉ\u0002\u0004Л", new Object[]{"b", "c", "f", "d", avhn.class});
            case 3:
                return new auzi();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (auzi.class) {
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
