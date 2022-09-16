package defpackage;
/* compiled from: PG */
/* renamed from: awau  reason: default package */
/* loaded from: classes2.dex */
public final class awau extends aopi implements aoqv {
    public static final awau a;
    private static volatile aorb b;
    private int c;
    private awaw d;
    private arag e;
    private arag f;
    private awav g;
    private awax h;
    private arag i;
    private arag j;
    private apzg k;
    private apzg l;
    private aoux m;
    private byte n = 2;

    static {
        awau awauVar = new awau();
        a = awauVar;
        aopi.registerDefaultInstance(awau.class, awauVar);
    }

    private awau() {
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
                return newMessageInfo(a, "\u0001\n\u0000\u0001\u0001\u000e\n\u0000\u0000\n\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005\u0007ᐉ\u0006\bᐉ\f\fᐉ\t\u000eᐉ\n", new Object[]{"c", "d", "e", "f", "g", "h", "i", "j", "m", "k", "l"});
            case 3:
                return new awau();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (awau.class) {
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
