package defpackage;
/* compiled from: PG */
/* renamed from: apho  reason: default package */
/* loaded from: classes.dex */
public final class apho extends aopi implements aoqv {
    public static final apho a;
    private static volatile aorb w;
    public int b;
    public arag c;
    public aunb d;
    public arag e;
    public aunb f;
    public avhn g;
    public aunb h;
    public float i;
    public int j;
    public arag k;
    public apzg l;
    public apzg m;
    public aunb n;
    public aunb o;
    public ates p;
    public apzg r;
    public aqgw s;
    public int t;
    public aunb v;
    private aoux x;
    private byte y = 2;
    public aopu q = emptyProtobufList();
    public aoob u = aoob.b;

    static {
        apho aphoVar = new apho();
        a = aphoVar;
        aopi.registerDefaultInstance(apho.class, aphoVar);
    }

    private apho() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.y);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.y = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0015\u0000\u0001\u0001\u0017\u0015\u0000\u0001\u0010\u0001ᐉ\u0000\u0002ᐉ\u0002\u0003ᐉ\u0004\u0004ခ\u0006\u0005ᐉ\b\u0006ᐉ\t\u0007ᐉ\r\bᐉ\u0012\tည\u0013\u000bЛ\fᐉ\u0014\u000eᐉ\u0001\u000fᐉ\u0003\u0010ᐉ\u0005\u0011ဉ\u0010\u0012ဋ\u0011\u0013ᐉ\u000b\u0014ဌ\u0007\u0015ᐉ\f\u0016ᐉ\u000e\u0017ᐉ\n", new Object[]{"b", "c", "e", "g", "i", "k", "l", "p", "x", "u", "q", apzg.class, "v", "d", "f", "h", "s", "t", "n", "j", auii.i, "o", "r", "m"});
            case 3:
                return new apho();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = w;
                if (aorbVar == null) {
                    synchronized (apho.class) {
                        aorbVar = w;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            w = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
