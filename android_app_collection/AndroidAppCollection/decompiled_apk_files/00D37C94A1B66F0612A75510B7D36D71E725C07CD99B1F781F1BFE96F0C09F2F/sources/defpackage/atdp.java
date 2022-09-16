package defpackage;
/* compiled from: PG */
/* renamed from: atdp  reason: default package */
/* loaded from: classes2.dex */
public final class atdp extends aopi implements aoqv {
    public static final atdp a;
    private static volatile aorb j;
    public int b;
    public atcq c;
    public int e;
    public int g;
    public boolean i;
    public String d = "";
    public String f = "";
    public String h = "";

    static {
        atdp atdpVar = new atdp();
        a = atdpVar;
        aopi.registerDefaultInstance(atdp.class, atdpVar);
    }

    private atdp() {
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
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004ဈ\u0003\u0005င\u0004\u0006ဈ\u0005\u0007ဇ\u0006", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i"});
            case 3:
                return new atdp();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = j;
                if (aorbVar == null) {
                    synchronized (atdp.class) {
                        aorbVar = j;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            j = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
