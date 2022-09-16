package defpackage;
/* compiled from: PG */
/* renamed from: auqh  reason: default package */
/* loaded from: classes2.dex */
public final class auqh extends aopi implements aoqv {
    public static final auqh a;
    public static final aopg b;
    private static volatile aorb r;
    public int c;
    public auqi f;
    public auqg g;
    public auqe h;
    public boolean i;
    public auqf j;
    public aunb k;
    public auqd n;
    public int o;
    public int q;
    private aoux s;
    private byte t = 2;
    public aopu d = emptyProtobufList();
    public aopu e = emptyProtobufList();
    public String l = "";
    public aoob m = aoob.b;
    public String p = "";

    static {
        auqh auqhVar = new auqh();
        a = auqhVar;
        aopi.registerDefaultInstance(auqh.class, auqhVar);
        b = aopi.newSingularGeneratedExtension(auna.a, auqhVar, auqhVar, null, 49399797, aosj.MESSAGE, auqh.class);
    }

    private auqh() {
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
                return newMessageInfo(a, "\u0001\u000f\u0000\u0001\u0001\u0013\u000f\u0000\u0002\t\u0001Л\u0002Л\u0003ᐉ\u0007\u0004ည\b\u0005ᐉ\u0000\u0006ᐉ\u0001\u0007ᐉ\u0004\bᐉ\u0002\tဇ\u0003\rဈ\u0006\u000fᐉ\r\u0010ဌ\u000e\u0011ဈ\u000f\u0012ဌ\u0010\u0013ᐉ\u0005", new Object[]{"c", "d", auqk.class, "e", auqj.class, "s", "m", "f", "g", "j", "h", "i", "l", "n", "o", aupm.e, "p", "q", aupm.f, "k"});
            case 3:
                return new auqh();
            case 4:
                return new aopa((float[][][]) null, (float[]) null);
            case 5:
                return a;
            case 6:
                aorb aorbVar = r;
                if (aorbVar == null) {
                    synchronized (auqh.class) {
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
