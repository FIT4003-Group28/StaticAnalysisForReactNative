package defpackage;
/* compiled from: PG */
/* renamed from: avvu  reason: default package */
/* loaded from: classes2.dex */
public final class avvu extends aopi implements aoqv {
    public static final avvu a;
    private static volatile aorb h;
    public int b;
    public avhn e;
    public arag f;
    private aoux i;
    private byte j = 2;
    public String c = "";
    public String d = "";
    public aoob g = aoob.b;

    static {
        avvu avvuVar = new avvu();
        a = avvuVar;
        aopi.registerDefaultInstance(avvu.class, avvuVar);
    }

    private avvu() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.j);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.j = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0003\u0001ဈ\u0000\u0002ဈ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0005\u0006ည\u0006", new Object[]{"b", "c", "d", "e", "f", "i", "g"});
            case 3:
                return new avvu();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (avvu.class) {
                        aorbVar = h;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            h = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
