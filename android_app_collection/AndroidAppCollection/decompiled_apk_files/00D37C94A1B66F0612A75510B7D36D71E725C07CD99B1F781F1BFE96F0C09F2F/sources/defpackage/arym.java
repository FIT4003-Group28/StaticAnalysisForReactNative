package defpackage;
/* compiled from: PG */
/* renamed from: arym  reason: default package */
/* loaded from: classes2.dex */
public final class arym extends aopi implements aoqv {
    public static final arym a;
    private static volatile aorb i;
    public int b;
    public long d;
    public boolean f;
    public long g;
    public long h;
    public String c = "";
    public aopu e = aopi.emptyProtobufList();

    static {
        arym arymVar = new arym();
        a = arymVar;
        aopi.registerDefaultInstance(arym.class, arymVar);
    }

    private arym() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003\u001a\u0004ဇ\u0002\u0005ဂ\u0003\u0006ဂ\u0004", new Object[]{"b", "c", "d", "e", "f", "g", "h"});
            case 3:
                return new arym();
            case 4:
                return new aopa((boolean[]) null, (int[][]) null);
            case 5:
                return a;
            case 6:
                aorb aorbVar = i;
                if (aorbVar == null) {
                    synchronized (arym.class) {
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
