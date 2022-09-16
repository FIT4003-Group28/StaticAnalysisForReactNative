package defpackage;
/* compiled from: PG */
/* renamed from: asfp  reason: default package */
/* loaded from: classes2.dex */
public final class asfp extends aopi implements aoqv {
    public static final asfp a;
    private static volatile aorb q;
    public int b;
    public arpa c;
    public aunb e;
    public avyp f;
    public boolean g;
    public int h;
    public apzg i;
    public asfo k;
    public arxj l;
    public apzg m;
    public boolean n;
    public asfq o;
    private arbf r;
    private aoux s;
    private byte t = 2;
    public aopu d = emptyProtobufList();
    public String j = "";
    public aoob p = aoob.b;

    static {
        asfp asfpVar = new asfp();
        a = asfpVar;
        aopi.registerDefaultInstance(asfp.class, asfpVar);
    }

    private asfp() {
    }

    public final void a() {
        aopu aopuVar = this.d;
        if (!aopuVar.c()) {
            this.d = aopi.mutableCopy(aopuVar);
        }
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
                return newMessageInfo(a, "\u0001\u0010\u0000\u0001\u0001̉\u0010\u0000\u0001\t\u0001ᐉ\u0000\u0003Л\u0004ᐉ\u0002\u0005ဇ\u0003\u0006င\u0004\u0007ᐉ\u0005\bဉ\b\tဈ\u0006\nᐉ\t\u000bဇ\n\fᐉ\r\rည\u000e\u000eᐉ\u0001\u000fᐉ\u000b\u0010ဉ\u0007̉ᐉ\f", new Object[]{"b", "c", "d", asfq.class, "f", "g", "h", "i", "l", "j", "m", "n", "s", "p", "e", "o", "k", "r"});
            case 3:
                return new asfp();
            case 4:
                return new aopa((boolean[][][]) null, (char[]) null);
            case 5:
                return a;
            case 6:
                aorb aorbVar = q;
                if (aorbVar == null) {
                    synchronized (asfp.class) {
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
