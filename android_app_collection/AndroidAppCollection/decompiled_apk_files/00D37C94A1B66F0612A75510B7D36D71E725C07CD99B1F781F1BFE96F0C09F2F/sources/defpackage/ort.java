package defpackage;
/* compiled from: PG */
/* renamed from: ort  reason: default package */
/* loaded from: classes4.dex */
public final class ort extends aopi implements aoqv {
    public static final ort a;
    private static volatile aorb r;
    public int b;
    public int d;
    public long i;
    public long k;
    public int l;
    public long m;
    public long n;
    public long o;
    public String c = "";
    public String e = "";
    public aopu f = emptyProtobufList();
    public aopq g = emptyIntList();
    public aoob h = aoob.b;
    public String j = "";
    public aopt p = emptyLongList();
    public String q = "";

    static {
        ort ortVar = new ort();
        a = ortVar;
        aopi.registerDefaultInstance(ort.class, ortVar);
    }

    private ort() {
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
                return newMessageInfo(a, "\u0001\u000f\u0000\u0001\u0001\u0010\u000f\u0000\u0003\u0000\u0001ဈ\u0000\u0003င\u0002\u0004ဈ\u0003\u0005\u001b\u0006ည\u0004\u0007ဂ\u0005\bဈ\u0006\tဂ\u0007\nင\b\u000bဂ\t\fဂ\n\rဂ\u000b\u000e\u0014\u000fဈ\f\u0010\u0016", new Object[]{"b", "c", "d", "e", "f", orp.class, "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "g"});
            case 3:
                return new ort();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = r;
                if (aorbVar == null) {
                    synchronized (ort.class) {
                        aorbVar = r;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            r = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
