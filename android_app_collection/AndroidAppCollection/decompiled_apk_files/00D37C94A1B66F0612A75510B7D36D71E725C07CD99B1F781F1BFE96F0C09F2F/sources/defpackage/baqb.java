package defpackage;
/* compiled from: PG */
/* renamed from: baqb  reason: default package */
/* loaded from: classes2.dex */
public final class baqb extends aopi implements aoqv {
    public static final baqb a;
    private static volatile aorb i;
    public aoqp b = aoqp.a;
    public aoqp c = aoqp.a;
    public aopu d = emptyProtobufList();
    public aopt e = emptyLongList();
    public aopq f = emptyIntList();
    public aopq g = emptyIntList();
    public aopt h = emptyLongList();

    static {
        baqb baqbVar = new baqb();
        a = baqbVar;
        aopi.registerDefaultInstance(baqb.class, baqbVar);
    }

    private baqb() {
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
                return newMessageInfo(a, "\u0001\u0007\u0000\u0000\u0002\n\u0007\u0002\u0005\u0000\u00022\u00032\u0006\u001b\u0007%\b'\t'\n%", new Object[]{"b", bapz.a, "c", baqa.a, "d", bapx.class, "e", "f", "g", "h"});
            case 3:
                return new baqb();
            case 4:
                return new aopa((float[]) null, (short[]) null);
            case 5:
                return a;
            case 6:
                aorb aorbVar = i;
                if (aorbVar == null) {
                    synchronized (baqb.class) {
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
