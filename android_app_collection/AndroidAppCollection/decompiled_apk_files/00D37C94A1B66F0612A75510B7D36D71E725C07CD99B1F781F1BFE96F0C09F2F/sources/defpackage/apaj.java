package defpackage;
/* compiled from: PG */
/* renamed from: apaj  reason: default package */
/* loaded from: classes.dex */
public final class apaj extends aopi implements aoqv {
    public static final apaj a;
    private static volatile aorb t;
    public aopu d;
    public aopu e;
    public aopu f;
    public aopu g;
    public aopu h;
    public aopu i;
    public aopu j;
    public aopu k;
    public aopu l;
    public aopu m;
    public aopu n;
    public aopu o;
    public aopu p;
    public aopu q;
    public aopu r;
    public aopu s;
    private byte u = 2;
    public aopu b = emptyProtobufList();
    public aopu c = emptyProtobufList();

    static {
        apaj apajVar = new apaj();
        a = apajVar;
        aopi.registerDefaultInstance(apaj.class, apajVar);
    }

    private apaj() {
        emptyProtobufList();
        emptyProtobufList();
        this.d = emptyProtobufList();
        emptyProtobufList();
        this.e = emptyProtobufList();
        this.f = emptyProtobufList();
        this.g = emptyProtobufList();
        this.h = emptyProtobufList();
        this.i = emptyProtobufList();
        this.j = emptyProtobufList();
        this.k = emptyProtobufList();
        this.l = emptyProtobufList();
        this.m = emptyProtobufList();
        this.n = emptyProtobufList();
        emptyProtobufList();
        this.o = emptyProtobufList();
        this.p = emptyProtobufList();
        this.q = emptyProtobufList();
        this.r = emptyProtobufList();
        this.s = emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0012\u0000\u0000\u0001\u0016\u0012\u0000\u0012\u0012\u0001Л\u0002Л\u0005Л\u0007Л\bЛ\tЛ\nЛ\u000bЛ\fЛ\rЛ\u000eЛ\u000fЛ\u0010Л\u0012Л\u0013Л\u0014Л\u0015Л\u0016Л", new Object[]{"b", apzg.class, "c", apzg.class, "d", apzg.class, "e", apzg.class, "f", apzg.class, "g", apzg.class, "h", apbf.class, "i", apzg.class, "j", apzg.class, "k", apzg.class, "l", apzg.class, "m", apzg.class, "n", apzg.class, "o", apzg.class, "p", apzg.class, "q", apzg.class, "r", apzg.class, "s", apzg.class});
            case 3:
                return new apaj();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = t;
                if (aorbVar == null) {
                    synchronized (apaj.class) {
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
