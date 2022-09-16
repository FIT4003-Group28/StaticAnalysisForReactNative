package defpackage;
/* compiled from: PG */
/* renamed from: auyf  reason: default package */
/* loaded from: classes2.dex */
public final class auyf extends aopi implements aoqv {
    public static final auyf a;
    private static volatile aorb g;
    public int b;
    public arag c;
    public int e;
    public boolean f;
    private byte h = 2;
    public aopu d = emptyProtobufList();

    static {
        auyf auyfVar = new auyf();
        a = auyfVar;
        aopi.registerDefaultInstance(auyf.class, auyfVar);
    }

    private auyf() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.h = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0002\u0001ᐉ\u0000\u0002Л\u0003ဌ\u0001\u0004ဇ\u0002", new Object[]{"b", "c", "d", aunb.class, "e", auwh.h, "f"});
            case 3:
                return new auyf();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (auyf.class) {
                        aorbVar = g;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            g = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
