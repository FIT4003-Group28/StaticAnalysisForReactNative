package defpackage;
/* compiled from: PG */
/* renamed from: apnt  reason: default package */
/* loaded from: classes.dex */
public final class apnt extends aopi implements aoqv {
    public static final apnt a;
    private static volatile aorb f;
    public aunb b;
    public aunb c;
    public aunb d;
    public aunb e;
    private int g;
    private apzg h;
    private arag i;
    private byte j = 2;

    static {
        apnt apntVar = new apnt();
        a = apntVar;
        aopi.registerDefaultInstance(apnt.class, apntVar);
    }

    private apnt() {
        emptyProtobufList();
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.j);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.j = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0006\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0007ᐉ\u0006", new Object[]{"g", "h", "b", "c", "d", "e", "i"});
            case 3:
                return new apnt();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (apnt.class) {
                        aorbVar = f;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            f = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
