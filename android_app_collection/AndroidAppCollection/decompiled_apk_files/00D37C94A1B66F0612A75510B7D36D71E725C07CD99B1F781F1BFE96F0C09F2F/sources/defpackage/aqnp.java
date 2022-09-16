package defpackage;
/* compiled from: PG */
/* renamed from: aqnp  reason: default package */
/* loaded from: classes2.dex */
public final class aqnp extends aopi implements aoqv {
    public static final aqnp a;
    private static volatile aorb n;
    public int b;
    public boolean h;
    public aqnm i;
    public aqno l;
    public aqno m;
    public String c = "";
    public aopu d = emptyProtobufList();
    public aopu e = emptyProtobufList();
    public String f = "";
    public String g = "";
    public String j = "";
    public aopu k = emptyProtobufList();

    static {
        aqnp aqnpVar = new aqnp();
        a = aqnpVar;
        aopi.registerDefaultInstance(aqnp.class, aqnpVar);
    }

    private aqnp() {
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
                return newMessageInfo(a, "\u0001\u000b\u0000\u0001\u0001\u000e\u000b\u0000\u0003\u0000\u0001ဈ\u0000\u0002\u001b\u0003\u001b\u0004ဈ\u0001\u0005ဈ\u0002\u0006ဇ\u0003\bဉ\u0005\tဈ\u0006\f\u001b\rဉ\t\u000eဉ\n", new Object[]{"b", "c", "d", aqnl.class, "e", aqnh.class, "f", "g", "h", "i", "j", "k", aqnn.class, "l", "m"});
            case 3:
                return new aqnp();
            case 4:
                return new aopa((char[]) null, (int[]) null);
            case 5:
                return a;
            case 6:
                aorb aorbVar = n;
                if (aorbVar == null) {
                    synchronized (aqnp.class) {
                        aorbVar = n;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            n = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
