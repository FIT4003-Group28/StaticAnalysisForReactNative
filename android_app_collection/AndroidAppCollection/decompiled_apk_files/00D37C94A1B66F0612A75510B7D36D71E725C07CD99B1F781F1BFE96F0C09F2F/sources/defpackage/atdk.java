package defpackage;
/* compiled from: PG */
/* renamed from: atdk  reason: default package */
/* loaded from: classes2.dex */
public final class atdk extends aopi implements aoqv {
    public static final atdk a;
    private static volatile aorb m;
    public int b;
    public int e;
    public atdg f;
    public atdg g;
    public aopu c = emptyProtobufList();
    public aopu d = emptyProtobufList();
    public aopu h = emptyProtobufList();
    public aopu i = emptyProtobufList();
    public aopu j = aopi.emptyProtobufList();
    public aopu k = aopi.emptyProtobufList();
    public aopu l = emptyProtobufList();

    static {
        atdk atdkVar = new atdk();
        a = atdkVar;
        aopi.registerDefaultInstance(atdk.class, atdkVar);
    }

    private atdk() {
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
                return newMessageInfo(a, "\u0001\n\u0000\u0001\u0001\u000f\n\u0000\u0007\u0000\u0001\u001b\u0002\u001b\u0003ဌ\u0000\u0004ဉ\u0001\bဉ\u0005\u000b\u001b\f\u001b\r\u001a\u000e\u001a\u000f\u001b", new Object[]{"b", "c", atdh.class, "d", atdh.class, "e", atck.t, "f", "g", "h", atdj.class, "i", atdi.class, "j", "k", "l", atdf.class});
            case 3:
                return new atdk();
            case 4:
                return new aopa((char[][][]) null, (short[]) null);
            case 5:
                return a;
            case 6:
                aorb aorbVar = m;
                if (aorbVar == null) {
                    synchronized (atdk.class) {
                        aorbVar = m;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            m = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
