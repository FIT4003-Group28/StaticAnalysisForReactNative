package defpackage;
/* compiled from: PG */
/* renamed from: atds  reason: default package */
/* loaded from: classes2.dex */
public final class atds extends aopi implements aoqv {
    public static final atds a;
    private static volatile aorb q;
    public int b;
    public avhn c;
    public arhs d;
    public atdr f;
    public atdr g;
    public int h;
    public boolean k;
    public arag l;
    public boolean m;
    public apzg n;
    public int o;
    private apzg r;
    private aoux s;
    private byte t = 2;
    public aopu e = emptyProtobufList();
    public aoob i = aoob.b;
    public aopu j = emptyProtobufList();
    public aopu p = emptyProtobufList();

    static {
        atds atdsVar = new atds();
        a = atdsVar;
        aopi.registerDefaultInstance(atds.class, atdsVar);
    }

    private atds() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.t);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.t = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0010\u0000\u0001\u0001\u0014\u0010\u0000\u0003\n\u0001ᐉ\u0000\u0002Л\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ဌ\u0006\bᐉ\b\tည\t\nЛ\u000bဇ\n\rᐉ\u0001\u000eᐉ\u000b\u000fဇ\f\u0010ᐉ\r\u0011င\u000e\u0014\u001b", new Object[]{"b", "c", "e", arag.class, "f", "g", "r", "h", atdq.c, "s", "i", "j", apzg.class, "k", "d", "l", "m", "n", "o", "p", apwb.class});
            case 3:
                return new atds();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = q;
                if (aorbVar == null) {
                    synchronized (atds.class) {
                        aorbVar = q;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            q = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
