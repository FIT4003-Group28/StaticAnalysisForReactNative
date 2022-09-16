package defpackage;
/* compiled from: PG */
/* renamed from: argc  reason: default package */
/* loaded from: classes2.dex */
public final class argc extends aopi implements aoqv {
    public static final argc a;
    private static volatile aorb l;
    public int b;
    public Object d;
    public boolean e;
    public arag f;
    public arag g;
    public float i;
    public argb j;
    public argb k;
    private aoux m;
    public int c = 0;
    private byte n = 2;
    public aoob h = aoob.b;

    static {
        argc argcVar = new argc();
        a = argcVar;
        aopi.registerDefaultInstance(argc.class, argcVar);
    }

    private argc() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.n);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.n = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u000b\u0001\u0001\u0001\r\u000b\u0000\u0000\u0005\u0001ᐉ\u0001\u0002ᐉ\u0004\u0003ည\u0005\u0005ᐉ\u0002\u0006ခ\u0007\u0007ᐉ\b\bᐉ\t\tဇ\u0000\u000bဿ\u0000\fြ\u0000\rြ\u0000", new Object[]{"d", "c", "b", "f", "m", "h", "g", "i", "j", "k", "e", arfp.g, apmy.class, avgj.class});
            case 3:
                return new argc();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = l;
                if (aorbVar == null) {
                    synchronized (argc.class) {
                        aorbVar = l;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            l = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
