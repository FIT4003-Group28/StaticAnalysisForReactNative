package defpackage;
/* compiled from: PG */
/* renamed from: atxr  reason: default package */
/* loaded from: classes2.dex */
public final class atxr extends aopi implements aoqv {
    public static final atxr a;
    private static volatile aorb b;
    private int c;
    private arag d;
    private arag e;
    private arag f;
    private arag g;
    private apzg h;
    private apmg i;
    private apmg j;
    private apmg k;
    private aoux l;
    private arag m;
    private arag n;
    private ates o;
    private byte p = 2;

    static {
        atxr atxrVar = new atxr();
        a = atxrVar;
        aopi.registerDefaultInstance(atxr.class, atxrVar);
    }

    private atxr() {
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
                return Byte.valueOf(this.p);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.p = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\f\u0000\u0001\u0003\u0012\f\u0000\u0000\f\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005\u0007ᐉ\u0006\tᐉ\n\u000bᐉ\f\fᐉ\b\u000eᐉ\u000e\u000fᐉ\u0007\u0010ᐉ\t\u0012ᐉ\u000f", new Object[]{"c", "d", "e", "f", "g", "h", "l", "m", "j", "n", "i", "k", "o"});
            case 3:
                return new atxr();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (atxr.class) {
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
