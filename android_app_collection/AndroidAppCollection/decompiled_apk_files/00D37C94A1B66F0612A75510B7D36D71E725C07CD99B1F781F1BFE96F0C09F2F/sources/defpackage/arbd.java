package defpackage;
/* compiled from: PG */
/* renamed from: arbd  reason: default package */
/* loaded from: classes2.dex */
public final class arbd extends aopi implements aoqv {
    public static final arbd a;
    private static volatile aorb m;
    public int b;
    public arag c;
    public arag e;
    public arag g;
    public apzg h;
    public arag i;
    public avvz j;
    private aoux n;
    private byte o = 2;
    public String d = "";
    public String f = "";
    public String k = "";
    public aoob l = aoob.b;

    static {
        arbd arbdVar = new arbd();
        a = arbdVar;
        aopi.registerDefaultInstance(arbd.class, arbdVar);
    }

    private arbd() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.o);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.o = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0007\u0001ᐉ\u0000\u0002ဈ\u0001\u0003ᐉ\u0002\u0004ဈ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005\u0007ᐉ\u0006\bᐉ\u0007\tဈ\b\nᐉ\t\u000bည\n", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "n", "l"});
            case 3:
                return new arbd();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = m;
                if (aorbVar == null) {
                    synchronized (arbd.class) {
                        aorbVar = m;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            m = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
