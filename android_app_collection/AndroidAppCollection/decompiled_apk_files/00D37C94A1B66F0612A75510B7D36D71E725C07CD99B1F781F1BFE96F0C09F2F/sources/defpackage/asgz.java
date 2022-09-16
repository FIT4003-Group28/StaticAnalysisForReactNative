package defpackage;
/* compiled from: PG */
/* renamed from: asgz  reason: default package */
/* loaded from: classes2.dex */
public final class asgz extends aopi implements aoqv {
    public static final asgz a;
    private static volatile aorb d;
    public arpa b;
    private int e;
    private aunb f;
    private aoux g;
    private byte h = 2;
    public aopu c = emptyProtobufList();

    static {
        asgz asgzVar = new asgz();
        a = asgzVar;
        aopi.registerDefaultInstance(asgz.class, asgzVar);
    }

    private asgz() {
        aoob aoobVar = aoob.b;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.h = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0001\u0004\u0001ᐉ\u0000\u0002Л\u0004ᐉ\u0001\u0005ᐉ\u0003", new Object[]{"e", "b", "c", apzg.class, "f", "g"});
            case 3:
                return new asgz();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (asgz.class) {
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
