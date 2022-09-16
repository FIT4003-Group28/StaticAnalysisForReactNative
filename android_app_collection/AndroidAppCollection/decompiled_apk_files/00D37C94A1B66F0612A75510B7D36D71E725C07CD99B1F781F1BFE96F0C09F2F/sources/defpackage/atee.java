package defpackage;
/* compiled from: PG */
/* renamed from: atee  reason: default package */
/* loaded from: classes2.dex */
public final class atee extends aopi implements aoqv {
    public static final atee a;
    private static volatile aorb l;
    public int b;
    public arag c;
    public arhs d;
    public apok e;
    public avhn f;
    public avhn g;
    public avhn h;
    public aunb i;
    public aunb j;
    public aoob k;
    private apok m;
    private aunb n;
    private arag o;
    private aunb p;
    private aoux q;
    private byte r = 2;

    static {
        atee ateeVar = new atee();
        a = ateeVar;
        aopi.registerDefaultInstance(atee.class, ateeVar);
    }

    private atee() {
        emptyProtobufList();
        this.k = aoob.b;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.r);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.r = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u000e\u0000\u0001\u0001\u000f\u000e\u0000\u0000\r\u0001ᐉ\u0000\u0002ᐉ\u0001\u0004ᐉ\u0002\u0005ᐉ\f\u0006ည\r\u0007ᐉ\u0003\bᐉ\u0004\tᐉ\u0006\nᐉ\u0007\u000bᐉ\b\fᐉ\n\rᐉ\t\u000eᐉ\u0005\u000fᐉ\u000b", new Object[]{"b", "c", "d", "e", "q", "k", "f", "g", "h", "i", "j", "o", "n", "m", "p"});
            case 3:
                return new atee();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = l;
                if (aorbVar == null) {
                    synchronized (atee.class) {
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
