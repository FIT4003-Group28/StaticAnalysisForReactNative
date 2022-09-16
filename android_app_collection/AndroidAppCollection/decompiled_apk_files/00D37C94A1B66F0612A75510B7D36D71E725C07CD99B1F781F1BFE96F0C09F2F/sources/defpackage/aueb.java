package defpackage;
/* compiled from: PG */
/* renamed from: aueb  reason: default package */
/* loaded from: classes2.dex */
public final class aueb extends aopi implements aoqv {
    public static final aueb a;
    private static volatile aorb e;
    public int b;
    public apzg c;
    private arag f;
    private apzg g;
    private arag h;
    private arag i;
    private aoux j;
    private byte k = 2;
    public aopu d = emptyProtobufList();

    static {
        aueb auebVar = new aueb();
        a = auebVar;
        aopi.registerDefaultInstance(aueb.class, auebVar);
    }

    private aueb() {
        aoob aoobVar = aoob.b;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.k);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.k = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0001\u0007\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004Л\u0005ᐉ\u0005\u0007ᐉ\u0003\bᐉ\u0004", new Object[]{"b", "f", "c", "g", "d", auec.class, "j", "h", "i"});
            case 3:
                return new aueb();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (aueb.class) {
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
