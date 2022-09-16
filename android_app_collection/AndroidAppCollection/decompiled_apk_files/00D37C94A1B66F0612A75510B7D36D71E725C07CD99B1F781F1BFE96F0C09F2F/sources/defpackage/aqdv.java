package defpackage;
/* compiled from: PG */
/* renamed from: aqdv  reason: default package */
/* loaded from: classes2.dex */
public final class aqdv extends aopi implements aoqv {
    public static final aqdv a;
    private static volatile aorb n;
    public int b;
    public Object d;
    public Object f;
    public arag g;
    public arag h;
    public aqdx i;
    public aqdw j;
    public aqds k;
    public aqdt l;
    public aoob m;
    private aplw o;
    private arag p;
    private aoux q;
    public int c = 0;
    public int e = 0;
    private byte r = 2;

    static {
        aqdv aqdvVar = new aqdv();
        a = aqdvVar;
        aopi.registerDefaultInstance(aqdv.class, aqdvVar);
    }

    private aqdv() {
        emptyProtobufList();
        this.m = aoob.b;
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
                return newMessageInfo(a, "\u0001\u0011\u0002\u0001\u0001\u0017\u0011\u0000\u0000\r\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0005\u0004ᐼ\u0000\u0005ᐼ\u0001\u0006ᐼ\u0001\u0007ᐉ\u0013\bည\u0014\nᐉ\u0003\u000bᐉ\u0004\rဉ\r\u000eᐼ\u0001\u0010ᐼ\u0000\u0011ဉ\u000f\u0012ဉ\u0010\u0014ᐼ\u0001\u0017ᐼ\u0001", new Object[]{"d", "c", "f", "e", "b", "g", "h", "i", apzg.class, arag.class, arag.class, "q", "m", "o", "p", "j", aqdu.class, apzg.class, "k", "l", arhs.class, aunb.class});
            case 3:
                return new aqdv();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = n;
                if (aorbVar == null) {
                    synchronized (aqdv.class) {
                        aorbVar = n;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            n = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
