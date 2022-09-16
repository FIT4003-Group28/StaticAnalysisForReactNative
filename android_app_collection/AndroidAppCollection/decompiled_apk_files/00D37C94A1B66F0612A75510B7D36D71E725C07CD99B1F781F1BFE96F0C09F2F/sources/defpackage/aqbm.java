package defpackage;
/* compiled from: PG */
/* renamed from: aqbm  reason: default package */
/* loaded from: classes2.dex */
public final class aqbm extends aopi implements aoqv {
    public static final aqbm a;
    public static final aopg b;
    private static volatile aorb j;
    public int c;
    public aopu d;
    public aopu e;
    public aoob f;
    public apok g;
    public boolean h;
    public String i;
    private arag k;
    private aoux l;
    private apzg m;
    private aqbn n;
    private arag o;
    private aunb p;
    private arag q;
    private aunb r;
    private aqbt s;
    private byte t = 2;

    static {
        aqbm aqbmVar = new aqbm();
        a = aqbmVar;
        aopi.registerDefaultInstance(aqbm.class, aqbmVar);
        b = aopi.newSingularGeneratedExtension(auna.a, aqbmVar, aqbmVar, null, 65060753, aosj.MESSAGE, aqbm.class);
    }

    private aqbm() {
        emptyProtobufList();
        this.d = emptyProtobufList();
        this.e = emptyProtobufList();
        this.f = aoob.b;
        this.i = "";
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.t);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.t = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u000f\u0000\u0001\u0001\u0013\u000f\u0000\u0002\f\u0001Л\u0002Л\u0003ᐉ\b\u0004ည\u0001\u0005ᐉ\u0002\u0006ᐉ\u0003\u0007ᐉ\n\bᐉ\u0004\nᐉ\u0000\fᐉ\u0005\u000fဇ\u0007\u0010ᐉ\t\u0011ᐉ\u000b\u0012ဈ\f\u0013ᐉ\r", new Object[]{"c", "d", aqax.class, "e", aqbt.class, "o", "f", "l", "m", "q", "g", "k", "n", "h", "p", "r", "i", "s"});
            case 3:
                return new aqbm();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = j;
                if (aorbVar == null) {
                    synchronized (aqbm.class) {
                        aorbVar = j;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            j = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
