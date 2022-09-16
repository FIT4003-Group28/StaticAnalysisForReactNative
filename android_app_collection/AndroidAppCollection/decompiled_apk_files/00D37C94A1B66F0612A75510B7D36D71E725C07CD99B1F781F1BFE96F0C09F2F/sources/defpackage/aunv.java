package defpackage;
/* compiled from: PG */
/* renamed from: aunv  reason: default package */
/* loaded from: classes2.dex */
public final class aunv extends aopi implements aoqv {
    public static final aunv a;
    private static volatile aorb p;
    public int b;
    public aopu c = aopi.emptyProtobufList();
    public aopu d = aopi.emptyProtobufList();
    public aopu e = aopi.emptyProtobufList();
    public int f;
    public int g;
    public boolean h;
    public boolean i;
    public boolean j;
    public int k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;

    static {
        aunv aunvVar = new aunv();
        a = aunvVar;
        aopi.registerDefaultInstance(aunv.class, aunvVar);
    }

    private aunv() {
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
                return newMessageInfo(a, "\u0001\r\u0000\u0001\u0001\u0013\r\u0000\u0003\u0000\u0001\u001a\u0002င\u0000\u0003င\u0001\u0004ဇ\u0003\u0006ဇ\u0006\u0007ဇ\u0007\u000bဇ\r\rင\t\u000f\u001a\u0010ဇ\u000e\u0011ဇ\n\u0012ဇ\u000f\u0013\u001a", new Object[]{"b", "c", "f", "g", "h", "i", "j", "m", "k", "d", "n", "l", "o", "e"});
            case 3:
                return new aunv();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = p;
                if (aorbVar == null) {
                    synchronized (aunv.class) {
                        aorbVar = p;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            p = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
