package defpackage;
/* compiled from: PG */
/* renamed from: vcd  reason: default package */
/* loaded from: classes4.dex */
public final class vcd extends aopi implements aoqv {
    public static final vcd a;
    private static volatile aorb e;
    public int b;
    public aopu c = aopi.emptyProtobufList();
    public String d = "";

    static {
        vcd vcdVar = new vcd();
        a = vcdVar;
        aopi.registerDefaultInstance(vcd.class, vcdVar);
    }

    private vcd() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001a\u0002ဈ\u0000", new Object[]{"b", "c", "d"});
            case 3:
                return new vcd();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (vcd.class) {
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
