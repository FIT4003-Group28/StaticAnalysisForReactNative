package defpackage;
/* compiled from: PG */
/* renamed from: argv  reason: default package */
/* loaded from: classes2.dex */
public final class argv extends aopd implements aope {
    public static final argv a;
    private static volatile aorb k;
    public int b;
    public argt c;
    public argu e;
    public argw f;
    public args g;
    public aunb h;
    private aunb m;
    private aunb n;
    private aoxw o;
    private aoux p;
    private byte q = 2;
    public aopu d = emptyProtobufList();
    public aopu i = emptyProtobufList();
    public aoob j = aoob.b;

    static {
        argv argvVar = new argv();
        a = argvVar;
        aopi.registerDefaultInstance(argv.class, argvVar);
    }

    private argv() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.q);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.q = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\f\u0000\u0001\u0001\u000f\f\u0000\u0002\n\u0001Л\u0002ည\u000b\u0003ᐉ\f\u0004ᐉ\u0000\u0005ᐉ\u0001\u0006ဉ\u0002\tᐉ\u0005\nᐉ\u0007\u000bᐉ\b\fᐉ\u0006\rЛ\u000fᐉ\n", new Object[]{"b", "d", argx.class, "j", "p", "c", "e", "f", "g", "m", "n", "h", "i", apzg.class, "o"});
            case 3:
                return new argv();
            case 4:
                return new aopc(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = k;
                if (aorbVar == null) {
                    synchronized (argv.class) {
                        aorbVar = k;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            k = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
