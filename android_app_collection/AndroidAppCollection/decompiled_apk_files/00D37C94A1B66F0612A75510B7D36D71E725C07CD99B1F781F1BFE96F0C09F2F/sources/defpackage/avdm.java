package defpackage;
/* compiled from: PG */
/* renamed from: avdm  reason: default package */
/* loaded from: classes2.dex */
public final class avdm extends aopi implements aoqv {
    public static final avdm a;
    private static volatile aorb d;
    public int c;
    private int e;
    private byte f = 2;
    public aopu b = emptyProtobufList();

    static {
        avdm avdmVar = new avdm();
        a = avdmVar;
        aopi.registerDefaultInstance(avdm.class, avdmVar);
    }

    private avdm() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001Л\u0002ဌ\u0000", new Object[]{"e", "b", avdr.class, "c", avcd.f});
            case 3:
                return new avdm();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (avdm.class) {
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
