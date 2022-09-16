package defpackage;
/* compiled from: PG */
/* renamed from: avmx  reason: default package */
/* loaded from: classes2.dex */
public final class avmx extends aopi implements aoqv {
    public static final avmx a;
    private static volatile aorb c;
    public apok b;
    private int d;
    private arag e;
    private aoux f;
    private byte g = 2;

    static {
        avmx avmxVar = new avmx();
        a = avmxVar;
        aopi.registerDefaultInstance(avmx.class, avmxVar);
    }

    private avmx() {
        aoob aoobVar = aoob.b;
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0002\u0005\u0003\u0000\u0000\u0003\u0002ᐉ\u0001\u0004ᐉ\u0004\u0005ᐉ\u0005", new Object[]{"d", "e", "b", "f"});
            case 3:
                return new avmx();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = c;
                if (aorbVar == null) {
                    synchronized (avmx.class) {
                        aorbVar = c;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            c = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
