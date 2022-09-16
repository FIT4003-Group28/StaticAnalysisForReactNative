package defpackage;
/* compiled from: PG */
/* renamed from: apai  reason: default package */
/* loaded from: classes.dex */
public final class apai extends aopi implements aoqv {
    public static final apai a;
    private static volatile aorb z;
    public aopu b = emptyProtobufList();
    public aopu c = emptyProtobufList();
    public aopu d = emptyProtobufList();
    public aopu e = emptyProtobufList();
    public aopu f = emptyProtobufList();
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
    public aopu t;
    public aopu u;
    public aopu v;
    public aopu w;
    public aopu x;
    public aopu y;

    static {
        apai apaiVar = new apai();
        a = apaiVar;
        aopi.registerDefaultInstance(apai.class, apaiVar);
    }

    private apai() {
        emptyProtobufList();
        this.g = emptyProtobufList();
        this.h = emptyProtobufList();
        this.i = emptyProtobufList();
        this.j = emptyProtobufList();
        this.k = emptyProtobufList();
        this.l = emptyProtobufList();
        this.m = emptyProtobufList();
        this.n = emptyProtobufList();
        this.o = emptyProtobufList();
        this.p = emptyProtobufList();
        emptyProtobufList();
        this.q = emptyProtobufList();
        this.r = emptyProtobufList();
        this.s = emptyProtobufList();
        this.t = emptyProtobufList();
        this.u = emptyProtobufList();
        this.v = emptyProtobufList();
        this.w = emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        this.x = emptyProtobufList();
        this.y = emptyProtobufList();
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        switch (aophVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0018\u0000\u0000\u0001\u001c\u0018\u0000\u0018\u0000\u0001\u001b\u0002\u001b\u0003\u001b\u0004\u001b\u0005\u001b\u0007\u001b\b\u001b\t\u001b\n\u001b\u000b\u001b\f\u001b\r\u001b\u000e\u001b\u0010\u001b\u0011\u001b\u0012\u001b\u0013\u001b\u0014\u001b\u0015\u001b\u0016\u001b\u0017\u001b\u0018\u001b\u001b\u001b\u001c\u001b", new Object[]{"b", apae.class, "c", apae.class, "d", apae.class, "e", apae.class, "f", apae.class, "g", apae.class, "h", apae.class, "i", apae.class, "j", apae.class, "k", apae.class, "l", apae.class, "m", apae.class, "p", apae.class, "n", apae.class, "q", apae.class, "o", apae.class, "r", apae.class, "s", apae.class, "t", apae.class, "u", apae.class, "v", apae.class, "w", apae.class, "x", apae.class, "y", apae.class});
            case 3:
                return new apai();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = z;
                if (aorbVar == null) {
                    synchronized (apai.class) {
                        aorbVar = z;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            z = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
