package defpackage;
/* compiled from: PG */
/* renamed from: asrm  reason: default package */
/* loaded from: classes2.dex */
public final class asrm extends aopi implements aoqv {
    public static final asrm a;
    private static volatile aorb t;
    public int b;
    public Object d;
    public arag e;
    public assu f;
    public long i;
    public long j;
    public asri k;
    public asrk l;
    public asrl m;
    public aopu n;
    public aunb o;
    public aunb p;
    public aoob q;
    public boolean r;
    public arag s;
    private arag u;
    private aoux v;
    public int c = 0;
    private byte w = 2;
    public aopu g = emptyProtobufList();
    public String h = "";

    static {
        asrm asrmVar = new asrm();
        a = asrmVar;
        aopi.registerDefaultInstance(asrm.class, asrmVar);
    }

    private asrm() {
        aopi.emptyProtobufList();
        this.n = emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        this.q = aoob.b;
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
                return newMessageInfo(a, "\u0001\u0013\u0001\u0001\u0001\u0018\u0013\u0000\u0002\f\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003Л\u0004ျ\u0000\u0005ဂ\u0006\u0006ᐉ\t\u0007ᐉ\n\bᐉ\u000b\tဂ\u0007\nဈ\u0005\u000bЛ\u0010ᐉ\r\u0012ᐉ\u000f\u0013ည\u0010\u0014ဇ\u0011\u0015ᐼ\u0000\u0016ဉ\u0002\u0017ᐉ\u0012\u0018ᐉ\u000e", new Object[]{"d", "c", "b", "e", "u", "g", asro.class, "i", "k", "l", "m", "j", "h", "n", asrr.class, "o", "v", "q", "r", asrh.class, "f", "s", "p"});
            case 3:
                return new asrm();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = t;
                if (aorbVar == null) {
                    synchronized (asrm.class) {
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
