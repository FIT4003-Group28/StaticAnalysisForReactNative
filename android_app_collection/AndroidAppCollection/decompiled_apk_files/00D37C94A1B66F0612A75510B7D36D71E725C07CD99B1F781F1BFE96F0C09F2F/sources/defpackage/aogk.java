package defpackage;
/* compiled from: PG */
/* renamed from: aogk  reason: default package */
/* loaded from: classes.dex */
public final class aogk extends aopi implements aoqv {
    public static final aogk a;
    private static volatile aorb e;
    public int b;
    public aogl d;
    private byte f = 2;
    public aopu c = emptyProtobufList();

    static {
        aogk aogkVar = new aogk();
        a = aogkVar;
        aopi.registerDefaultInstance(aogk.class, aogkVar);
    }

    private aogk() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0001\u0001\u0002\u001b\u0003ᐉ\u0001", new Object[]{"b", "c", aogj.class, "d"});
            case 3:
                return new aogk();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (aogk.class) {
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
