package defpackage;
/* compiled from: PG */
/* renamed from: aplp  reason: default package */
/* loaded from: classes.dex */
public final class aplp extends aopi implements aoqv {
    public static final aplp a;
    private static volatile aorb m;
    public int b;
    public arag c;
    public aunb d;
    public avhn e;
    public arag f;
    public arag g;
    public arag h;
    public int i;
    public apzg j;
    public apzg k;
    private aoux n;
    private byte o = 2;
    public String l = "";

    static {
        aplp aplpVar = new aplp();
        a = aplpVar;
        aopi.registerDefaultInstance(aplp.class, aplpVar);
    }

    private aplp() {
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
                return newMessageInfo(a, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\t\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005\u0007င\u0006\bᐉ\b\tᐉ\u0007\nᐉ\t\u000bဈ\n", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "n", "j", "k", "l"});
            case 3:
                return new aplp();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = m;
                if (aorbVar == null) {
                    synchronized (aplp.class) {
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
