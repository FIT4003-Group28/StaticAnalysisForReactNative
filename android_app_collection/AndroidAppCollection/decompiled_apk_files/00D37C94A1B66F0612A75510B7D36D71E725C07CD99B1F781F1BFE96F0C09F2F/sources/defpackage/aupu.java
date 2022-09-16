package defpackage;
/* compiled from: PG */
/* renamed from: aupu  reason: default package */
/* loaded from: classes2.dex */
public final class aupu extends aopi implements aoqv {
    public static final aupu a;
    private static volatile aorb p;
    public int b;
    public Object d;
    public Object f;
    public int g;
    public arag h;
    public arag i;
    public aovs k;
    public boolean l;
    public arhs m;
    public aupt n;
    public boolean o;
    private aoux q;
    public int c = 0;
    public int e = 0;
    private byte r = 2;
    public aoob j = aoob.b;

    static {
        aupu aupuVar = new aupu();
        a = aupuVar;
        aopi.registerDefaultInstance(aupu.class, aupuVar);
    }

    private aupu() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.r);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.r = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u000e\u0002\u0001\u0001\u000e\u000e\u0000\u0000\b\u0001ᐼ\u0000\u0002ျ\u0000\u0003ဌ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐼ\u0001\u0007ᐉ\u0007\bည\b\tဉ\t\nဇ\n\u000bᐼ\u0001\fᐉ\u000b\rᐉ\f\u000eဇ\r", new Object[]{"d", "c", "f", "e", "b", avhn.class, "g", apsx.a(), "h", "i", apzg.class, "q", "j", "k", "l", aupv.class, "m", "n", "o"});
            case 3:
                return new aupu();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = p;
                if (aorbVar == null) {
                    synchronized (aupu.class) {
                        aorbVar = p;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            p = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
