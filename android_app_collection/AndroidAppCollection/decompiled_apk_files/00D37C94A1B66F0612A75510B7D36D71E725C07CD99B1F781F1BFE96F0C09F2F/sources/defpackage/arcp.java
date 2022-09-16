package defpackage;
/* compiled from: PG */
/* renamed from: arcp  reason: default package */
/* loaded from: classes2.dex */
public final class arcp extends aopi implements aoqv {
    public static final arcp a;
    private static volatile aorb b;
    private int c;
    private aueo d;
    private arag e;
    private arag f;
    private arag g;
    private arag h;
    private arag i;
    private apzg j;
    private arag k;
    private ates l;
    private aoux m;
    private byte n = 2;

    static {
        arcp arcpVar = new arcp();
        a = arcpVar;
        aopi.registerDefaultInstance(arcp.class, arcpVar);
    }

    private arcp() {
        emptyProtobufList();
        emptyProtobufList();
        aoob aoobVar = aoob.b;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.n);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.n = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\n\u0000\u0001\u0002\u000f\n\u0000\u0000\n\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005\u0007ᐉ\u0006\bᐉ\u0007\tᐉ\b\fᐉ\t\u000fᐉ\f", new Object[]{"c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m"});
            case 3:
                return new arcp();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (arcp.class) {
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
