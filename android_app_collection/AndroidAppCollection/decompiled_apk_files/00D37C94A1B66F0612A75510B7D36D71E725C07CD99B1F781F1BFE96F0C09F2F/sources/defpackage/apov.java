package defpackage;
/* compiled from: PG */
/* renamed from: apov  reason: default package */
/* loaded from: classes2.dex */
public final class apov extends aopi implements aoqv {
    public static final apov a;
    private static volatile aorb e;
    public int b;
    public arag d;
    private aoux f;
    private byte g = 2;
    public aopu c = emptyProtobufList();

    static {
        apov apovVar = new apov();
        a = apovVar;
        aopi.registerDefaultInstance(apov.class, apovVar);
    }

    private apov() {
        aoob aoobVar = aoob.b;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.g = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0003\u0001Л\u0002ᐉ\u0000\u0004ᐉ\u0002", new Object[]{"b", "c", apou.class, "d", "f"});
            case 3:
                return new apov();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (apov.class) {
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
