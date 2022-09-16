package defpackage;
/* compiled from: PG */
/* renamed from: avvy  reason: default package */
/* loaded from: classes2.dex */
public final class avvy extends aopi implements aoqv {
    public static final avvy a;
    private static volatile aorb h;
    public int b;
    public Object d;
    public arag e;
    public apzg f;
    public asir g;
    public int c = 0;
    private byte i = 2;

    static {
        avvy avvyVar = new avvy();
        a = avvyVar;
        aopi.registerDefaultInstance(avvy.class, avvyVar);
    }

    private avvy() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.i);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.i = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0002\u0001ြ\u0000\u0002ြ\u0000\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ဉ\u0004", new Object[]{"d", "c", "b", avvx.class, avvw.class, "e", "f", "g"});
            case 3:
                return new avvy();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (avvy.class) {
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
