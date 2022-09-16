package defpackage;
/* compiled from: PG */
/* renamed from: atat  reason: default package */
/* loaded from: classes2.dex */
public final class atat extends aopi implements aoqv {
    public static final atat a;
    private static volatile aorb m;
    public int b;
    public arag c;
    public arag d;
    public arag e;
    public avhn f;
    public boolean h;
    public arag i;
    public apzg j;
    public arag k;
    public apzg l;
    private arag n;
    private arag o;
    private arag p;
    private arag q;
    private arag r;
    private aunb s;
    private byte t = 2;
    public aopu g = emptyProtobufList();

    static {
        atat atatVar = new atat();
        a = atatVar;
        aopi.registerDefaultInstance(atat.class, atatVar);
    }

    private atat() {
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
                return newMessageInfo(a, "\u0001\u0010\u0000\u0001\u0002\u0013\u0010\u0000\u0001\u000f\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005\u0007ᐉ\u0006\bᐉ\u0007\tᐉ\t\nЛ\fᐉ\b\u000eဇ\f\u000fᐉ\r\u0010ᐉ\u000e\u0011ᐉ\u000f\u0012ᐉ\u0010\u0013ᐉ\u0011", new Object[]{"b", "c", "d", "n", "o", "p", "q", "r", "f", "g", avhn.class, "e", "h", "i", "j", "k", "s", "l"});
            case 3:
                return new atat();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = m;
                if (aorbVar == null) {
                    synchronized (atat.class) {
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
