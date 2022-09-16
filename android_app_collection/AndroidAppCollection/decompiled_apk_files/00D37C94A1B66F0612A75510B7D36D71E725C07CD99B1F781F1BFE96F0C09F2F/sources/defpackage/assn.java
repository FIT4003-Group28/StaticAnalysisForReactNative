package defpackage;
/* compiled from: PG */
/* renamed from: assn  reason: default package */
/* loaded from: classes2.dex */
public final class assn extends aopi implements aoqv {
    public static final assn a;
    public static final aopg b;
    private static volatile aorb m;
    public int c;
    public assl e;
    public assm g;
    public assk h;
    public boolean l;
    private aunb n;
    private aoux o;
    private asso p;
    private aunb q;
    private byte r = 2;
    public aopu d = emptyProtobufList();
    public aopu f = emptyProtobufList();
    public aopu i = emptyProtobufList();
    public aoob j = aoob.b;
    public String k = "";

    static {
        assn assnVar = new assn();
        a = assnVar;
        aopi.registerDefaultInstance(assn.class, assnVar);
        b = aopi.newSingularGeneratedExtension(auna.a, assnVar, assnVar, null, 117294427, aosj.MESSAGE, assn.class);
    }

    private assn() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.r);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.r = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\r\u0000\u0001\u0001\u0013\r\u0000\u0003\n\u0001Л\u0002Л\u0003ᐉ\u0004\u0005ᐉ\u0003\u0006ᐉ\u0001\bᐉ\u0006\tည\u0007\fЛ\u000eᐉ\t\u000fဈ\n\u0010ဇ\u000b\u0012ᐉ\u0000\u0013ᐉ\r", new Object[]{"c", "d", assp.class, "f", apzg.class, "h", "g", "e", "o", "j", "i", aqup.class, "p", "k", "l", "n", "q"});
            case 3:
                return new assn();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = m;
                if (aorbVar == null) {
                    synchronized (assn.class) {
                        aorbVar = m;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            m = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
