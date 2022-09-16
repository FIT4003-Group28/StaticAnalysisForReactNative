package defpackage;
/* compiled from: PG */
/* renamed from: atrk  reason: default package */
/* loaded from: classes2.dex */
public final class atrk extends aopi implements aoqv {
    public static final atrk a;
    private static volatile aorb l;
    public int b;
    public int c;
    public int e;
    public int f;
    public boolean g;
    public atrl h;
    public long j;
    public long k;
    public String d = "";
    public aopu i = emptyProtobufList();

    static {
        atrk atrkVar = new atrk();
        a = atrkVar;
        aopi.registerDefaultInstance(atrk.class, atrkVar);
    }

    private atrk() {
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
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0001\u0000\u0001င\u0000\u0002ဌ\u0003\u0003ဇ\u0004\u0004ဉ\u0005\u0005\u001b\u0006ဌ\u0002\u0007ဈ\u0001\bဂ\u0006\tဂ\u0007", new Object[]{"b", "c", "f", atqy.g, "g", "h", "i", atrl.class, "e", atqy.h, "d", "j", "k"});
            case 3:
                return new atrk();
            case 4:
                return new aopa((short[][][]) null, (boolean[][]) null);
            case 5:
                return a;
            case 6:
                aorb aorbVar = l;
                if (aorbVar == null) {
                    synchronized (atrk.class) {
                        aorbVar = l;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            l = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
