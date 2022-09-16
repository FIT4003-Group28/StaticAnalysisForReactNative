package defpackage;
/* compiled from: PG */
/* renamed from: avrl  reason: default package */
/* loaded from: classes2.dex */
public final class avrl extends aopi implements aoqv {
    public static final avrl a;
    private static volatile aorb b;
    private int c;
    private arag d;
    private arag e;
    private arag f;
    private arag g;
    private arag h;
    private ates i;
    private apzg j;
    private aplw k;
    private aplw l;
    private apzg m;
    private aplw n;
    private avry o;
    private aplw p;
    private aoux q;
    private byte r = 2;

    static {
        avrl avrlVar = new avrl();
        a = avrlVar;
        aopi.registerDefaultInstance(avrl.class, avrlVar);
    }

    private avrl() {
        emptyProtobufList();
        emptyProtobufList();
        aoob aoobVar = aoob.b;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.r);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.r = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u000e\u0000\u0001\u0003\u0017\u000e\u0000\u0000\u000e\u0003ᐉ\u0004\u0004ᐉ\u0005\u0005ᐉ\u0006\u0006ᐉ\n\bᐉ\u0014\fᐉ\f\rᐉ\u000e\u000eᐉ\r\u000fᐉ\u0007\u0010ᐉ\b\u0011ᐉ\t\u0014ᐉ\u0012\u0015ᐉ\u0010\u0017ᐉ\u000f", new Object[]{"c", "d", "e", "f", "j", "q", "k", "m", "l", "g", "h", "i", "p", "o", "n"});
            case 3:
                return new avrl();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (avrl.class) {
                        aorbVar = b;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            b = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
