package defpackage;
/* compiled from: PG */
/* renamed from: argj  reason: default package */
/* loaded from: classes2.dex */
public final class argj extends aopi implements aoqv {
    public static final argj a;
    private static volatile aorb k;
    public int b;
    public argg d;
    public argh e;
    public long f;
    public argi g;
    public argk h;
    public argf i;
    private aoux l;
    private byte m = 2;
    public String c = "";
    public aopu j = emptyProtobufList();

    static {
        argj argjVar = new argj();
        a = argjVar;
        aopi.registerDefaultInstance(argj.class, argjVar);
    }

    private argj() {
        aoob aoobVar = aoob.b;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.m);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.m = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\n\t\u0000\u0001\u0003\u0001ဈ\u0000\u0002ᐉ\u0001\u0003ဉ\u0002\u0004ဂ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007Л\bဉ\u0006\nᐉ\b", new Object[]{"b", "c", "d", "e", "f", "g", "h", "j", apzg.class, "i", "l"});
            case 3:
                return new argj();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = k;
                if (aorbVar == null) {
                    synchronized (argj.class) {
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
