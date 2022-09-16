package defpackage;
/* compiled from: PG */
/* renamed from: awdi  reason: default package */
/* loaded from: classes2.dex */
public final class awdi extends aopi implements aoqv {
    public static final awdi a;
    private static volatile aorb o;
    public int b;
    public avhn c;
    public arag d;
    public arag e;
    public arag f;
    public arag g;
    public apzg h;
    public int k;
    public ates l;
    private avss p;
    private aunb q;
    private aoux r;
    private byte s = 2;
    public aopu i = emptyProtobufList();
    public aopu j = emptyProtobufList();
    public String m = "";
    public aoob n = aoob.b;

    static {
        awdi awdiVar = new awdi();
        a = awdiVar;
        aopi.registerDefaultInstance(awdi.class, awdiVar);
    }

    private awdi() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.s);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.s = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u000f\u0000\u0001\u0001\u0010\u000f\u0000\u0002\f\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0004\u0005ᐉ\u0006\u0006ᐉ\r\u0007ည\u000e\tЛ\nЛ\u000bဌ\b\fᐉ\t\rဈ\n\u000eᐉ\u0003\u000fᐉ\u0005\u0010ᐉ\u000b", new Object[]{"b", "c", "d", "e", "g", "h", "r", "n", "i", avhc.class, "j", awdf.class, "k", awbk.f, "l", "m", "f", "p", "q"});
            case 3:
                return new awdi();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = o;
                if (aorbVar == null) {
                    synchronized (awdi.class) {
                        aorbVar = o;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            o = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
