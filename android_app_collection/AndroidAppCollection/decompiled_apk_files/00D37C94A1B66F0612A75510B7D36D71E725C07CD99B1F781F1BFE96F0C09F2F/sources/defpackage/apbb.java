package defpackage;
/* compiled from: PG */
/* renamed from: apbb  reason: default package */
/* loaded from: classes.dex */
public final class apbb extends aopd implements aope {
    public static final apbb a;
    private static volatile aorb t;
    public int b;
    public avhn c;
    public aunb d;
    public arag e;
    public aunb f;
    public arag g;
    public aunb h;
    public arag i;
    public apzg j;
    public float k;
    public avhn n;
    public int o;
    public aunb p;
    public apbc r;
    public float s;
    private aoux u;
    private byte v = 2;
    public aopu m = emptyProtobufList();
    public aoob q = aoob.b;

    static {
        apbb apbbVar = new apbb();
        a = apbbVar;
        aopi.registerDefaultInstance(apbb.class, apbbVar);
    }

    private apbb() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.v);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.v = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0011\u0000\u0001\u0001\u0011\u0011\u0000\u0001\f\u0001ᐉ\u0000\u0002ᐉ\u0002\u0003ᐉ\u0004\u0004ᐉ\u0006\u0005ᐉ\u0007\u0006ခ\b\u0007Л\bᐉ\f\tည\r\nᐉ\t\u000bᐉ\u0001\fᐉ\u0003\rᐉ\u0005\u000eဋ\n\u000fᐉ\u000b\u0010ဉ\u000e\u0011ခ\u000f", new Object[]{"b", "c", "e", "g", "i", "j", "k", "m", apzg.class, "u", "q", "n", "d", "f", "h", "o", "p", "r", "s"});
            case 3:
                return new apbb();
            case 4:
                return new aopc(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = t;
                if (aorbVar == null) {
                    synchronized (apbb.class) {
                        aorbVar = t;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            t = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
