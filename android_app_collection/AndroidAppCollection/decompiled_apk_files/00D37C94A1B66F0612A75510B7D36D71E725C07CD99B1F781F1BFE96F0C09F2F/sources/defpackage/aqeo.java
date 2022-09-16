package defpackage;
/* compiled from: PG */
/* renamed from: aqeo  reason: default package */
/* loaded from: classes2.dex */
public final class aqeo extends aopi implements aoqv {
    public static final aqeo a;
    private static volatile aorb l;
    public int b;
    public avhn c;
    public arag d;
    public apzg f;
    public ates g;
    public arag h;
    public arag i;
    public arag j;
    public aoob k;
    private apzg m;
    private arag n;
    private asow o;
    private aoux p;
    private arag q;
    private byte r = 2;
    public aopu e = emptyProtobufList();

    static {
        aqeo aqeoVar = new aqeo();
        a = aqeoVar;
        aopi.registerDefaultInstance(aqeo.class, aqeoVar);
    }

    private aqeo() {
        emptyProtobufList();
        this.k = aoob.b;
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
                return newMessageInfo(a, "\u0001\u000e\u0000\u0001\u0002\u0013\u000e\u0000\u0001\r\u0002ᐉ\u0001\u0003ᐉ\u0002\u0005ᐉ\u0004\u0007ᐉ\b\bᐉ\u000f\tᐉ\u0005\nᐉ\n\u000bᐉ\u000b\fည\u0010\u000eᐉ\u0011\u000fᐉ\t\u0010ᐉ\f\u0012ᐉ\u0006\u0013Л", new Object[]{"b", "c", "d", "f", "h", "p", "m", "j", "n", "k", "q", "i", "o", "g", "e", avhc.class});
            case 3:
                return new aqeo();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = l;
                if (aorbVar == null) {
                    synchronized (aqeo.class) {
                        aorbVar = l;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            l = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
