package defpackage;
/* compiled from: PG */
/* renamed from: auho  reason: default package */
/* loaded from: classes2.dex */
public final class auho extends aopi implements aoqv {
    public static final auho a;
    private static volatile aorb s;
    public int b;
    public avhn c;
    public arag d;
    public float e;
    public arag f;
    public arag g;
    public apzg h;
    public apok j;
    public ates k;
    public auhm l;
    public long m;
    public long n;
    public auhn o;
    public aozy p;
    private aoux t;
    private byte u = 2;
    public aopu i = emptyProtobufList();
    public aoob q = aoob.b;
    public String r = "";

    static {
        auho auhoVar = new auho();
        a = auhoVar;
        aopi.registerDefaultInstance(auho.class, auhoVar);
    }

    private auho() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.u);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.u = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0011\u0000\u0001\u0001\u0011\u0011\u0000\u0001\n\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ခ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005\u0007Л\bᐉ\u0006\tᐉ\u0007\nဉ\b\u000bᐉ\r\fည\u000e\rဂ\t\u000eဂ\n\u000fဉ\u000b\u0010ᐉ\f\u0011ဈ\u000f", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", apzg.class, "j", "k", "l", "t", "q", "m", "n", "o", "p", "r"});
            case 3:
                return new auho();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = s;
                if (aorbVar == null) {
                    synchronized (auho.class) {
                        aorbVar = s;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            s = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
