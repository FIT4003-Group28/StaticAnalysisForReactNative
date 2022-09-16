package defpackage;
/* compiled from: PG */
/* renamed from: aqaj  reason: default package */
/* loaded from: classes2.dex */
public final class aqaj extends aopi implements aoqv {
    public static final aqaj a;
    private static volatile aorb e;
    public int b;
    private byte f = 2;
    public String c = "";
    public aopu d = emptyProtobufList();

    static {
        aqaj aqajVar = new aqaj();
        a = aqajVar;
        aopi.registerDefaultInstance(aqaj.class, aqajVar);
    }

    private aqaj() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001ဈ\u0000\u0002Л", new Object[]{"b", "c", "d", aqup.class});
            case 3:
                return new aqaj();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (aqaj.class) {
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
