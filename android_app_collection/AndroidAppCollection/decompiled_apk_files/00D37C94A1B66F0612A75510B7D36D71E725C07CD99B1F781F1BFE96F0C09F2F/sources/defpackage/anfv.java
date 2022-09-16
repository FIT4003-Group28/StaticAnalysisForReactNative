package defpackage;
/* compiled from: PG */
/* renamed from: anfv  reason: default package */
/* loaded from: classes.dex */
public final class anfv extends aopi implements aoqv {
    public static final anfv a;
    private static volatile aorb e;
    public int b;
    public aopu c = emptyProtobufList();
    public boolean d;

    static {
        anfv anfvVar = new anfv();
        a = anfvVar;
        aopi.registerDefaultInstance(anfv.class, anfvVar);
    }

    private anfv() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဇ\u0000", new Object[]{"b", "c", anfw.class, "d"});
            case 3:
                return new anfv();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (anfv.class) {
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
