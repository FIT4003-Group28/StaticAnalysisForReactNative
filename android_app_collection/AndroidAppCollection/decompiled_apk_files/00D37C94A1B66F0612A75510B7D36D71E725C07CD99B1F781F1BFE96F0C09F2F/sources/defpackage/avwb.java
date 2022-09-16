package defpackage;
/* compiled from: PG */
/* renamed from: avwb  reason: default package */
/* loaded from: classes2.dex */
public final class avwb extends aopi implements aoqv {
    public static final avwb a;
    private static volatile aorb f;
    public int c;
    public boolean d;
    public boolean e;
    private int g;
    private byte h = 2;
    public aopu b = emptyProtobufList();

    static {
        avwb avwbVar = new avwb();
        a = avwbVar;
        aopi.registerDefaultInstance(avwb.class, avwbVar);
    }

    private avwb() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0001\u0001Л\u0002င\u0000\u0003ဇ\u0001\u0004ဇ\u0002", new Object[]{"g", "b", avwa.class, "c", "d", "e"});
            case 3:
                return new avwb();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (avwb.class) {
                        aorbVar = f;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            f = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
