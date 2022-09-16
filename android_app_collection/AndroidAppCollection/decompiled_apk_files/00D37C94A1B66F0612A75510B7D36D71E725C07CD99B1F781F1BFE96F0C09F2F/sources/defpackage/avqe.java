package defpackage;
/* compiled from: PG */
/* renamed from: avqe  reason: default package */
/* loaded from: classes2.dex */
public final class avqe extends aopi implements aoqv {
    public static final avqe a;
    private static volatile aorb b;
    private int c;
    private arag d;
    private arag e;
    private arag f;
    private ates g;
    private auuh h;
    private aoux i;
    private apok j;
    private aunb k;
    private byte l = 2;

    static {
        avqe avqeVar = new avqe();
        a = avqeVar;
        aopi.registerDefaultInstance(avqe.class, avqeVar);
    }

    private avqe() {
        aoob aoobVar = aoob.b;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.l);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.l = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\n\b\u0000\u0000\b\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0006ᐉ\u0005\bᐉ\u0007\tᐉ\b\nᐉ\t", new Object[]{"c", "d", "e", "f", "g", "h", "i", "j", "k"});
            case 3:
                return new avqe();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (avqe.class) {
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
