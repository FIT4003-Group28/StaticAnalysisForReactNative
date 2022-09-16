package defpackage;
/* compiled from: PG */
/* renamed from: avtd  reason: default package */
/* loaded from: classes2.dex */
public final class avtd extends aopi implements aoqv {
    public static final avtd a;
    public static final aopg b;
    private static volatile aorb d;
    public apzg c;
    private int e;
    private byte f = 2;

    static {
        avtd avtdVar = new avtd();
        a = avtdVar;
        aopi.registerDefaultInstance(avtd.class, avtdVar);
        b = aopi.newSingularGeneratedExtension(awmt.a, avtdVar, avtdVar, null, 383499401, aosj.MESSAGE, avtd.class);
    }

    private avtd() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.f = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"e", "c"});
            case 3:
                return new avtd();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (avtd.class) {
                        aorbVar = d;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            d = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
