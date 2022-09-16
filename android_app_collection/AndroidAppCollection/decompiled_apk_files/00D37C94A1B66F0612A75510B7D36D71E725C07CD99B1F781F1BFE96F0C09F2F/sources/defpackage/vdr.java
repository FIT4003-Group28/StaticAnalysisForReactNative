package defpackage;
/* compiled from: PG */
/* renamed from: vdr  reason: default package */
/* loaded from: classes4.dex */
public final class vdr extends aopi implements aoqv {
    public static final vdr a;
    private static volatile aorb i;
    public int b;
    public long f;
    public long g;
    public String c = "";
    public aoob d = aoob.b;
    public String e = "";
    public aopu h = emptyProtobufList();

    static {
        vdr vdrVar = new vdr();
        a = vdrVar;
        aopi.registerDefaultInstance(vdr.class, vdrVar);
    }

    private vdr() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005\u001b\u0006ဂ\u0004", new Object[]{"b", "c", "d", "e", "f", "h", vds.class, "g"});
            case 3:
                return new vdr();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = i;
                if (aorbVar == null) {
                    synchronized (vdr.class) {
                        aorbVar = i;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            i = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
