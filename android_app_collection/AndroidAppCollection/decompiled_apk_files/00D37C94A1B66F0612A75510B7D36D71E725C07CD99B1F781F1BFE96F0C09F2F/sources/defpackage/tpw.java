package defpackage;
/* compiled from: PG */
/* renamed from: tpw  reason: default package */
/* loaded from: classes4.dex */
public final class tpw extends aopi implements aoqv {
    public static final tpw a;
    private static volatile aorb h;
    public int b;
    public int e;
    public tpx f;
    public String c = "";
    public String d = "";
    public aopu g = emptyProtobufList();

    static {
        tpw tpwVar = new tpw();
        a = tpwVar;
        aopi.registerDefaultInstance(tpw.class, tpwVar);
    }

    private tpw() {
        emptyProtobufList();
        aopi.emptyProtobufList();
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        switch (aophVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\r\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0006ဈ\u0001\nင\u0002\rဉ\n", new Object[]{"b", "c", "g", tpv.class, "d", "e", "f"});
            case 3:
                return new tpw();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (tpw.class) {
                        aorbVar = h;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            h = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
