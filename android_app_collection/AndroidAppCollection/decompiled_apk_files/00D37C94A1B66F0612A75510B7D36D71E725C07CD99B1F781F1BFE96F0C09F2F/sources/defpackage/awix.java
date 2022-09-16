package defpackage;
/* compiled from: PG */
/* renamed from: awix  reason: default package */
/* loaded from: classes2.dex */
public final class awix extends aopd implements aope {
    public static final awix a;
    private static volatile aorb m;
    public int b;
    public arag c;
    public avhn d;
    public avhn e;
    public arhs f;
    public avhn g;
    public awiw h;
    public arag i;
    public awis j;
    private awit n;
    private arag o;
    private apok p;
    private apok q;
    private aoux r;
    private byte s = 2;
    public String k = "";

    static {
        awix awixVar = new awix();
        a = awixVar;
        aopi.registerDefaultInstance(awix.class, awixVar);
    }

    private awix() {
        emptyProtobufList();
        aoob aoobVar = aoob.b;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.s);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.s = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u000e\u0000\u0001\u0001\u0010\u000e\u0000\u0000\f\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0004\u0005ဉ\u0005\u0006ᐉ\u0006\u0007ᐉ\u0007\bᐉ\b\tဈ\t\nᐉ\r\rᐉ\u000b\u000eᐉ\f\u000fᐉ\n\u0010ᐉ\u0003", new Object[]{"b", "c", "d", "e", "g", "h", "i", "j", "n", "k", "r", "p", "q", "o", "f"});
            case 3:
                return new awix();
            case 4:
                return new aopc(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = m;
                if (aorbVar == null) {
                    synchronized (awix.class) {
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
