package defpackage;
/* compiled from: PG */
/* renamed from: aukb  reason: default package */
/* loaded from: classes2.dex */
public final class aukb extends aopi implements aoqv {
    public static final aukb a;
    private static volatile aorb p;
    public int b;
    public arag c;
    public avhn d;
    public apzg g;
    public arag h;
    public arag i;
    public arag j;
    public ates k;
    public arag l;
    public int m;
    public aoob n;
    public apuq o;
    private arag q;
    private aoxw r;
    private aoxw s;
    private aoux t;
    private arag u;
    private byte v = 2;
    public aopu e = emptyProtobufList();
    public aopu f = emptyProtobufList();

    static {
        aukb aukbVar = new aukb();
        a = aukbVar;
        aopi.registerDefaultInstance(aukb.class, aukbVar);
    }

    private aukb() {
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        this.n = aoob.b;
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
                return newMessageInfo(a, "\u0001\u0012\u0000\u0001\u0002\u0018\u0012\u0000\u0002\u0010\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005\bᐉ\u0010\tည\u0011\rᐉ\u0013\u000eᐉ\u0006\u000fᐉ\b\u0011Л\u0012ᐉ\t\u0013ဌ\n\u0014Л\u0015ᐉ\u0014\u0016ᐉ\u0007\u0017ᐉ\u000b\u0018ᐉ\f", new Object[]{"b", "c", "d", "q", "g", "h", "t", "n", "u", "i", "k", "f", avhc.class, "l", "m", auii.h, "e", avhn.class, "o", "j", "r", "s"});
            case 3:
                return new aukb();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = p;
                if (aorbVar == null) {
                    synchronized (aukb.class) {
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
