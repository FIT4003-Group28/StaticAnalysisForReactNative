package defpackage;
/* compiled from: PG */
/* renamed from: arny  reason: default package */
/* loaded from: classes2.dex */
public final class arny extends aopi implements aoqv {
    public static final arny a;
    private static volatile aorb l;
    public int b;
    public Object d;
    public aroy e;
    public long i;
    public long j;
    public aufp k;
    public int c = 0;
    private byte m = 2;
    public String f = "";
    public String g = "";
    public String h = "";

    static {
        arny arnyVar = new arny();
        a = arnyVar;
        aopi.registerDefaultInstance(arny.class, arnyVar);
    }

    private arny() {
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
                return newMessageInfo(a, "\u0001\u0010\u0001\u0001\u0001\u0014\u0010\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0007ြ\u0000\bြ\u0000\tြ\u0000\nြ\u0000\fဈ\u0005\rြ\u0000\u000eြ\u0000\u000fြ\u0000\u0010ဂ\u000f\u0011ဂ\u0010\u0012ြ\u0000\u0013ဉ\u0011\u0014ြ\u0000", new Object[]{"d", "c", "b", "e", "f", "g", arnp.class, arnn.class, arnk.class, arnl.class, "h", arnm.class, arnj.class, arno.class, "i", "j", aufu.class, "k", auga.class});
            case 3:
                return new arny();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = l;
                if (aorbVar == null) {
                    synchronized (arny.class) {
                        aorbVar = l;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            l = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
