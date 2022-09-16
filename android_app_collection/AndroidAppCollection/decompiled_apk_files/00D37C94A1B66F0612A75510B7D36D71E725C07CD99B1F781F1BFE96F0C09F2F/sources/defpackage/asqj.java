package defpackage;
/* compiled from: PG */
@Deprecated
/* renamed from: asqj  reason: default package */
/* loaded from: classes2.dex */
public final class asqj extends aopi implements aoqv {
    public static final asqj a;
    private static volatile aorb e;
    public apok d;
    private int f;
    private aoux g;
    private byte h = 2;
    public String b = "";
    public aopu c = emptyProtobufList();

    static {
        asqj asqjVar = new asqj();
        a = asqjVar;
        aopi.registerDefaultInstance(asqj.class, asqjVar);
    }

    private asqj() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0003\u0001ဈ\u0000\u0002Л\u0003ᐉ\u0001\u0004ᐉ\u0002", new Object[]{"f", "b", "c", asqi.class, "d", "g"});
            case 3:
                return new asqj();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (asqj.class) {
                        aorbVar = e;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            e = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
