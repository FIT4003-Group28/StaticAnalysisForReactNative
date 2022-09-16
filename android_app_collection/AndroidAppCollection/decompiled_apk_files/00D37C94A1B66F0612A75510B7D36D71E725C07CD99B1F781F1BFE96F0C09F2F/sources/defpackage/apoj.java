package defpackage;
/* compiled from: PG */
/* renamed from: apoj  reason: default package */
/* loaded from: classes.dex */
public final class apoj extends aopd implements aope {
    public static final apoj a;
    private static volatile aorb u;
    public int b;
    public Object d;
    public int e;
    public int f;
    public arhs g;
    public boolean h;
    public arag i;
    public argl m;
    public apzg n;
    public apzg o;
    public apzg p;
    public aovr r;
    public aovs s;
    private aoux v;
    public int c = 0;
    private byte w = 2;
    public String j = "";
    public String k = "";
    public aopu q = emptyProtobufList();
    public aoob t = aoob.b;

    static {
        apoj apojVar = new apoj();
        a = apojVar;
        aopi.registerDefaultInstance(apoj.class, apojVar);
    }

    private apoj() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.w);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.w = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0013\u0001\u0001\u0001\u0019\u0013\u0000\u0001\b\u0001ဿ\u0000\u0002ဌ\u0003\u0003ဇ\u0006\u0005ᐉ\b\u0007ᐉ\r\bᐉ\u0005\tᐉ\u000e\nဉ\u0010\u000bဈ\t\fᐉ\u0012\rည\u0014\u000eᐉ\f\u0010ဉ\u0011\u0011ြ\u0000\u0012ဈ\u000b\u0013ᐉ\u000f\u0014ြ\u0000\u0015Л\u0019ဌ\u0004", new Object[]{"d", "c", "b", apog.f, "e", apog.e, "h", "i", "n", "g", "o", "r", "j", "v", "t", "m", "s", apoi.class, "k", "p", avgj.class, "q", apzg.class, "f", apog.c});
            case 3:
                return new apoj();
            case 4:
                return new aopc(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = u;
                if (aorbVar == null) {
                    synchronized (apoj.class) {
                        aorbVar = u;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            u = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
