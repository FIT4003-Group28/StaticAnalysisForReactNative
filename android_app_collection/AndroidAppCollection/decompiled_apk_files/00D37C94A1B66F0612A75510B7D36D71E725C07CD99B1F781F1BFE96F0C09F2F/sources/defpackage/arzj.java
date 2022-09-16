package defpackage;
/* compiled from: PG */
/* renamed from: arzj  reason: default package */
/* loaded from: classes2.dex */
public final class arzj extends aopi implements aoqv {
    public static final arzj a;
    private static volatile aorb i;
    public int b;
    public int d;
    public int e;
    public int g;
    public int h;
    public String c = "";
    public aopu f = emptyProtobufList();

    static {
        arzj arzjVar = new arzj();
        a = arzjVar;
        aopi.registerDefaultInstance(arzj.class, arzjVar);
    }

    private arzj() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဋ\u0001\u0003ဋ\u0002\u0004\u001b\u0005ဋ\u0003\u0006ဋ\u0004", new Object[]{"b", "c", "d", "e", "f", arzl.class, "g", "h"});
            case 3:
                return new arzj();
            case 4:
                return new aopa((float[][][]) null, (char[]) null);
            case 5:
                return a;
            case 6:
                aorb aorbVar = i;
                if (aorbVar == null) {
                    synchronized (arzj.class) {
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
