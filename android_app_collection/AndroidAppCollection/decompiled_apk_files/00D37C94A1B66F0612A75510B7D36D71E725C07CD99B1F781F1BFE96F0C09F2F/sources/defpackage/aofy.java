package defpackage;
/* compiled from: PG */
/* renamed from: aofy  reason: default package */
/* loaded from: classes.dex */
public final class aofy extends aopi implements aoqv {
    public static final aofy a;
    private static volatile aorb i;
    public aofx b;
    public String c = "";
    public aopu d = aopi.emptyProtobufList();
    public aopu e = aopi.emptyProtobufList();
    public aopq f = emptyIntList();
    public String g = "";
    public int h;
    private boolean j;

    static {
        aofy aofyVar = new aofy();
        a = aofyVar;
        aopi.registerDefaultInstance(aofy.class, aofyVar);
    }

    private aofy() {
        aoob aoobVar = aoob.b;
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
                return newMessageInfo(a, "\u0000\b\u0000\u0000\u0001\t\b\u0000\u0003\u0000\u0001\t\u0002Ȉ\u0003Ț\u0004,\u0005Ț\u0006Ȉ\b\u0007\t\f", new Object[]{"b", "c", "d", "f", "e", "g", "j", "h"});
            case 3:
                return new aofy();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = i;
                if (aorbVar == null) {
                    synchronized (aofy.class) {
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
