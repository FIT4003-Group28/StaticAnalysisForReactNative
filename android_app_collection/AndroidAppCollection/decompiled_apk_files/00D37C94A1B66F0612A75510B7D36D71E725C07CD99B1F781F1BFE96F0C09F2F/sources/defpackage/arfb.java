package defpackage;
/* compiled from: PG */
/* renamed from: arfb  reason: default package */
/* loaded from: classes2.dex */
public final class arfb extends aopi implements aoqv {
    public static final arfb a;
    private static volatile aorb m;
    public int b;
    public arag c;
    public auvu d;
    public apzg f;
    public arag g;
    public arag h;
    public apmg i;
    public ates j;
    public asxo k;
    private apzg n;
    private apmg o;
    private aunb p;
    private aoux q;
    private byte r = 2;
    public aopu e = emptyProtobufList();
    public aoob l = aoob.b;

    static {
        arfb arfbVar = new arfb();
        a = arfbVar;
        aopi.registerDefaultInstance(arfb.class, arfbVar);
    }

    private arfb() {
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
                return newMessageInfo(a, "\u0001\u000e\u0000\u0001\u0001\u0012\u000e\u0000\u0001\f\u0001ᐉ\u0000\u0002ᐉ\u0001\u0004ᐉ\u0002\u0005ᐉ\u0004\u0006ᐉ\u0005\u0007ᐉ\u0007\bᐉ\t\tᐉ\u000b\nည\f\u000bЛ\rᐉ\u0003\u000eᐉ\b\u000fᐉ\u0006\u0012ဉ\n", new Object[]{"b", "c", "d", "f", "g", "h", "i", "j", "q", "l", "e", avhc.class, "n", "p", "o", "k"});
            case 3:
                return new arfb();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = m;
                if (aorbVar == null) {
                    synchronized (arfb.class) {
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
