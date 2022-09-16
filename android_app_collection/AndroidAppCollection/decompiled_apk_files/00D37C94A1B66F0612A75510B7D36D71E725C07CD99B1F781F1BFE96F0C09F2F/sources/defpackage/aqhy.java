package defpackage;
/* compiled from: PG */
/* renamed from: aqhy  reason: default package */
/* loaded from: classes2.dex */
public final class aqhy extends aopi implements aoqv {
    public static final aqhy a;
    private static volatile aorb b;
    private int c;
    private arag d;
    private ates e;
    private aqhm f;
    private aqho g;
    private arag h;
    private arag i;
    private aqhi j;
    private aqhl k;
    private aoux l;
    private apzg m;
    private apzg n;
    private arag o;
    private arag p;
    private apzg q;
    private byte r = 2;

    static {
        aqhy aqhyVar = new aqhy();
        a = aqhyVar;
        aopi.registerDefaultInstance(aqhy.class, aqhyVar);
    }

    private aqhy() {
        aoob aoobVar = aoob.b;
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u000e\u0000\u0001\u0002\u001a\u000e\u0000\u0000\u000e\u0002ᐉ\u0004\u0005ᐉ\t\u0006ᐉ\n\bᐉ\r\tᐉ\u0006\u000bᐉ\u000f\fᐉ\u0010\rᐉ\u0011\u000fᐉ\u0013\u0010ᐉ\u000b\u0013ᐉ\u0007\u0014ᐉ\f\u0018ᐉ\u0016\u001aᐉ\u0017", new Object[]{"c", "d", "g", "h", "k", "e", "l", "m", "n", "o", "i", "f", "j", "p", "q"});
            case 3:
                return new aqhy();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (aqhy.class) {
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
