package defpackage;
/* compiled from: PG */
/* renamed from: avqx  reason: default package */
/* loaded from: classes2.dex */
public final class avqx extends aopi implements aoqv {
    public static final avqx a;
    private static volatile aorb b;
    private int c;
    private arag d;
    private arag e;
    private arag f;
    private apzg g;
    private avqw h;
    private aoux i;
    private aunb j;
    private aunb k;
    private byte l = 2;

    static {
        avqx avqxVar = new avqx();
        a = avqxVar;
        aopi.registerDefaultInstance(avqx.class, avqxVar);
    }

    private avqx() {
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
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\u000b\b\u0000\u0000\b\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0005\u0007ᐉ\u0004\nᐉ\t\u000bᐉ\n", new Object[]{"c", "d", "e", "f", "g", "i", "h", "j", "k"});
            case 3:
                return new avqx();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (avqx.class) {
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
