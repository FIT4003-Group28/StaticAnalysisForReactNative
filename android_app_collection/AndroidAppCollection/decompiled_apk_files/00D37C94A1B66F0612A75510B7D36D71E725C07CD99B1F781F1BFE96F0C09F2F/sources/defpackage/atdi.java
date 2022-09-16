package defpackage;
/* compiled from: PG */
/* renamed from: atdi  reason: default package */
/* loaded from: classes2.dex */
public final class atdi extends aopi implements aoqv {
    public static final aopr a = new asvu(2);
    public static final atdi b;
    private static volatile aorb e;
    public aopq c = emptyIntList();
    public aopu d = emptyProtobufList();

    static {
        atdi atdiVar = new atdi();
        b = atdiVar;
        aopi.registerDefaultInstance(atdi.class, atdiVar);
    }

    private atdi() {
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
                return newMessageInfo(b, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001e\u0002\u001b", new Object[]{"c", atcl.a(), "d", atdg.class});
            case 3:
                return new atdi();
            case 4:
                return new aopa((float[][]) null, (byte[]) null);
            case 5:
                return b;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (atdi.class) {
                        aorbVar = e;
                        if (aorbVar == null) {
                            aorbVar = new aopb(b);
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
